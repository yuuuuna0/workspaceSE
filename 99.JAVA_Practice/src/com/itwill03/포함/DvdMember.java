package com.itwill03.포함;

public class DvdMember {
	/*
	 * - 캡슐화 <<속성>> 회원번호 회원이름 전화번호 빌린dvd
	 */
	/*
	 * <<기능>> 회원정보출력
	 */
	private int noMember;
	private String name;
	private String callNumber;
	private Dvd rentDvd;

	public DvdMember() {
	}

	public DvdMember(int noMember, String name, String callNumber, Dvd rentDvd) {
		super();
		this.noMember = noMember;
		this.name = name;
		this.callNumber = callNumber;
		this.rentDvd = rentDvd;
	}

	public void print() {
		System.out.println(
				"------------------------------------------------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t\t%s\n", "회원번호", "회원이름", "전화번호", "DVD번호", "DVD제목", "장르");
		System.out.printf("%d\t\t%s\t\t%s\t", this.noMember, this.name, this.callNumber);
		this.rentDvd.print();
		System.out.println(
				"------------------------------------------------------------------------------------------------");
	}

	public int getNoMember() {
		return noMember;
	}

	public String getName() {
		return name;
	}

	public String getCallNumber() {
		return callNumber;
	}

	public Dvd getRentDvd() {
		return rentDvd;
	}

	public void setNoMember(int noMember) {
		this.noMember = noMember;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}

	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
	}

}
