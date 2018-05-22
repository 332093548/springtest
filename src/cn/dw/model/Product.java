package cn.dw.model;

import java.util.Date;

// 此类是model  类->表    对象->记录  属性->字段  
public class Product {

	public Product() { // 对象创建此方法会被调用
		System.out.println("Product.....");
	}
	

	@Override
	public String toString() {
		return "Product [productDaoImpl=" + productDaoImpl + ", name=" + name + ", price=" + price + ", date=" + date
				+ "]";
	}


	public Product(String name, Double price) {
		super();
		System.out.println("Product(String name, Double price).......");
		this.name = name;
		this.price = price;
	}

	private ProductDaoImpl productDaoImpl;
	
	public ProductDaoImpl getProductDaoImpl() {
		return productDaoImpl;
	}

	public void setProductDaoImpl(ProductDaoImpl productDaoImpl) {
		this.productDaoImpl = productDaoImpl;
	}

	private String name;

	private Double price;
	
	private Date date;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName........");
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}