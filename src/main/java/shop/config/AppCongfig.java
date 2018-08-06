package shop.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration//生名组件
@ComponentScan(basePackages="shop")//扫描顶层包
@EnableWebMvc //����web mvc������ʩ֧��
@MapperScan("shop.mapper")//扫描mapper包
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement //开启事务支持
@EnableScheduling//开启调度支持
@EnableAsync//开启异步执行任务支持
public class AppCongfig extends WebMvcConfigurerAdapter{
	@Override//��д    
	//��д configigureVieweRsolvers����
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/jsp/", ".jsp");//����ǰjsp·����ǰ׺�ͺ�׺
	}
	
	@Override//�羲̬ҳ��css
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	    // ��springmvc����û�п�����ӳ���·��ʱ����webapp�µľ�̬��Դ��������Ĭ�ϵ�servlet����
	    configurer.enable(); 
	}
	
	@Bean
	public DataSource dataSource(Environment env) {
		DriverManagerDataSource dmd=new DriverManagerDataSource(
				env.getProperty("jdbc.url"),
				env.getProperty("jdbc.username"),
				env.getProperty("jdbc.password"));
		dmd.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		return dmd;
	}
	@Bean
	public SqlSessionFactoryBean bean(DataSource dataSource) {
		SqlSessionFactoryBean sqlbean=new SqlSessionFactoryBean();
		sqlbean.setConfigLocation(new ClassPathResource("shop/mybatis-config.xml"));
		sqlbean.setDataSource(dataSource);
		return sqlbean;
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return	 new BCryptPasswordEncoder();
		 
	}
	// spring������Ҫ���������������������ύ��ع�����
		@Bean//事务的支持
		public PlatformTransactionManager transactionManager(DataSource dataSource) {
		    // ����������mybatisЭ����ʵ���࣬���õ���hibernate��JPA����ôʵ���಻һ��
		    return new DataSourceTransactionManager(dataSource);
		}

}
