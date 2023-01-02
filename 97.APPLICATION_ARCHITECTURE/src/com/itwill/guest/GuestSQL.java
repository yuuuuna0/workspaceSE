package com.itwill.guest;

public class GuestSQL {
	public static final String INSERTSQL="insert into guest values(guest_guest_no_seq.nextval,?,sysdate,?,?,?,?)";
	public static final String DELETESQL="delete from guest where guest_no=?";
	public static final String UPDATESQL="update guest set guest_name=?,guest_email=?,guest_homepage=?,guest_title=?,guest_content=? where guest_no=?";
	public static final String FINDBYNOSQL="select * from guest where guest_no=?";
	public static final String FINDBYNAMESQL="select * from guest where guest_name=?";
	public static final String FINDALLSQL="select * from guest";
	
}
