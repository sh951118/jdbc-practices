package com.douzone.bookshop.dao.test;

import java.util.List;

import com.douzone.bookshop.dao.BookDao;
import com.douzone.bookshop.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {

//		insertTest("트와일라잇", 5000, 1);
//		insertTest("실크로드 여행", 10000, 2);
//		insertTest("K-pop속으로", 20000, 3);
		selectTest();

	}
	public static void insertTest(String name, int price, int categoryno) {
		BookVo vo = new BookVo();
		vo.setName(name);
		vo.setPrice(price);
		vo.setCategoryno(categoryno);
		new BookDao().insert(vo);
	}
	
	public static void selectTest() {
		List<BookVo> list = new BookDao().findAll();
		for(BookVo vo : list) {
			System.out.println(vo);
		}
	}
}
