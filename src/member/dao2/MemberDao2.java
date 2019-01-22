package member.dao2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import member.model2.Member2;

public class MemberDao2 {
	private static MemberDao2 memberDao = new MemberDao2();
	private MemberDao2() {}
	public static MemberDao2 getInstance() {
		return memberDao;
	}
	
	public Member2 getMember(String id) {
		Member2 member = new Member2();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		  String sql = "select * from tb_member where id=?";

		
		return member;
	}
}
