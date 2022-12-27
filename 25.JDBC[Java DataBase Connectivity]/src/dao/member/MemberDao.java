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

	public MemberDao() {

	}
/*	
	private static void memberConnect() throws Exception{
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
	}
*/	
	public Member insert(Member newmember) throws Exception {
		String insertSQL="insert into member(m_id,m_password,m_name,m_address,m_age,m_married,m_regdate) "
				+ "values('"+newmember.getM_id()+"','"+newmember.getM_password()+"','"+newmember.getM_name()
				+"','"+newmember.getM_address()+"',"+newmember.getM_age()+",'"+newmember.getM_married()+"',"+newmember.getM_regdate()+")";
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		stmt.executeUpdate(insertSQL);
		
		stmt.close();
		con.close();
		return newmember;
	}
	
	public int update(String m_id) throws Exception {
		//update가 여러개면 overloading해서 쓴다.
		Member updateMember=this.findByPrimaryKey(m_id);
		String updateSQL="update member set m_password='"+updateMember.getM_password()+"',m_name='"+updateMember.getM_name()
						+"',m_address='"+updateMember.getM_address()+"',m_age="+updateMember.getM_age()+",m_married='"+updateMember.getM_married()
						+"',m_regdate="+updateMember.getM_regdate()+" where m_id='"+updateMember.getM_id()+"'";
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(updateSQL);
		
		stmt.close();
		con.close();
		return rowCount;
	}
	
	public int delete(String m_id) throws Exception {
		//delete가 여러개면 overloading해서 쓴다.
		//영향받은 행의 수를 반환
		//pk delete
		String deleteSQL="delete from member where m_id="+m_id+"";
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(deleteSQL);
		
		stmt.close();
		con.close();
		return rowCount;
	}

	public Member findByPrimaryKey(String m_id) throws Exception {
		//pk find
		String findSQL="select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate from member where m_id='"+m_id+"'";
	
		Member findMember=null;
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(findSQL);
		if(rs.next()) {
			String id=rs.getString("m_id");
			String password=rs.getString("m_password");
			String name=rs.getString("m_name");
			String address=rs.getString("m_address");
			int age=rs.getInt("m_age");
			String married=rs.getString("m_married");
			Date regdate=rs.getDate("m_id");
			
			findMember=new Member(id,password,name,address,age,married,regdate);
		}
		rs.close();
		stmt.close();
		con.close();
		return findMember;
	}
	
	public List<Member> findAll() throws Exception  {
		String findSQL="select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate from member";
		
		List<Member> memberList=new ArrayList<Member>();
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(findSQL);
		if(rs.next()) {
			do {
				String id=rs.getString("m_id");
				String password=rs.getString("m_password");
				String name=rs.getString("m_name");
				String address=rs.getString("m_address");
				int age=rs.getInt("m_age");
				String married=rs.getString("m_married");		//getChar 대신 쓸 수 있는 것?
				Date regdate=rs.getDate("m_id");
				Member member=new Member(id,password,name,address,age,married,regdate);
				memberList.add(member);
			} while(rs.next());
		}
		rs.close();
		stmt.close();
		con.close();
		return memberList;
	}
}
