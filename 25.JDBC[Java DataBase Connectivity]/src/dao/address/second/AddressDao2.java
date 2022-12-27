package dao.address.second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Dao(Data Access Object) 클래스
 * 		-address테이블에 CRUD(Create,Read,Update,Delete)작업을 하는 단위메쏘드를 가지고 있는 클래스
 * 
 */
public class AddressDao2 {
	public AddressDao2() {
	}

	public void insert(String name,String phone, String address) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		String insertSQL="insert into address values(address_no_SEQ.nextval,'"+name+"','"+phone+"','"+address+"')";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(insertSQL);
		System.out.println(">>insert row count: "+rowCount+"행 insert");
		stmt.close();
		con.close();
	}
	public void update(int no,String name,String phone, String address) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		String updateSql="update address set name='"+name+"',phone='"+phone+"',address='"+address+"' where no="+no;
		
		
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(updateSql);
		System.out.println(">> "+rowCount+"행 update");
		
		stmt.close();
		con.close();
	}
	public void delete(int no) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		String deleteSql="delete address where no="+no;
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(deleteSql);
		System.out.println(">> "+rowCount+" 행 delete");
		stmt.close();
		con.close();
	}
	public void findByPrimaryKey(int no) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		String selectSql="select no,name,phone,address from address where no="+no;
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSql);
		if(rs.next()) {
			int n=rs.getInt("no");
			String name=rs.getString("name");
			String phone=rs.getString("phone");
			String address=rs.getString("address");
			System.out.println(n+"\t"+name+"\t"+phone+"\t"+address);
		} else {
			System.out.println("조건에 만족하는 주소록 존재안함");
		}
		
		rs.close();
		stmt.close();
		con.close();
	}
	public void findAll() throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		String selectSql="select no,name,phone,address from address";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSql);
		if(rs.next()) {
			do {
				int no=rs.getInt("no");
				String name=rs.getString("name");
				String phone=rs.getString("phone");
				String address=rs.getString("address");
				System.out.println(no+"\t"+name+"\t"+phone+"\t"+address);
			} while(rs.next());
		} else {
			System.out.println("조건에 만족하는 주소록 존재안함");
		}
		
		rs.close();
		stmt.close();
		con.close();
	}
}
