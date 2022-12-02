package com.itwill00.variable;

public class DuoMemberInfoPrint {

	public static void main(String[] args) {

		// 변수선언
		int IDNumber;
		String name;
		String memberIdenNum;
		char gender;
		int marriageCount;
		boolean smoking;
		double height;
		char score;
		String appearance;

		// 변수에 데이터 대입
		IDNumber = 236514;
		name = "홍길동";
		memberIdenNum = "201212 - 3495039";
		gender = '남';
		marriageCount = 0;
		smoking = true;
		height = 178.3;
		score = 'A';
		appearance = "상(중)";

		// 변수내용출력
		System.out.println("************************************");
		System.out.println("회원번호  :  " + IDNumber);
		System.out.println("이    름  :  " + name);
		System.out.println("주민번호  :  " + memberIdenNum);
		System.out.println("성    별  :  " + gender);
		System.out.println("결혼횟수  :  " + marriageCount);
		System.out.println("흡연여부  :  " + smoking);
		System.out.println("키        :  " + height);
		System.out.println("학    점  :  " + score);
		System.out.println("용    모  :  " + appearance);
		System.out.println("************************************");

	}

}
