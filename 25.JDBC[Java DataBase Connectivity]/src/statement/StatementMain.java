package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class StatementMain {

	public static void main(String[] args) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper03";
		String password="jdeveloper03";
		
		String selectSql="select empno,ename,job,sal,hiredate from emp order by sal desc";
		String insertSql="insert into emp values(9000,'KIM','MANAGER',null,to_date('2000/03/03','YYYY/MM/DD'),80000,null,40)";
		String updateSql="update emp set sal=sal*1.3 where empno>=7369 and empno<=7600";
		String deleteSql="delete from emp where empno=9000";
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		
		Statement stmt=con.createStatement();
		/*
		 * <<ResultSet의 행의 수 제한
		 * stmt.setMaxRows(3); --> 행의 수 3개로 제한
		 * stmt.setMaxRows(0); --> 행의 수 제한 없음(default)
		 */
		System.out.println("--------------------stmt.setMaxRow(3)-------------------");
		stmt.setMaxRows(3);
		/*
		  이름       널?       유형           
		-------- -------- ------------ 
		EMPNO    NOT NULL NUMBER(4)    
		ENAME             VARCHAR2(10) 
		JOB               VARCHAR2(9)  
		MGR               NUMBER(4)    
		HIREDATE          DATE         
		SAL               NUMBER(7,2)  
		COMM              NUMBER(7,2)  
		DEPTNO            NUMBER(2) 
		 */
		System.out.println("--------------------stmt.executeQuery(selectSql)-------------------");
		ResultSet rs=stmt.executeQuery(selectSql);
		while(rs.next()) {
			int empno=rs.getInt("empno");
			String ename=rs.getString("ename");
			String job=rs.getString("job");
			double sal=rs.getDouble("sal");
			Date hiredate=rs.getDate("hiredate");
			System.out.println(empno+"\t"+ename+"\t"+job+"\t"+sal+"\t"+hiredate);
		}
		rs.close();
		
		System.out.println("--------------------stmt.executeUpdate(dml)-------------------");
		int rowCount=0;
		rowCount=stmt.executeUpdate(insertSql);
		System.out.println("insert row count: "+rowCount);
		
		rowCount=stmt.executeUpdate(updateSql);
		System.out.println("update row count: "+rowCount);
		
		rowCount=stmt.executeUpdate(deleteSql);
		System.out.println("delete row count: "+rowCount);
		
		System.out.println("--------------------stmt.execute(anySql)-------------------");
		String anySql=selectSql;
		boolean isResultSet=stmt.execute(anySql);
		if(isResultSet) {
			ResultSet rs2=stmt.getResultSet();
			while(rs2.next()) {
				int empno=rs2.getInt("empno");
				String ename=rs2.getString("ename");
				String job=rs2.getString("job");
				double sal=rs2.getDouble("sal");
				Date hiredate=rs2.getDate("hiredate");
				System.out.println(empno+"\t"+ename+"\t"+job+"\t"+sal+"\t"+hiredate);
			}
		} else {
			int rowCount2=stmt.getUpdateCount();
			System.out.println(">> "+rowCount2 +" update(insert,update,delete)");
		}
	}

}
