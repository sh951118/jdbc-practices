package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.BookDAO;
import com.douzone.bookmall.vo.BookVo;

public class BookDAOTest {

	public static void main(String[] args) {

		insertTest("트와일라잇", "대여가능", (long) 1);
		insertTest("뉴문", "대여가능", (long) 1);
		insertTest("이클립스", "대여가능", (long) 1);
		insertTest("브레이킹던", "대여가능", (long) 1);
		insertTest("아프니까 청춘이다", "대여가능", (long) 2);
		insertTest("귀천", "대여가능", (long) 3);
		insertTest("아리랑", "대여가능", (long) 4);
		insertTest("태백산맥", "대여가능", (long) 4);
		insertTest("풀하우스", "대여가능", (long) 5);
		selectTest();
	}

	public static void insertTest(String title, String state, Long i) {
		BookVo vo = new BookVo();
		vo.setTitle(title);
		vo.setState(state);
		vo.setAuthorNo(i);
		new BookDAO().insert(vo);
	}
	
	public static void selectTest() {
		List<BookVo> list = new BookDAO().findAll();
		for(BookVo vo : list) {
			System.out.println(vo);
		}
	}

}
