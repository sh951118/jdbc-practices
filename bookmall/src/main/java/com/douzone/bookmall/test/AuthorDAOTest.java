package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.AuthorDAO;
import com.douzone.bookmall.vo.AuthorVo;

public class AuthorDAOTest {

	public static void main(String[] args) {
//		insertTest("김난도");
//		insertTest("천상병");
//		insertTest("조정래");
//		insertTest("원상병");
		selectTest();
	}

	public static void insertTest(String name) {
		AuthorVo vo = new AuthorVo();
		vo.setName(name);
		new AuthorDAO().insert(vo);
	}
	
	public static void selectTest() {
		List<AuthorVo> list = new AuthorDAO().findAll();
		for(AuthorVo vo : list) {
			System.out.println(vo);
		}
	}

}
