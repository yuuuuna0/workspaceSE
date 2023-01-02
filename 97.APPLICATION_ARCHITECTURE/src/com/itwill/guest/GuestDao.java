package com.itwill.guest;

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
 * Dao(Data[DataBase] Access Object)객체(클래스)
 *   - guest테이블에 CRUD(Create,Read,Update,Delete)작업을 하는 
 *     단위메쏘드를 가지고있는 객체(클래스)
 */
public class GuestDao {
	private DataSource dataSource;	
	public GuestDao() throws Exception{
		this.dataSource=new DataSource();
	}
	
	public int insert(Guest guest) throws Exception{		
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(GuestSQL.INSERTSQL);
		pstmt.setString(1,guest.getGuest_name());
		pstmt.setString(2,guest.getGuest_email());
		pstmt.setString(3,guest.getGuest_homepage());
		pstmt.setString(4,guest.getGuest_title());
		pstmt.setString(5,guest.getGuest_content());
		int rowCount=pstmt.executeUpdate();
		pstmt.close();
		return rowCount;
	}
	
	public int delete(int guest_no) throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(GuestSQL.DELETESQL);
		pstmt.setInt(1, guest_no);
		int rowCount=pstmt.executeUpdate();
		pstmt.close();
		return rowCount;
	}
	
	public int update(Guest guest) throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(GuestSQL.UPDATESQL);
		pstmt.setString(1, guest.getGuest_name());
		pstmt.setString(2, guest.getGuest_email());
		pstmt.setString(3, guest.getGuest_homepage());
		pstmt.setString(4, guest.getGuest_title());
		pstmt.setString(5, guest.getGuest_content());
		pstmt.setInt(6, guest.getGuest_no());
		int rowCount=pstmt.executeUpdate();
		pstmt.close();
		return rowCount;
	}
	
	public Guest findByPrimaryKey(int guest_no) throws Exception{
		Guest findGuest=null;		
		//guest가 없으면 null 임을 알려주기 위해 처음에 객체를 생성 후 null을 넣어주는 것이다.
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(GuestSQL.FINDBYNOSQL);
		pstmt.setInt(1, guest_no);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			findGuest=new Guest(rs.getInt("guest_no"), 
								rs.getString("guest_name"), 
								rs.getDate("guest_date"), 
								rs.getString("guest_email"), 
								rs.getString("guest_homepage"), 
								rs.getString("guest_title"), 
								rs.getString("guest_content"));
		}
		return findGuest;
	}
	
	public List<Guest> findAll() throws Exception{
		List<Guest> guestList=new ArrayList<Guest>();
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(GuestSQL.FINDALLSQL);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			Guest guest=new Guest(rs.getInt("guest_no"), 
								rs.getString("guest_name"), 
								rs.getDate("guest_date"), 
								rs.getString("guest_email"), 
								rs.getString("guest_homepage"), 
								rs.getString("guest_title"), 
								rs.getString("guest_content"));
			guestList.add(guest);
		}
		return guestList;
	}
	
	public List<Guest> findByGuestName(String name) throws Exception{
		List<Guest> guestList=new ArrayList<Guest>();
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(GuestSQL.FINDBYNAMESQL);
		pstmt.setString(1, name);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			Guest guest=new Guest(rs.getInt("guest_no"), 
								rs.getString("guest_name"), 
								rs.getDate("guest_date"), 
								rs.getString("guest_email"), 
								rs.getString("guest_homepage"), 
								rs.getString("guest_title"), 
								rs.getString("guest_content"));
			guestList.add(guest);
		}
		return guestList;
	}
	
	
	
	
	
	
	
}
