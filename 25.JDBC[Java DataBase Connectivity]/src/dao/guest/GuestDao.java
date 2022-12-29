package dao.guest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * Dao(Data[DataBase] Access Object)객체(클래스)
 *   - guest테이블에 CRUD(Create,Read,Update,Delet)작업을 하는 
 *     단위메쏘드를 가지고있는 객체(클래스)
 */
public class GuestDao {
	private static String driverClass="oracle.jdbc.OracleDriver";
	private static String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
	private static String user="jdeveloper03";
	private static String password="jdeveloper03";
	
	public GuestDao() {
	}
	
	public int insert(Guest guest) throws Exception{
		String insertSql="insert into guest values(guest_guest_no_seq.nextval,'"+guest.getGuest_name()+"','"+guest.getGuest_date()
						+"','"+guest.getGuest_email()+"','"+guest.getGuest_homepage()+"','"+guest.getGuest_title()
						+"','"+guest.getGuest_content()+"')";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(insertSql);
		System.out.println(">> "+rowCount+" 행 추가");
		stmt.close();
		con.close();
		return rowCount;
	}
	
	public int delete(int guest_no) throws Exception{
		String deleteSql="delete from guest where guest_no="+guest_no;
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(deleteSql);
		System.out.println(">> "+rowCount+" 행 삭제");
		stmt.close();
		con.close();
		return rowCount;
	}
	public int update(Guest guest) throws Exception{
		String updateSql="update guest set guest_name='"+guest.getGuest_name()+"',guest_date="+guest.getGuest_date()
						+",guest_email='"+guest.getGuest_email()+"',guest_homepage='"+guest.getGuest_homepage()+"',guest_title='"
						+guest.getGuest_title()+"',guest_content='"+guest.getGuest_content()+"' where guest_no="+guest.getGuest_no();
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(updateSql);
		System.out.println(">> "+rowCount+" 행 업데이트");
		stmt.close();
		con.close();
		return rowCount;
	}
	public Guest findByPrimaryKey(int guest_no) throws Exception{
		String selectSql="select * from guest where guest_no="+guest_no;
		Guest findGuest=null;
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSql);
		if(rs.next()) {
			int no=rs.getInt("guest_no");
			String name=rs.getString("guest_name");
			Date date=rs.getDate("guest_date");
			String email=rs.getString("guest_email");
			String homepage=rs.getString("guest_homepage");
			String title=rs.getString("guest_title");
			String content=rs.getString("guest_content");
			findGuest=new Guest(no,name,date,email,homepage,title,content);
		}
		return findGuest;
	}
	public List<Guest> findAll() throws Exception{
		String selectSql="select * from guest";
		List<Guest> guestList=new ArrayList<Guest>();
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSql);
		if(rs.next()) {
			do{
				int no=rs.getInt("guest_no");
				String name=rs.getString("guest_name");
				Date date=rs.getDate("guest_date");
				String email=rs.getString("guest_email");
				String homepage=rs.getString("guest_homepage");
				String title=rs.getString("guest_title");
				String content=rs.getString("guest_content");
				Guest guest=new Guest(no,name,date,email,homepage,title,content);
				guestList.add(guest);
			} while(rs.next());
		}
		return guestList;
	}
	
	
	
	
	
	
	
}
