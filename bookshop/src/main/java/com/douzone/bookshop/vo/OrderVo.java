package com.douzone.bookshop.vo;

public class OrderVo {

	private int no;
	private String orderprimary;
	private String buyer;
	private int price;
	private String address;
	private int memberno;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOrderprimary() {
		return orderprimary;
	}
	public void setOrderprimary(String orderprimary) {
		this.orderprimary = orderprimary;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMemberno() {
		return memberno;
	}
	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}
	@Override
	public String toString() {
		return "주문 : 주문번호 = " + orderprimary + ", 주문자 = (" + buyer + "), 총 결제금액 = " + price
				+ ", 배송지 = " + address;
	}
}
