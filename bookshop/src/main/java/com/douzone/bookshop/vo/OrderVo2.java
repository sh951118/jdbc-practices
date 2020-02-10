package com.douzone.bookshop.vo;

public class OrderVo2 {

	private int bookno;
	private String bookname;
	private int count;
	
	public int getBookno() {
		return bookno;
	}
	public void setBookno(int bookno) {
		this.bookno = bookno;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "책 번호 = " + bookno + " : " + bookname + " " + count + "권";
	}
}
