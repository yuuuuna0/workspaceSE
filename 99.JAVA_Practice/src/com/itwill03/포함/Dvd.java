package com.itwill03.포함;

public class Dvd {
	/*
	 * - 캡슐화하세요 - 생성자를 정의하세요
	 * 
	 * <<속성>> 번호 타이틀 쟝르
	 * 
	 * <<기능>> Dvd정보출력
	 * 
	 */
	private int no;
	private String title;
	private String genre;

	public Dvd() {
	}

	public Dvd(int no, String title, String genre) {
		this.no = no;
		this.title = title;
		this.genre = genre;
	}

	public void print() {
		System.out.printf("%s\t%s\t%s\n", this.no, this.title, this.genre);
	}

	public int getNo() {
		return no;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
