package com.itwill.guest;

import java.util.Date;

/*
VO(Value Object),DTO(Data Transfer Object)
	- guest 테이블 1개 row의 데이타의 값을 가지는객체
	- guest 테이블 1개 row의 데이타값을 이동(파라메타,리턴데이타)시키기위한객체 
	- guest 테이블의 컬럼과 동일한수의 멤버변수를가지는객체
*/
/*
이름             널?       유형             
-------------- -------- -------------- 
GUEST_NO       NOT NULL NUMBER(10)     
GUEST_NAME              VARCHAR2(50)   
GUEST_DATE              DATE           
GUEST_EMAIL             VARCHAR2(50)   
GUEST_HOMEPAGE          VARCHAR2(50)   
GUEST_TITLE             VARCHAR2(100)  
GUEST_CONTENT           VARCHAR2(4000) 
*/

public class Guest {
	private int guest_no;
	private String guest_name;
	private Date guest_date;
	private String guest_email;
	private String guest_homepage;
	private String guest_title;
	private String guest_content;
	
	public Guest() {
	}

	public Guest(int guest_no, String guest_name, Date guest_date, String guest_email, String guest_homepage,
			String guest_title, String guest_content) {
		super();
		this.guest_no = guest_no;
		this.guest_name = guest_name;
		this.guest_date = guest_date;
		this.guest_email = guest_email;
		this.guest_homepage = guest_homepage;
		this.guest_title = guest_title;
		this.guest_content = guest_content;
	}

	public int getGuest_no() {
		return guest_no;
	}

	public String getGuest_name() {
		return guest_name;
	}

	public Date getGuest_date() {
		return guest_date;
	}

	public String getGuest_email() {
		return guest_email;
	}

	public String getGuest_homepage() {
		return guest_homepage;
	}

	public String getGuest_title() {
		return guest_title;
	}

	public String getGuest_content() {
		return guest_content;
	}

	public void setGuest_no(int guest_no) {
		this.guest_no = guest_no;
	}

	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name;
	}

	public void setGuest_date(Date guest_date) {
		this.guest_date = guest_date;
	}

	public void setGuest_email(String guest_email) {
		this.guest_email = guest_email;
	}

	public void setGuest_homepage(String guest_homepage) {
		this.guest_homepage = guest_homepage;
	}

	public void setGuest_title(String guest_title) {
		this.guest_title = guest_title;
	}

	public void setGuest_content(String guest_content) {
		this.guest_content = guest_content;
	}

	@Override
	public String toString() {
		return "Guest [guest_no=" + guest_no + ", guest_name=" + guest_name + ", guest_date=" + guest_date
				+ ", guest_email=" + guest_email + ", guest_homepage=" + guest_homepage + ", guest_title=" + guest_title
				+ ", guest_content=" + guest_content + "]\n";
	}
	
	
	
}
