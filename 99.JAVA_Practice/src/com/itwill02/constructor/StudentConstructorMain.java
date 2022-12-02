package com.itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 * 학생객체생성(3명) - 1명은 기본생성자사용 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출 - 2명은 인자5개
		 * 생성자사용
		 */
		Student st1 = new Student();
		st1.setData(1, "정유가", 67, 87, 45);
		Student st2 = new Student(2, "정유나", 81, 98, 58);
		Student st3 = new Student(3, "정유다", 93, 89, 99);
		/*
		 * 학생총점계산 메쏘드 호출(3명) 학생평균계산 메쏘드 호출(3명) 학생평점계산 메쏘드 호출(3명)
		 */
		st1.calculation();
		st2.calculation();
		st3.calculation();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		st1.printHeader();
		st1.print();
		st2.print();
		st3.print();

		/*
		 * 학생 student1 의 이름변경한후(이름변경메쏘드호출후) student1학생객체출력 학생 student1 의 총점데이타 반환받은후
		 * 메인블록에서출력 학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		 */
		System.out.println();
		st1.setName("정유각");
		st1.print();
		st1.getTot();
		st1.getGrade();

	}

}
