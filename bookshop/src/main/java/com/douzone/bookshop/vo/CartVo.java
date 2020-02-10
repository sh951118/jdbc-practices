package com.douzone.bookshop.vo;

public class CartVo {

	private int bookno;
	private int memberno;
	private String bookname;
	private int count;
	private int booktotalprice;
	
	public int getBookno() {
		return bookno;
	}
	public void setBookno(int bookno) {
		this.bookno = bookno;
	}
	public int getMemberno() {
		return memberno;
	}
	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getBookprice() {
		return booktotalprice;
	}
	public void setBookprice(int booktotalprice) {
		this.booktotalprice = booktotalprice;
	}
	@Override
	public String toString() {
		return "카트 : 도서 제목 = " + bookname + ", 수량 = " + count
				+ ", 카트에 담긴 총 가격 = " + booktotalprice;
	}
}
