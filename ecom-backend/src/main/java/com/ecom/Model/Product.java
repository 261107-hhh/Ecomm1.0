package com.ecom.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;

@Entity
@Table(name = "com.Product") // @Table we can table name
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	@Column(name = "product_brand_name", length = 300, unique = true)
	private String productName;
	private String productDesc;
	private double productPrize;
	private boolean stock = true;
	private int productQuantity;
	private boolean live;

	private String imageName;

	@ManyToOne(fetch = FetchType.EAGER)
	private Category category;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public double getProductPrize() {
		return productPrize;
	}

	public void setProductPrize(double productPrize) {
		this.productPrize = productPrize;
	}

	public boolean isStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		System.out.println(imageName);
		this.imageName = imageName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, String productDesc, double productPrize, boolean stock, int productQuantity,
			boolean live, String imageName) {
		super();
		this.productName = productName;
		this.productDesc = productDesc;
		this.productPrize = productPrize;
		this.stock = stock;
		this.productQuantity = productQuantity;
		this.live = live;
		this.imageName = imageName;
	}

	public Product(int productId, String productName, String productDesc, double productPrize, boolean stock,
			int productQuantity, boolean live, String imageName) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productPrize = productPrize;
		this.stock = stock;
		this.productQuantity = productQuantity;
		this.live = live;
		this.imageName = imageName;
	}

	
	
}
