package com.douzone.bookshop.main;

import java.util.List;

import com.douzone.bookshop.dao.BookDao;
import com.douzone.bookshop.dao.CartDao;
import com.douzone.bookshop.dao.CategoryDao;
import com.douzone.bookshop.dao.MemberDao;
import com.douzone.bookshop.dao.OrderDao;
import com.douzone.bookshop.vo.BookVo;
import com.douzone.bookshop.vo.CartVo;
import com.douzone.bookshop.vo.CategoryVo;
import com.douzone.bookshop.vo.MemberVo;
import com.douzone.bookshop.vo.OrderBookVo;
import com.douzone.bookshop.vo.OrderVo;
import com.douzone.bookshop.vo.OrderVo2;

public class BookShopMain {

	public static void main(String[] args) {
		selectTest1();
		selectTest2();
		selectTest3();
		selectTest4();
		selectTest5();
		selectTest6();
		selectTest7();
	}

	public static void selectTest1() {
		List<MemberVo> list = new MemberDao().findAll();
		for (MemberVo vo : list) {
			System.out.println(vo);
		}
	}
	
	public static void selectTest2() {
		List<CategoryVo> list = new CategoryDao().findAll();
		for(CategoryVo vo : list) {
			System.out.println(vo);
		}
	}
	public static void selectTest3() {
		List<BookVo> list = new BookDao().findAll();
		for(BookVo vo : list) {
			System.out.println(vo);
		}
	}
	
	public static void selectTest4() {
		List<CartVo> list = new CartDao().findAll();
		for (CartVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void selectTest5() {
		List<OrderVo> list = new OrderDao().findAll();
		for (OrderVo vo : list) {
			System.out.println(vo);
		}
	}
	public static void selectTest6() {
		List<OrderVo2> list = new OrderDao().findAll2();
		for (OrderVo2 vo : list) {
			System.out.println(vo);
		}
	}
	public static void selectTest7() {
		List<OrderBookVo> list = new OrderDao().findAll3();
		for (OrderBookVo vo : list) {
			System.out.println(vo);
		}
	}
}
