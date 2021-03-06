package shop.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Cellpones {
    private Integer id;
    @Size(min=1,max=64,message="1~64字")
    private String brand ;//--牌子
    @Size(min=1,max=64,message="1~64字")
    private String model;//-型号
    @Size(min=1,max=64,message="1~64字")
    private String os;// --系统（IOS、Android、Windows Phone）
    @Size(min=1,max=64,message="1~64字")
    private String cpubrand;//--品牌（高通、联发科）
    @Min(1)
    private int ram ;//--内存
    @Size(min=1,max=64,message="1~64字")
    private String color; //--颜色
    @Size(min=1,max=64,message="1~64字")
    private String description;//--描述  
    @Min(1)
    private int price;//--价格
    @Size(min=1,max=64,message="1~64字")
    private String images;// --图片
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getCpubrand() {
		return cpubrand;
	}
	public void setCpubrand(String cpubrand) {
		this.cpubrand = cpubrand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
    
    
}
