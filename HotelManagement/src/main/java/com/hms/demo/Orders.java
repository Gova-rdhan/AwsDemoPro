package com.hms.demo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Orders {

	@Id
	private int ordId;
	private String emailId;
	private int venId;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	private int menuId;
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menId) {
		this.menuId = menId;
	}
	private String walSource;
	private Date ordDate;
	private int ordQuantity;
	private double ordBillamount;
	private String ordStatus;
	private String ordComments;
	public int getOrdId() {
		return ordId;
	}
	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}
	public int getVenId() {
		return venId;
	}
	public void setVenId(int venId) {
		this.venId = venId;
	}
	public String getWalSource() {
		return walSource;
	}
	public void setWalSource(String walSource) {
		this.walSource = walSource;
	}
	public Date getOrdDate() {
		return ordDate;
	}
	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}
	public int getOrdQuantity() {
		return ordQuantity;
	}
	public void setOrdQuantity(int ordQuantity) {
		this.ordQuantity = ordQuantity;
	}
	public double getOrdBillamount() {
		return ordBillamount;
	}
	public void setOrdBillamount(double ordBillamount) {
		this.ordBillamount = ordBillamount;
	}
	//@Enumerated(EnumType.STRING)
	public String getOrdStatus() {
		return ordStatus;
	}
	public void setOrdStatus(String ordStatus) {
		this.ordStatus = ordStatus;
	}
	public String getOrdComments() {
		return ordComments;
	}
	public void setOrdComments(String ordComments) {
		this.ordComments = ordComments;
	}
	
	
}
