package dao.member;

public class MemberSQL {
	public static final String INSERTSQL="insert into member(m_id,m_password,m_name,m_address,m_age,m_married,m_regdate) values(?,?,?,?,?,?,?)";
	public static final String UPDATESQL="update member set m_password=?,m_name=?,m_address=?,m_age=?,m_married=?,m_regdate=? where m_id=?";
	public static final String DELETESQL="delete from member where m_id=?";
	public static final String FINDSQL="select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate from member where m_id=?";
	
	

}
