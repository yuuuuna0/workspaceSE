package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCFlowMain {

	public static void main(String[] args) throws Exception {
		
		/*******************데이터베이스 접속 정보************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		/*****************************************************************/
		String selectSql="select * from dept order by deptno";
		
		/*
		 * 1. Driver class loading
		 * 		A. Driver Class 객체 생성
		 * 		B. Driver Manager 객체 등록
		 */
		Class.forName(driverClass);	
		System.out.println("1. Driver class loading");
		/*
		 * 2. Connection 객체 생성
		 * 		- DB SErver와 연결객체
		 */
		Connection con= DriverManager.getConnection(url,user,password);
		System.out.println("2. Connection객체 생성: "+con);
		/*
		 * 3. Statement 객체 생성
		 * 		- SQL 전송 객체 생성
		 */
		Statement stmt=con.createStatement();
		System.out.println("3. Statement 객체 생성(SQL전송객체): "+stmt);
		/*
		 * 4. SQL문 전송
		 * 5. ResultSet 객체얻기(select)
		 *  ---------------------------------
		DEPTNO    DNAME        	LOC
		--------    -------------------------
		(cursor) ▶ BEFORE FIRST 영역
		10	 	ACCOUNTING		NEW YORK
		20		RESEARCH		DALLAS
		30		SALES			CHICAGO
		40		OPERATIONS		BOSTON
		AFTER LAST  영역   
		 */
		ResultSet rs=stmt.executeQuery(selectSql);
		System.out.println("4,5. ResultSet객체얻기(select문 실행 결과): "+rs);
		while(rs.next()){
			int deptno=rs.getInt("deptno");
			String dname=rs.getString("dname");
			String loc=rs.getString("loc");
			System.out.println(deptno+"\t"+dname+"\t"+loc);
		}
		/*
		 * 6. 연결객체해지(resource해지) close
		 */
		rs.close();
		stmt.close();
		con.close();
		System.out.println("6. 연결객체닫기");
	}

}
