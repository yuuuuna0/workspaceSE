package com.itwill00.variable;

public class StudentPrint {

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

		int ID1, ID2;
		String name1, name2;
		int kor1, kor2;
		int eng1, eng2;
		int math1, math2;
		double total1, total2;
		double avg1, avg2;
		char score1, score2;
		int rank1, rank2;

		ID1 = 1;
		ID2 = 2;
		name1 = "김경호";
		name2 = "정유나";
		kor1 = 80;
		kor2 = 76;
		eng1 = 69;
		eng2 = 82;
		math1 = 51;
		math2 = 47;
		score1 = 'F';
		score2 = 'F';
		rank1 = 0;
		rank2 = 0;

		total1 = kor1 + eng1 + math1;
		total2 = kor2 + eng2 + math2;
		avg1 = ((total1 / 3) * 10 + 5) / 10;
		avg2 = ((total2 / 3) * 10 + 5) / 10;

		System.out.println("---------------학생 성적출력------------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");
		System.out.println("-----------------------------------------------");
		System.out.println(" " + ID1 + "   " + name1 + "   " + kor1 + "   " + eng1 + "   " + math1 + "   "
				+ (int) total1 + "   " + (int) avg1 + "   " + score1 + "    " + rank1);
		System.out.println(" " + ID2 + "   " + name2 + "   " + kor2 + "   " + eng2 + "   " + math2 + "   "
				+ (int) total2 + "   " + (int) avg2 + "   " + score2 + "    " + rank2);
		System.out.println("-----------------------------------------------");

		avg1 = total1 / 3;
		avg2 = total2 / 3;
		System.out.println("-----------------------------------------------");
		System.out.printf(" %d   %s   %d   %d   %d   %d  %.1f  %c    %d\n", ID1, name1, kor1, eng1, math1, (int) total1,
				avg1, score1, rank1);
		System.out.printf(" %d   %s   %d   %d   %d   %d  %.1f  %c    %d\n", ID2, name2, kor2, eng2, math2, (int) total2,
				avg2, score2, rank2);
		System.out.println("-----------------------------------------------");

	}

}
