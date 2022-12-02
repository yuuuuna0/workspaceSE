package com.itwill03.포함;

public class BookLibraryMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		/*
		 * 책객체생성
		 */

		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		BookMember member1 = new BookMember();
		Book book1 = new Book("1가", "혼공자", "IT서적", "혼자 공부하는 자바 책");
		member1.setNoMember(1);
		member1.setName("정유나");
		member1.setCallNumber("010-1234-5678");
		member1.setRentBook(book1);

		member1.print();
	}

}
