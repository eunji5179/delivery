package member.util2;

import java.sql.Connection;
import java.sql.DriverManager;

public class M_DBConnection2 {
	private static Connection conn = null;

	public static Connection getConn() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				String userId = "DELIVERY";
				String userPw = "EUNJI";
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				conn = DriverManager.getConnection(url, userId, userPw);
			} catch (Exception e) {
				System.out.println("계정 및 비밀번호 또는 URL이 틀렸습니다.");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 로딩할 수 없습니다.");
		}
		return conn;
	}
	
	

}
