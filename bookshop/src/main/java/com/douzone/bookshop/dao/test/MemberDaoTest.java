package com.douzone.bookshop.dao.test;

import java.util.List;

import com.douzone.bookshop.dao.MemberDao;
import com.douzone.bookshop.vo.MemberVo;

public class MemberDaoTest {

	public static void main(String[] args) {
//		insertTest("홍길동", "010-4444-2451", "gildong@google.com", "040012");
//		insertTest("뚜비", "010-1234-4567", "Thubi@naver.com", "thube1234");
		selectTest();
	}

	public static void insertTest(String name, String phone, String email, String password) {
		MemberVo vo = new MemberVo();
		vo.setName(name);
		vo.setPhone(phone);
		vo.setEmail(email);
		vo.setPassword(password);
		new MemberDao().insert(vo);
	}

	public static void selectTest() {
		List<MemberVo> list = new MemberDao().findAll();
		for (MemberVo vo : list) {
			System.out.println(vo);
		}
	}
}
