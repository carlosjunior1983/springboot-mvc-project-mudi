package br.com.carlosjunior.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Order {

	private String productName;
	private BigDecimal productValue;
	private LocalDate dateDelivery;
	private String urlProduct;
	private String urlImage;
	private String description;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getProductValue() {
		return productValue;
	}

	public void setProductValue(BigDecimal productValue) {
		this.productValue = productValue;
	}

	public LocalDate getDateDelivery() {
		return dateDelivery;
	}

	public void setDateDelivery(LocalDate dateDelivery) {
		this.dateDelivery = dateDelivery;
	}

	public String getUrlProduct() {
		return urlProduct;
	}

	public void setUrlProduct(String urlProduct) {
		this.urlProduct = urlProduct;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
