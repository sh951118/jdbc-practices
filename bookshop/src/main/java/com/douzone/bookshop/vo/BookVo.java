package com.douzone.bookshop.vo;

public class BookVo {

	private int no;
	private String name;
	private int price;
	private int categoryno;
	private String categoryname;
	
	
	public int getBookno() {
		return no;
	}
	public void setBookno(int bookno) {
		this.no = bookno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getCategoryno() {
		return categoryno;
	}
	public void setCategoryno(int categoryno) {
		this.categoryno = categoryno;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	@Override
	public String toString() {
		return "상품리스트 : 책 번호 = " + no + ", 책 이름 = " + name + ", 가격 = " + price + ", 카테고리 = " + categoryno
				+ ", 카테고리 이름 = " + categoryname;
	}
}
