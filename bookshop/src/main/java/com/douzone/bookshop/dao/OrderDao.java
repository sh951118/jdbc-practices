package com.douzone.bookshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.douzone.bookshop.vo.OrderBookVo;
import com.douzone.bookshop.vo.OrderVo;
import com.douzone.bookshop.vo.OrderVo2;


public class OrderDao {

	public boolean insert(OrderVo vo) {
		boolean result = false;

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection();

			String sql = "insert into orders values(null, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, vo.getOrderprimary());
			pstmt.setString(2, vo.getBuyer());
			pstmt.setInt(3, vo.getPrice());
			pstmt.setString(4, vo.getAddress());
			pstmt.setInt(5, vo.getMemberno());

			int count = pstmt.executeUpdate();
			result = count == 1;

		} catch (SQLException e) {
			System.out.println("Error : " + e);
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;

	}

	public List<OrderVo> findAll() {
		List<OrderVo> result = new ArrayList<OrderVo>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();

			String sql = "select a.order_primary, concat(b.name, ' / ',b.email) as name, sum(d.price * c.count), a.address" + 
						 "  from orders a, member b, order_book c, book d" + 
						 " where a.member_no = b.no" + 
						 "   and a.no = c.order_no" + 
						 "   and c.book_no = d.no" + 
						 " group by a.no";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String orderprimary = rs.getString(1);
				String buyer = rs.getString(2);
				int price = rs.getInt(3);
				String address = rs.getString(4);
				
				OrderVo vo = new OrderVo();
				vo.setOrderprimary(orderprimary);
				vo.setBuyer(buyer);
				vo.setPrice(price);
				vo.setAddress(address);
				result.add(vo);
			}

		} catch (SQLException e) {
			System.out.println("Error : " + e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}
	public List<OrderVo2> findAll2() {
		List<OrderVo2> result = new ArrayList<OrderVo2>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();

			String sql = "select d.no, d.name, c.count" + 
						 "  from orders a, member b, order_book c, book d" + 
						 " where a.member_no = b.no" + 
						 "   and a.no = c.order_no" + 
						 "   and c.book_no = d.no";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				int bookno = rs.getInt(1);
				String bookname = rs.getString(2);
				int count = rs.getInt(3);
				
				OrderVo2 vo = new OrderVo2();
				vo.setBookno(bookno);
				vo.setBookname(bookname);
				vo.setCount(count);
				result.add(vo);
			}

		} catch (SQLException e) {
			System.out.println("Error : " + e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}
	public List<OrderBookVo> findAll3() {
		List<OrderBookVo> result = new ArrayList<OrderBookVo>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();

			String sql = "select b.no, b.name, a.count" + 
						 "  from order_book a, book b, orders c" + 
						 " where a.book_no = b.no" + 
						 "   and a.order_no = c.no";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				int bookno = rs.getInt(1);
				String bookname = rs.getString(2);
				int count = rs.getInt(3);
				
				OrderBookVo vo = new OrderBookVo();
				vo.setBookno(bookno);
				vo.setBookname(bookname);
				vo.setCount(count);
				result.add(vo);
			}

		} catch (SQLException e) {
			System.out.println("Error : " + e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	private Connection getConnection() throws SQLException {
		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://127.0.0.1:3306/bookshop";
			conn = DriverManager.getConnection(url, "bookshop", "bookshop");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패:" + e);
		}

		return conn;
	}
}
