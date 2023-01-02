package com.itwill.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.itwill.common.DataSource;


public class EmpDao {
	private DataSource dataSource;
	
	public EmpDao() throws Exception{
		dataSource=new DataSource();
	}	
	
	public Map findByPrimaryKeyWithDept(int empno) throws Exception {
		Map rowMap=new HashMap();
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(EmpSQL.SELECT_BY_EMPNO_EMP_DEPT);
		pstmt.setInt(1, empno);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			//emp table 정보
			int eno=rs.getInt("empno");
			String ename=rs.getString("ename");
			String job=rs.getString("job");
			//dept table 정보
			String dname=rs.getString("dname");
			String loc=rs.getString("loc");
			rowMap.put("EMPNO", eno);
			rowMap.put("ENAME", ename);
			rowMap.put("JOB", job);
			rowMap.put("DNAME", dname);
			rowMap.put("LOC", loc);
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return rowMap;
	}                                                     
	public List<Map> findAllWithDept() throws Exception{
		List<Map> rowMapList=new ArrayList<Map>();
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(EmpSQL.SELECT_ALL_EMP_DEPT);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			Map rowMap=new HashMap();
			//emp table 정보
			int eno=rs.getInt("empno");
			String ename=rs.getString("ename");
			String job=rs.getString("job");
			//dept table 정보
			String dname=rs.getString("dname");
			String loc=rs.getString("loc");
			rowMap.put("EMPNO", eno);
			rowMap.put("ENAME", ename);
			rowMap.put("JOB", job);
			rowMap.put("DNAME", dname);
			rowMap.put("LOC", loc);
			rowMapList.add(rowMap);
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return rowMapList;
	}
	
}
