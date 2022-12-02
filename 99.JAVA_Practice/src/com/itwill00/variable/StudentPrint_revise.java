package com.itwill00.variable;

public class StudentPrint_revise {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언 - 번호(int), 이름(String), 국어, 영어, 수학, 총점, 평균(double),
		 * 평점(A,B,C)(char), 석차(int)
		 */

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력
		 */

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서 총점, 평균 계산 후 대입 (평점은 F , 석차는 0을 대입)
		 */

		/*
		 * - 출력포맷 - 평균은 소수점이하 자리수를 잘라버리세요[or 반올림하세요]. - 석차,평점은 구하지마세요
		 * 
		 * --------------학생 성적출력------------------- 학번 이름 국어 영어 수학 총점 평균 평점 석차
		 * ----------------------------------------------- 1 김경호 42 56 78 334 89 A 3 2
		 * 김경수 45 53 76 334 78 A 2 -----------------------------------------------
		 */

		int iD1, iD2; // 변수의 첫 글자 대문자 쓰지 않기
		String name1, name2;
		int kor1, kor2;
		int eng1, eng2;
		int math1, math2;
		double total1, total2;
		double avg1, avg2;
		char score; // score, rank 값 같은 값이기 떄문에 굳이 두 번 선언 할 필요가 없음
		int rank;

		iD1 = 1;
		iD2 = 2;
		name1 = "김경호";
		name2 = "정유나";
		kor1 = 80;
		kor2 = 76;
		eng1 = 69;
		eng2 = 82;
		math1 = 51;
		math2 = 47;
		score = 'F';
		rank = 0;

		total1 = kor1 + eng1 + math1;
		total2 = kor2 + eng2 + math2;
		avg1 = ((total1 / 3) * 10 + 5) / 10;
		avg2 = ((total2 / 3) * 10 + 5) / 10;

		System.out.println("---------------학생 성적출력------------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");
		System.out.println("-----------------------------------------------");
		System.out.println(" " + iD1 + "   " + name1 + "   " + kor1 + "   " + eng1 + "   " + math1 + "   "
				+ (int) total1 + "   " + (int) avg1 + "   " + score + "    " + rank);
		System.out.println(" " + iD2 + "   " + name2 + "   " + kor2 + "   " + eng2 + "   " + math2 + "   "
				+ (int) total2 + "   " + (int) avg2 + "   " + score + "    " + rank);
		System.out.println("-----------------------------------------------");

		avg1 = total1 / 3; // 만일 total이 int라면 /3.0으로 계산할 경우 avg는 double로 연산 가능함
		avg2 = total2 / 3;
		System.out.println("-----------------------------------------------");
		System.out.printf(" %d   %s   %d   %d   %d   %.0f  %.1f  %c    %d\n", iD1, name1, kor1, eng1, math1, total1,
				avg1, score, rank); // total 앞에 (int)를 넣는 법도 있고 앞에 링크 걸 때 %.0f로 걸어주는 법도 있음
		System.out.printf(" %d   %s   %d   %d   %d   %.0f  %.1f  %c    %d\n", iD2, name2, kor2, eng2, math2, total2,
				avg2, score, rank);
		System.out.println("-----------------------------------------------");

	}

}
