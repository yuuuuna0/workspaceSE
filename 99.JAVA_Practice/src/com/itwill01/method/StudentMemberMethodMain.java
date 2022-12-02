package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		 * 학생객체생성(3명)
		 */
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();

		/*
		 * 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		st1.setData(1, "정유나", 94, 36, 88);
		st2.setData(2, "김나영", 95, 37, 87);
		st3.setData(3, "김현지", 68, 87, 59);
		/*
		 * 학생총점계산 메쏘드 호출(3명) 학생평균계산 메쏘드 호출(3명) 학생평점계산 메쏘드 호출(3명)
		 */
		st1.totCal();
		st1.avgCal();
		st1.gradeCal();
		st2.totCal();
		st2.avgCal();
		st2.gradeCal();
		st3.totCal();
		st3.avgCal();
		st3.gradeCal();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		st1.printHeader();
		st1.print();
		st2.print();
		st3.print();
	}

}
