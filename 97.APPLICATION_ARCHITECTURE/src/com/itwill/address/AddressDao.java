package com.itwill.address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.itwill.common.DataSource_Scott;

/*
 * Dao(Data Access Object) 클래스
 * 		-address테이블에 CRUD(Create,Read,Update,Delete)작업을 하는 단위메쏘드를 가지고 있는 클래스
 * 
 */
public class AddressDao {
	/*
	 * Connection을 생성하고 해지하는 DataSource 객체를 멤버변수로 가짐
	 */
	private DataSource_Scott dataSource;
	public AddressDao() {
		/*
		 * dataSource 멤버필드 초기화
		 */
		this.dataSource=new DataSource_Scott();
	}

	public int insert(Address newAddress) throws Exception {
		//preparedStatement로 사용하면 dml문을 클래스로 뺄 수 있다. => 의존성 감소
		Connection con=dataSource.getConnection();
		
		PreparedStatement pstmt=con.prepareStatement(AddressSQL.ADDRESS_INSERT);
		pstmt.setString(1, newAddress.getName());
		pstmt.setString(2, newAddress.getName());
		pstmt.setString(3, newAddress.getPhone());
		
		int rowCount=pstmt.executeUpdate();
		System.out.println(">>insert row count: "+rowCount+"행 insert");
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;
	}
	public int update(Address updateAddress) throws Exception {
		Connection con=dataSource.getConnection();
		
		PreparedStatement pstmt=con.prepareStatement(AddressSQL.ADDRESS_UPDATE);
		pstmt.setString(1, updateAddress.getName());
		pstmt.setString(2, updateAddress.getName());
		pstmt.setString(3, updateAddress.getPhone());
		pstmt.setInt(4, updateAddress.getNo());
		
		int rowCount=pstmt.executeUpdate();
		System.out.println(">> "+rowCount+"행 update");
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;
	}
	public int delete(int no) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(AddressSQL.ADDRESS_DELETE);
		
		pstmt.setInt(1, no);
		
		int rowCount=pstmt.executeUpdate();
		System.out.println(">> "+rowCount+" 행 delete");
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;
	}
	public Address findByPrimaryKey(int no) throws Exception {
		Address findAddress=null;
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(AddressSQL.ADDRESS_SELECT_BY_NO);
		pstmt.setInt(1, no);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			int n=rs.getInt("no");
			String name=rs.getString("name");
			String phone=rs.getString("phone");
			String address=rs.getString("address");
			findAddress=new Address(no,name,phone,address);
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		
		return findAddress;
	}
	public List<Address> findAll() throws Exception {
		List<Address> addressList=new ArrayList<Address>();
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(AddressSQL.ADDRESS_SELECT_ALL);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			do {
				int no=rs.getInt("no");
				String name=rs.getString("name");
				String phone=rs.getString("phone");
				String addr=rs.getString("address");
				Address address=new Address(no,name,phone,addr);
				addressList.add(address);
			} while(rs.next());
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		
		return addressList;
	}
}
