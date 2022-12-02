package com.itwill02.constructor;

/*
	 * 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
	 *  - 캡슐화를 하세요
*/
public class Student {
	/*
	 * << 속성(멤버변수) >> 번호 이름 국어 영어 수학 총점 평균 평점 석차 << 기능(멤버메쏘드) >>
	 * 기본데이타입력,총점계산,평균계산,평점계산, 출력
	 */

	/*
	 * 멤버변수 선언
	 */
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	private int rank;

	/*
	 * <<생성자메쏘드 선언[오버로딩]>> - 인자 0개짜리 생성자(기본생성자선언) - 인자 5개짜리(번호 이름 국어 영어 수학) 생성자선언
	 */
	public Student() {

	}

	public Student(int no, String name, int kor, int eng, int math) {
		this.setData(no, name, kor, eng, math);
	}

	/*
	 * 멤버메쏘드 선언
	 */
	// setter, getter 메쏘드
	public int getTot() {
		System.out.println("총점: " + this.tot);
		return tot;
	}

	public char getGrade() {
		System.out.println("학점: " + this.grade);
		return grade;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 기본데이타(번호,이름,국어,영어,수학)멤버변수에대입하는메쏘드
	public void setData(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 총점계산메쏘드
	public void totCal() { // totCal, avgCal method에서 반환해야 하는 값이 필요하지 않기 때문에 return이 필요한 메쏘드로 짤 필요 없음
		this.tot = this.kor + this.eng + this.math; // this.tot에서 this를 붙여주지 않아도 로컬변수의 tot가 없기 때문에 멤버변수로 대입은 되지만 this를
													// 적어줄 거면 전부 다 적어주는 것을 관례로 한다.
	}

	// 평균계산메쏘드
	public void avgCal() {
		this.avg = this.tot / 3.0;
	}

	// 평점계산메쏘드
	public void gradeCal() {
		if (this.avg >= 90 && this.avg <= 100) {
			grade = 'A';
		} else if (this.avg >= 80 && this.avg < 90) {
			grade = 'B';
		} else if (this.avg >= 70 && this.avg < 80) {
			grade = 'C';
		} else if (this.avg >= 60 && this.avg < 70) {
			grade = 'D';
		} else
			grade = 'F';
	}

	// 총점,평균,평점 계산 출력 메쏘드
	public void calculation() {
		this.totCal();
		this.avgCal();
		this.gradeCal();
	}

	// 출력메쏘드
	public void printHeader() {
		System.out.printf("-----------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-------------------------------------------------%n");
	}

	public void print() {
		System.out.printf("%2d %5s %3d %4d %4d %4d %5.1f %3c %4d%n", this.no, this.name, this.kor, this.eng, this.math,
				this.tot, this.avg, this.grade, this.rank);
	}
}
