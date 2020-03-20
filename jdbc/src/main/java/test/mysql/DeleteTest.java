package test.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {

	public static void main(String[] args) {
		Boolean result = delete(2L);
		if (result) {
			System.out.println("성공");
		}
		else {
			System.out.println("실패");
		}
	}

	public static Boolean delete(Long no) {
		Connection conn = null;
		Statement stmt = null;
		boolean result = false;

		try {
			// 1. JBDC Driver(MyDriver) 로딩
			Class.forName("org.mariadb.jdbc.Driver");

			// 2. 연결하기
			String url = "jdbc:mysql://192.168.1.106:3307/webdb";
			conn = DriverManager.getConnection(url, "webdb", "webdb");

			// 3. Statement 객체생성
			stmt = conn.createStatement();

			// 4. SQL문 실행
			String sql = "delete from dept where no = " + no;
			int count = stmt.executeUpdate(sql);

			// 5. 성공 여부
			result = count == 1;

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 : " + e);
		} catch (SQLException e) {
			System.out.println("error : " + e);
		} finally {
			// .자원 정리
			try {
				if (stmt != null) {
					stmt.close();
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
}
