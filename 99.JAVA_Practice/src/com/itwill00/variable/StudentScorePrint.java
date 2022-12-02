package com.itwill00.variable;

public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언 - 번호, 이름, 국어, 영어, 수학, 총점, 평균,
		 * 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력
		 */

		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크 - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */

		/*
		 * - 출력포맷 - 평균은 소수점이하 첫째자리까지출력(반올림) - 석차는 구하지마세요 --------------학생
		 * 성적출력------------------- 학번 이름 국어 영어 수학 총점 평균 평점 석차
		 * ----------------------------------------------- 1 김경호 42 56 78 334 34.8 A 3 2
		 * 김경수 45 53 76 334 34.8 A 2 -----------------------------------------------
		 */

		// 변수 선언
		int iD;
		String name1, name2;
		int kor1, kor2, eng1, eng2, math1, math2;
		double sum1, sum2;
		double avg1, avg2;
		char score1, score2;
		int rank;

		// 리터럴 대입
		iD = 1;
		name1 = "김경호";
		name2 = "정유나";
		kor1 = 83;
		kor2 = 79;
		eng1 = 71;
		eng2 = 82;
		math1 = 49;
		math2 = 71;
		rank = 0;

		// 유효성 체크
		if ((kor1 < 0 || kor1 > 100) || (kor2 < 0 || kor2 > 100) || (eng1 < 0 || eng1 > 100) || (eng2 < 0 || eng2 > 100)
				|| (math1 < 0 || math1 > 100) || (math2 < 0 || math2 > 100)) {
			System.out.println("점수 입력이 잘못되었습니다.");
			return;
		}

		// 연산
		sum1 = kor1 + eng1 + math1;
		sum2 = kor2 + eng2 + math2;
		avg1 = sum1 / 3.0;
		avg2 = sum2 / 3.0;
		score1 = 'X';
		score2 = 'X';
		if (avg1 >= 90) {
			score1 = 'A';
		} else if (avg1 >= 80) {
			score1 = 'B';
		} else if (avg1 >= 70) {
			score1 = 'C';
		} else if (avg1 >= 60) {
			score1 = 'D';
		} else {
			score1 = 'F';
		}
		if (avg2 >= 90) {
			score2 = 'A';
		} else if (avg2 >= 80) {
			score2 = 'B';
		} else if (avg2 >= 70) {
			score2 = 'C';
		} else if (avg2 >= 60) {
			score2 = 'D';
		} else {
			score2 = 'F';
		}

		// 출력
		System.out.println("-----------------학생 성적출력-------------------");
		System.out.println("학번 이름  국어 영어 수학  총점  평균  평점 석차");
		System.out.println("-------------------------------------------------");
		System.out.printf("%2d %4s %3d %4d %4d %5.0f %6.1f %3c %4d\n", iD, name1, kor1, eng1, math1, sum1, avg1, score1,
				rank);
		System.out.printf("%2d %4s %3d %4d %4d %5.0f %6.1f %3c %4d\n", iD += 1, name2, kor2, eng2, math2, sum2, avg2,
				score2, rank);
		System.out.println("-------------------------------------------------");

	}

}
