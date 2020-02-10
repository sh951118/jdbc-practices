package com.douzone.bookshop.dao.test;

import java.util.List;

import com.douzone.bookshop.dao.CartDao;
import com.douzone.bookshop.vo.CartVo;

public class CartDaoTest {

public static void main(String[] args) {
		
		selectTest();
	}

	public static void selectTest() {
		List<CartVo> list = new CartDao().findAll();
		for (CartVo vo : list) {
			System.out.println(vo);
		}
	}
}
