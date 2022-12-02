package com.itwill01.field;

public class StudentMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 2명생성
		 */

		/*
		 * 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */

		/*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */

		/*
		 * 학생 데이타를 출력 2명
		 */
		/*
		 * - 출력포맷 - 평균은 소수점이하 첫째자리까지출력(반올림) - 석차는 구하지마세요 --------------학생
		 * 성적출력------------------- 학번 이름 국어 영어 수학 총점 평균 평점 석차
		 * ----------------------------------------------- 1 김경호 42 56 78 334 34.8 A 3 2
		 * 김경수 45 53 76 334 34.8 A 2 -----------------------------------------------
		 */
		Student std1 = new Student();
		Student std2 = new Student();

		std1.id = 1;
		std1.name = "김경호";
		std1.kor = 86;
		std1.eng = 95;
		std1.math = 76;
		std1.rank = 0;
		std2.id = 2;
		std2.name = "정유나";
		std2.kor = 78;
		std2.eng = 94;
		std2.math = 81;
		std2.rank = 0;

		std1.tot = std1.kor + std1.eng + std1.math;
		std2.tot = std2.kor + std2.eng + std2.math;
		std1.avg = std1.tot / 3.0;
		std2.avg = std2.tot / 3.0;
		if (std1.avg >= 90 && std1.avg <= 100) {
			std1.score = 'A';
		} else if (std1.avg >= 80 && std1.avg < 90) {
			std1.score = 'B';
		} else if (std1.avg >= 70 && std1.avg < 80) {
			std1.score = 'C';
		} else if (std1.avg >= 60 && std1.avg < 70) {
			std1.score = 'D';
		} else if (std1.avg >= 50 && std1.avg < 60) {
			std1.score = 'F';
		}
		if (std2.avg >= 90 && std2.avg <= 100) {
			std2.score = 'A';
		} else if (std2.avg >= 80 && std2.avg < 90) {
			std2.score = 'B';
		} else if (std2.avg >= 70 && std2.avg < 80) {
			std2.score = 'C';
		} else if (std2.avg >= 60 && std2.avg < 70) {
			std2.score = 'D';
		} else if (std2.avg >= 50 && std2.avg < 60) {
			std2.score = 'F';
		}

		System.out.printf("-----------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-------------------------------------------------%n");
		System.out.printf("%2d %5s %3d %4d %4d %4d %5.1f %3c %4d%n", std1.id, std1.name, std1.kor, std1.eng, std1.math,
				std1.tot, std1.avg, std1.score, std1.rank);
		System.out.printf("%2d %5s %3d %4d %4d %4d %5.1f %3c %4d%n", std2.id, std2.name, std2.kor, std2.eng, std2.math,
				std2.tot, std2.avg, std2.score, std2.rank);

	}

}