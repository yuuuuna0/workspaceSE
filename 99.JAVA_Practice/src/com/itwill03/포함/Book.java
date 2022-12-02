package com.itwill03.포함;

public class Book {
	/*
	 * - 캡슐화하세요 - 생성자를 정의하세요
	 * 
	 * <<속성>> 책번호 책제목 책분류 책설명
	 * 
	 * <<기능>> 책정보출력
	 * 
	 */
	private String no;
	private String title;
	private String category;
	private String description;

	public Book() {

	}

	public Book(String no, String title, String category, String description) {
		this.no = no;
		this.title = title;
		this.category = category;
		this.description = description;
	}

	public void print() {
		System.out.println("\t"+no+"\t"+title+"\t"+category+description+"\n");
	}

	public String getNo() {
		return no;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getDescription() {
		return description;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
