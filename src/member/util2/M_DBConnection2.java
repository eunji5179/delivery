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
				System.out.println("���� �� ��й�ȣ �Ǵ� URL�� Ʋ�Ƚ��ϴ�.");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹��� �ε��� �� �����ϴ�.");
		}
		return conn;
	}
	
	

}
