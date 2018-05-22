package cn.dw.model;


//此类事model 类->表，对象->记录，属性->字段
public class Product {
	public Product() { // 对象创建此方法会被调用
		System.out.println("Product.....");
	}

	private String name;

	private Double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
