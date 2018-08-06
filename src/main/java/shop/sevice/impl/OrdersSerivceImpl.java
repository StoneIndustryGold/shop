package shop.sevice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.mapper.OrdresMapper;
import shop.sevice.OrdersService;
@Service
@Transactional//事务支持
public class OrdersSerivceImpl implements OrdersService{
		private OrdresMapper ordresMapper;
		
		@Autowired
		public OrdersSerivceImpl(OrdresMapper ordresMapper) {
			this.ordresMapper = ordresMapper;
		}


		/*
		 * 删除已取消订单
		 * 通过cron调用，返回值必须是void，参数列表必须为空
		 */
		@Scheduled(cron="* * 3 * * *")//秒 分 时  日 月 周   *任何时候
		@Override
		public void deleteCancedOrders() {
		Integer cron=ordresMapper.deleteCancedOrders();
		
			System.out.println("已删除"+cron+"订单");
		
		}
}
