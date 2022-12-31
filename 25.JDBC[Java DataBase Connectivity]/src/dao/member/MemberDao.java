package dao.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.address.fourth.Address;
import dao.common.DataSource;

/*
 * Dao(Data[DataBase] Access Object)객체
 * 		- member(회원) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */
public class MemberDao {
	static String driverClass="oracle.jdbc.OracleDriver";
	static String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
	static String user="jdeveloper03";
	static String password="jdeveloper03";
	
	private DataSource dataSource;
	private MemberSQL memberSQL;

	public MemberDao() throws Exception{
		this.dataSource=new DataSource();
	}

	public Member insert(Member newMember) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(memberSQL.INSERTSQL);
		pstmt.setString(1, newMember.getM_id());
		pstmt.setString(2, newMember.getM_password());
		pstmt.setString(3, newMember.getM_name());
		pstmt.setString(4, newMember.getM_address());
		pstmt.setInt(5, newMember.getM_age());
		pstmt.setString(6, newMember.getM_married());
		pstmt.setString(7, newMember.getM_regdate().toString());
	
		int rowCount=pstmt.executeUpdate();
		System.out.println(">> "+rowCount+"행 추가");
		
		pstmt.close();
		con.close();
		return newMember;
	}
	
	public Member update(Member updateMember) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(memberSQL.UPDATESQL);
		pstmt.setString(1, updateMember.getM_password());
		pstmt.setString(2, updateMember.getM_name());
		pstmt.setString(3, updateMember.getM_address());
		pstmt.setInt(4, updateMember.getM_age());
		pstmt.setString(5, updateMember.getM_married());
		pstmt.setString(6, updateMember.getM_regdate().toString());
		pstmt.setString(7, updateMember.getM_id());
		int rowCount=pstmt.executeUpdate();
		System.out.println(">> "+rowCount+"행 업데이트");
		
		pstmt.close();
		con.close();
		return updateMember;
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
		PreparedStatement pstmt=con.prepareStatement(memberSQL.FINDBYNOSQL);
		pstmt.setString(1, m_id);
		Member findMember=null;
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			String id=rs.getString("m_id");
			String password=rs.getString("m_password");
			String name=rs.getString("m_name");
			String address=rs.getString("m_address");
			int age=rs.getInt("m_age");
			String married=rs.getString("m_married");
			String regdate=rs.getDate("m_regdate").toString();
			
			//findMember=new Member(id,password,name,address,age,married,regdate);
			
			findMember=new Member(rs.getString("m_id"),rs.getString("m_password"),rs.getString("m_name"),rs.getString("m_address"),rs.getInt("m_age"),rs.getString("m_married"),rs.getDate("m_regdate"));
			 //
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
		if(rs.next()) {
			do {
				String id=rs.getString("m_id");
				String password=rs.getString("m_password");
				String name=rs.getString("m_name");
				String address=rs.getString("m_address");
				int age=rs.getInt("m_age");
				String married=rs.getString("m_married");
				Date regdate=rs.getDate("m_regdate");
				Member member=new Member(id,password,name,address,age,married,regdate);
				memberList.add(member);
			} while(rs.next());
		}
		rs.close();
		pstmt.close();
		con.close();
		return memberList;
	}
}
