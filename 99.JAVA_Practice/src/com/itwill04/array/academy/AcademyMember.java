package com.itwill04.array.academy;
/*
 * AcademyMember들이 가져야 할 공통멤버를 가짐
 */
public class AcademyMember extends Object {
    private int no;		//번호
    private String name;	//이름
    public AcademyMember() {

    }
    public AcademyMember(int no, String name) {
    	super();
    	this.no = no;
    	this.name = name;
    }
    public void print() {
    	System.out.print(this.no+"\t"+this.name+"\t");
    }
    
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}

}
