package dao.address.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Dao(Data Access Object) 클래스
 * 		-address테이블에 CRUD(Create,Read,Update,Delete)작업을 하는 단위메쏘드를 가지고 있는 클래스
 * 
 */
public class AdressDao1 {
	public AdressDao1() {
	}

	public void insert() throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		String insertSQL="insert into address values(address_no_SEQ.nextval,'일경호','123-4567','경기도 성남시')";
		/*
		 1.Driver class loading
	     2.Connection 객체생성
		 3.Statement객체생성
		 4.SQL문전송(insert)
		 5.SQL문전송(insert)결과 영향받은행의수 반환
		 6.연결객체해지(resource해지) close
		 */
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(insertSQL);
		/*
		 * << executeUpdate >>
		 * Statement를 사용한 SQL문의 전송
		 * int executeUpdate(String sql)throws SQLException
				- Executes the given SQL statement, which may be an INSERT, UPDATE, or DELETE statement 
					or an SQL statement that returns nothing,
					such as an SQL DDL(create,drop) statement.
			Parameters:
			sql - an SQL Data Manipulation Language (DML) statement, such as INSERT, UPDATE or DELETE; 
					or an SQL statement that returns nothing, such as a DDL statement.
			Returns:
			either (1) the row count for SQL Data Manipulation Language (DML) statements //DML문일 경우 영향 받은 행의 수를 반환
				or (2) 0 for SQL statements that return nothing							 //DDL문의 경우 0을 반환
			-DML 중 Select만 executeQuery, 나머지 3개는 executeUpdate
		 */
		System.out.println(">>insert row count: "+rowCount+"행 insert");
		stmt.close();
		con.close();
	}
	public void update() throws Exception {
		/*******************데이터베이스 접속 정보************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		/*****************************************************************/
		String updateSql="update address set name='제임스',phone='333-3333',address='제주시 애월읍' where no=2";
		/*
		 1.Driver class loading
	     2.Connection 객체생성
		 3.Statement객체생성
		 4.SQL문전송(update)
		 5.SQL문전송(update)결과 영향받은행의수 반환
		 6.연결객체해지(resource해지) close
		 */
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(updateSql);
		System.out.println(">> "+rowCount+"행 update");
		
		stmt.close();
		con.close();
	}
	public void delete() throws Exception {
		/*******************데이터베이스 접속 정보************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		/*****************************************************************/
		String deleteSql="delete address where no=11";
		/*
		 1.Driver class loading
	     2.Connection 객체생성
		 3.Statement객체생성
		 4.SQL문전송(delete)
		 5.SQL문전송(delete)결과 영향받은행의수 반환
		 6.연결객체해지(resource해지) close
		 */
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(deleteSql);
		System.out.println(">> "+rowCount+" 행 delete");
		stmt.close();
		con.close();
	}
	public void findByPrimaryKey() throws Exception {
		/*******************데이터베이스 접속 정보************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		/*****************************************************************/
		String selectSql="select no,name,phone,address from address where no=3";
		/*
		 1.Driver class loading
	     2.Connection 객체생성
		 3.Statement객체생성
		 4.SQL문전송(select)
		 5.SQL문전송(select)결과 영향받은행의수 반환
		 6.연결객체해지(resource해지) close
		 */
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		/*
		 * << executeQuery >>
		 * ResultSet executeQuery(String sql) throws SQLException
				- Executes the given SQL statement, which returns a single ResultSet object.
			Parameters:
			sql - an SQL statement to be sent to the database, typically a static SQL SELECT statement
			Returns:
			a ResultSet object that contains the data produced by the given query; never null
		 */
		ResultSet rs=stmt.executeQuery(selectSql);
		/*
		 * <<ResultSet>>
		 * boolean next() throws SQLException
				- Moves the cursor forward one row from its current position. 
				- A ResultSet cursor is initially positioned before the first row; 
				the first call to the method next makes the first row the current row; 
				the second call makes the second row the current row, and so on.
				- When a call to the next method returns false, 
				the cursor is positioned after the last row.
		 */
		if(rs.next()) {
			/* --------------------------------
			 * DB타입 		| 자바타입
			 * --------------------------------
			 * number		| int,double(float)
			 * varchar2,char| String
			 * Date			| Date
			 * --------------------------------*/
			int no=rs.getInt("no");
			String name=rs.getString("name");
			String phone=rs.getString("phone");
			String address=rs.getString("address");
			System.out.println(no+"\t"+name+"\t"+phone+"\t"+address);
		} else {
			System.out.println("조건에 만족하는 주소록 존재안함");
		}
		
		rs.close();
		stmt.close();
		con.close();
	}
	public void findAll() throws Exception {
		/*******************데이터베이스 접속 정보************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		/*****************************************************************/
		String selectSql="select no,name,phone,address from address";
		/*
		 1.Driver class loading
	     2.Connection 객체생성
		 3.Statement객체생성
		 4.SQL문전송(select)
		 5.SQL문전송(select)결과 영향받은행의수 반환
		 6.연결객체해지(resource해지) close
		 */
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		/*
		 * << executeQuery >>
		 * ResultSet executeQuery(String sql) throws SQLException
				- Executes the given SQL statement, which returns a single ResultSet object.
			Parameters:
			sql - an SQL statement to be sent to the database, typically a static SQL SELECT statement
			Returns:
			a ResultSet object that contains the data produced by the given query; never null
		 */
		ResultSet rs=stmt.executeQuery(selectSql);
		/*
		 * <<ResultSet>>
		 * boolean next() throws SQLException
				- Moves the cursor forward one row from its current position. 
				- A ResultSet cursor is initially positioned before the first row; 
				the first call to the method next makes the first row the current row; 
				the second call makes the second row the current row, and so on.
				- When a call to the next method returns false, 
				the cursor is positioned after the last row.
		 */
		if(rs.next()) {
			/* --------------------------------
			 * DB타입 		| 자바타입
			 * --------------------------------
			 * number		| int,double(float)
			 * varchar2,char| String
			 * Date			| Date
			 * --------------------------------*/
			// do-while문: 한번 시행한 후 조건 만족시 루프순환 
			// (if문에서 rs.next() 한번 해서 커서의 위치가 before first 위치가 아님)
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
