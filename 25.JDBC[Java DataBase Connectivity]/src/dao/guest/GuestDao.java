package dao.guest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.common.DataSource;

/*
 * Dao(Data[DataBase] Access Object)객체(클래스)
 *   - guest테이블에 CRUD(Create,Read,Update,Delet)작업을 하는 
 *     단위메쏘드를 가지고있는 객체(클래스)
 */
public class GuestDao {
	private DataSource dataSource;
	private GuestSQL guestSQL;
	
	public GuestDao() throws Exception{
		this.dataSource=new DataSource();
	}
	
	public int insert(Guest guest) throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(guestSQL.INSERTSQL);
		pstmt.setString(1, guest.getGuest_name());
		pstmt.setString(2, guest.getGuest_email());
		pstmt.setString(3, guest.getGuest_homepage());
		pstmt.setString(4, guest.getGuest_title());
		pstmt.setString(5, guest.getGuest_content());
		int rowCount=pstmt.executeUpdate();
		System.out.println(">> "+rowCount+" 행 추가");
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int delete(int guest_no) throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(guestSQL.DELETESQL);
		pstmt.setInt(1, guest_no);
		int rowCount=pstmt.executeUpdate();
		System.out.println(">> "+rowCount+" 행 삭제");
		pstmt.close();
		con.close();
		return rowCount;
	}
	public int update(Guest guest) throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(guestSQL.UPDATESQL);
		pstmt.setString(1, guest.getGuest_name());
		java.sql.Date sqlDate=new java.sql.Date(guest.getGuest_date().getTime());
		pstmt.setDate(2, sqlDate);
		pstmt.setString(3, guest.getGuest_email());
		pstmt.setString(4, guest.getGuest_homepage());
		pstmt.setString(5, guest.getGuest_title());
		pstmt.setString(6, guest.getGuest_content());
		pstmt.setInt(7, guest.getGuest_no());
		int rowCount=pstmt.executeUpdate();
		System.out.println(">> "+rowCount+" 행 업데이트");
		pstmt.close();
		con.close();
		return rowCount;
	}
	public Guest findByPrimaryKey(int guest_no) throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(guestSQL.FINDBYNOSQL);
		pstmt.setInt(1, guest_no);
		Guest findGuest=null;
		ResultSet rs=pstmt.executeQuery();
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
		rs.close();
		pstmt.close();
		con.close();
		return findGuest;
	}
	public List<Guest> findAll() throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(guestSQL.FINDALLSQL);
		ResultSet rs=pstmt.executeQuery();
		List<Guest> guestList=new ArrayList<Guest>();
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
		rs.close();
		pstmt.close();
		con.close();
		return guestList;
	}
	
	
	
	
	
	
	
}
