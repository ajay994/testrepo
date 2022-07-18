package com.dhathika.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Product")
public class Product {

	@Id
	private int pId;
	@Column(name = "Product_Name")
	private String pName;
	@Column
	private double pPrice;
	@Column
	private String pBrand;
	@Column
	private String pManifacturerName;
	@Column
	private Date pManifuringDate;
	@Column
	private Date pExpiryDate;

	public Product(int pId, String pName, double pPrice, String pBrand, String pManifacturerName, Date pManifuringDate,
			Date pExpiryDate) {

		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pBrand = pBrand;
		this.pManifacturerName = pManifacturerName;
		this.pManifuringDate = pManifuringDate;
		this.pExpiryDate = pExpiryDate;
	}

	public Product() {

	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getpPrice() {
		return pPrice;
	}

	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}

	public String getpBrand() {
		return pBrand;
	}

	public void setpBrand(String pBrand) {
		this.pBrand = pBrand;
	}

	public String getpManifacturerName() {
		return pManifacturerName;
	}

	public void setpManifacturerName(String pManifacturerName) {
		this.pManifacturerName = pManifacturerName;
	}

	public Date getpManifuringDate() {
		return pManifuringDate;
	}

	public void setpManifuringDate(Date pManifuringDate) {
		this.pManifuringDate = pManifuringDate;
	}

	public Date getpExpiryDate() {
		return pExpiryDate;
	}

	public void setpExpiryDate(Date pExpiryDate) {
		this.pExpiryDate = pExpiryDate;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", pBrand=" + pBrand
				+ ", pManifacturerName=" + pManifacturerName + ", pManifuringDate=" + pManifuringDate + ", pExpiryDate="
				+ pExpiryDate + "]";
	}

}
