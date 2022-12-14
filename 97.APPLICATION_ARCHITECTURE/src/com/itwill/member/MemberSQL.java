package com.itwill.member;

public class MemberSQL {
	public static final String INSERTSQL="insert into member(m_id,m_password,m_name,m_address,m_age,m_married,m_regdate) values(?,?,?,?,?,?,sysdate)";
	public static final String UPDATESQL="update member set m_password=?,m_name=?,m_address=?,m_age=?,m_married=? where m_id=?";
	public static final String DELETESQL="delete from member where m_id=?";
	public static final String FINDBYIDSQL="select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate from member where m_id=?";
	public static final String FINDALLSQL="select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate from member";
}
