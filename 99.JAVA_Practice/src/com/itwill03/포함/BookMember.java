package com.itwill03.포함;

public class BookMember {
	/*
	 * - 캡슐화
	 * 
	 * <<속성>> 회원번호 회원이름 전화번호 빌린책
	 */
	/*
	 * <<기능>> 회원정보출력
	 */
	private int noMember;
	private String name;
	private String callNumber;
	private Book rentBook;
	
	public BookMember() {
	}

	public BookMember(int noMember, String name, String callNumber, Book rentBook) {
		this.noMember = noMember;
		this.name = name;
		this.callNumber = callNumber;
		this.rentBook = rentBook;
	}

	public BookMember(int noMember, String name, String callNumber) {
		this.noMember = noMember;
		this.name = name;
		this.callNumber = callNumber;
	}

	public void print() {
		System.out.println(
				"------------------------------------------------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "회원번호", "회원이름", "전화번호", "책번호", "책제목", "책분류", "책설명");
		System.out.printf("%d\t\t%s\t\t%s\t", this.noMember, this.name, this.callNumber);
		this.rentBook.print();
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

	public Book getRentBook() {
		return rentBook;
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

	public void setRentBook(Book rentBook) {
		this.rentBook = rentBook;
	}

}
