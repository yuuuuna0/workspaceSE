package com.itwill.emp;

public class EmpSQL {
	public final static String SELECT_BY_EMPNO_EMP_DEPT="select e.*,d.* from emp e join dept d on e.deptno=d.deptno where empno=?";
	public final static String SELECT_ALL_EMP_DEPT="select e.*,d.* from emp e join dept d on e.deptno=d.deptno";
	
}
