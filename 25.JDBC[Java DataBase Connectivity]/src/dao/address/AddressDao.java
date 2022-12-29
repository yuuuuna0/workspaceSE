package dao.address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * Dao(Data Access Object) 클래스
 * 		-address테이블에 CRUD(Create,Read,Update,Delete)작업을 하는 단위메쏘드를 가지고 있는 클래스
 * 
 */
public class AddressDao {
	public AddressDao() {
	}

	public int insert(Address newAddress) throws Exception {
		String insertSQL="insert into address values(address_no_SEQ.nextval,'"+newAddress.getName()+"','"+newAddress.getPhone()+"','"+newAddress.getAddress()+"')";
		Connection con=null;
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(insertSQL);
		System.out.println(">>insert row count: "+rowCount+"행 insert");
		stmt.close();
		con.close();
		return rowCount;
	}
	public int update(Address updateAddress) throws Exception {
		String updateSql="update address set name='"+updateAddress.getName()+"',phone='"+updateAddress.getPhone()+"',address='"+updateAddress.getAddress()+"' where no="+updateAddress.getNo();
		Connection con=null;
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(updateSql);
		System.out.println(">> "+rowCount+"행 update");
		
		stmt.close();
		con.close();
		return rowCount;
	}
	public int delete(int no) throws Exception {
		String deleteSql="delete address where no="+no;
		Connection con=null;
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(deleteSql);
		System.out.println(">> "+rowCount+" 행 delete");
		stmt.close();
		con.close();
		return rowCount;
	}
	public Address findByPrimaryKey(int no) throws Exception {
		String selectSql="select no,name,phone,address from address where no="+no;
		Address findAddress=null;
		Connection con=null;
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSql);
		if(rs.next()) {
			int n=rs.getInt("no");
			String name=rs.getString("name");
			String phone=rs.getString("phone");
			String address=rs.getString("address");
			findAddress=new Address(no,name,phone,address);
		} else {
			findAddress=null;
		}
		
		rs.close();
		stmt.close();
		con.close();
		return findAddress;
	}
	public List<Address> findAll() throws Exception {
		String selectSql="select no,name,phone,address from address";
		List<Address> addressList=new ArrayList<Address>();
		Connection con=null;
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSql);
		if(rs.next()) {
			do {
				int no=rs.getInt("no");
				String name=rs.getString("name");
				String phone=rs.getString("phone");
				String addr=rs.getString("address");
				Address address=new Address(no,name,phone,addr);
				addressList.add(address);
			} while(rs.next());
		} else {
		}
		
		rs.close();
		stmt.close();
		con.close();
		return addressList;
	}
}
