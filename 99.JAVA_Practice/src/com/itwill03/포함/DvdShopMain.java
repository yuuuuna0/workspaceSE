package com.itwill03.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */

		/*
		 * Dvd객체생성
		 */

		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */

		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		DvdMember member1 = new DvdMember();
		Dvd dvd1 = new Dvd(1111, "비포선셋", "로맨스");

		member1.setNoMember(1);
		member1.setName("정유나");
		member1.setCallNumber("010-1234-5678");
		member1.setRentDvd(dvd1);

		member1.print();

	}

}
