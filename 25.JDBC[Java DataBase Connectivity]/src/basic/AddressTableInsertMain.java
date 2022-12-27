package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressTableInsertMain {

	public static void main(String[] args) throws Exception {
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

}
