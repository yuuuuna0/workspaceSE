package com.itwill.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itwill.common.DataSource;



/*
 * Dao(Data[DataBase] Access Object)객체
 * 		- member(회원) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */
public class MemberDao {
	private DataSource dataSource;
	private MemberSQL memberSQL;

	public MemberDao() throws Exception{
		this.dataSource=new DataSource();
	}

	public int insert(Member newMember) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(memberSQL.INSERTSQL);
		pstmt.setString(1, newMember.getM_id());
		pstmt.setString(2, newMember.getM_password());
		pstmt.setString(3, newMember.getM_name());
		pstmt.setString(4, newMember.getM_address());
		pstmt.setInt(5, newMember.getM_age());
		pstmt.setString(6, newMember.getM_married());	
		//date 입력 시 : sql data로 입력해야 하므로 java.sql.Date(newMember.getM_regdate().getTime())
		int rowCount=pstmt.executeUpdate();
		System.out.println(">> "+rowCount+"행 추가");
		
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int update(Member updateMember) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(memberSQL.UPDATESQL);
		pstmt.setString(1, updateMember.getM_password());
		pstmt.setString(2, updateMember.getM_name());
		pstmt.setString(3, updateMember.getM_address());
		pstmt.setInt(4, updateMember.getM_age());
		pstmt.setString(5, updateMember.getM_married());
		pstmt.setString(6, updateMember.getM_id());
		int rowCount=pstmt.executeUpdate();
		System.out.println(">> "+rowCount+"행 업데이트");
		
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int delete(String m_id) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(memberSQL.DELETESQL);
		pstmt.setString(1, m_id);
		int rowCount=pstmt.executeUpdate();
		System.out.println(">> "+rowCount+"행 삭제");
		
		pstmt.close();
		con.close();
		return rowCount;
	}

	public Member findByPrimaryKey(String m_id) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(memberSQL.FINDBYIDSQL);
		pstmt.setString(1, m_id);
		Member findMember=null;
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			findMember=new Member(rs.getString("m_id"),
								  rs.getString("m_password"),
								  rs.getString("m_name"),
								  rs.getString("m_address"),
								  rs.getInt("m_age"),
								  rs.getString("m_married"),
								  rs.getDate("m_regdate"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return findMember;
	}
	
	public List<Member> findAll() throws Exception  {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(memberSQL.FINDALLSQL);
		List<Member> memberList=new ArrayList<Member>();
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			Member member=new Member(rs.getString("m_id"),
					  				 rs.getString("m_password"),
					  				 rs.getString("m_name"),
					  				 rs.getString("m_address"),
					  				 rs.getInt("m_age"),
					  				 rs.getString("m_married"),
					  				 rs.getDate("m_regdate"));
			memberList.add(member);
		}
		rs.close();
		pstmt.close();
		con.close();
		return memberList;
	}
}
