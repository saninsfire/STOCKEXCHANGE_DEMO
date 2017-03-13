package com.stock.exchange.modal;

public class Stock {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4749853397649207440L;

	private String companyName;
	private Float price;
	private boolean isUp;
	private Float percentage;

	public Stock() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param name
	 * @param price
	 * @param isUp
	 * @param percentage
	 */
	public Stock(String name, Float price, boolean isUp, Float percentage) {
		this.companyName = name;
		this.price = price;
		this.isUp = isUp;
		this.percentage = percentage;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName
	 *            the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the price
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(Float price) {
		this.price = price;
	}

	/**
	 * @return the isUp
	 */
	public boolean isUp() {
		return isUp;
	}

	/**
	 * @param isUp
	 *            the isUp to set
	 */
	public void setUp(boolean isUp) {
		this.isUp = isUp;
	}

	/**
	 * @return the percentage
	 */
	public Float getPercentage() {
		return percentage;
	}

	/**
	 * @param percentage
	 *            the percentage to set
	 */
	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
