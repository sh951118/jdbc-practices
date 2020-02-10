
package com.douzone.bookshop.vo;

public class OrderBookVo {

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
		return "주문도서 : 도서번호 = " + bookno + ", 도서제목 = " + bookname + ", 수량 = " + count;
	}
}
