package com.douzone.bookshop.dao.test;

import java.util.List;

import com.douzone.bookshop.dao.OrderDao;
import com.douzone.bookshop.vo.OrderBookVo;
import com.douzone.bookshop.vo.OrderVo;
import com.douzone.bookshop.vo.OrderVo2;

public class OrderDaoTest {

	public static void main(String[] args) {
		//insertTest("202020-1230123", "홍길동", 3000, "부산", 1);
		selectTest();
		selectTest2();
		selectTest3();
	}

	public static void insertTest(String orderprimary, String buyer, int price, String address, int memberno) {
		OrderVo vo = new OrderVo();
		vo.setOrderprimary(orderprimary);
		vo.setBuyer(buyer);
		vo.setPrice(price);
		vo.setAddress(address);
		vo.setMemberno(memberno);
		new OrderDao().insert(vo);
	}

	public static void selectTest() {
		List<OrderVo> list = new OrderDao().findAll();
		for (OrderVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void selectTest2() {
		List<OrderVo2> list = new OrderDao().findAll2();
		for (OrderVo2 vo : list) {
			System.out.println(vo);
		}
	}
	public static void selectTest3() {
		List<OrderBookVo> list = new OrderDao().findAll3();
		for (OrderBookVo vo : list) {
			System.out.println(vo);
		}
	}
}
