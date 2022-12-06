package com.itwill06.collection.student;

import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayListMain {

	public static void main(String[] args) {
		/*
		 * 0.학생ArrayList객체생성초기화
		 */
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(1,"KIM",89,93,94));
		studentList.add(new Student(2,"HIM",88,77,98));
		studentList.add(new Student(3,"AIM",65,87,99));
		studentList.add(new Student(4,"KIM",75,97,60));
		studentList.add(new Student(5,"XIM",85,98,90));
		studentList.add(new Student(6,"TIM",95,88,77));
		studentList.add(new Student(7,"KIM",99,93,95));
		studentList.add(new Student(8,"LIM",83,80,99));
		studentList.add(new Student(9,"QIM",73,90,80));
		/*
		 * 0.학생두명추가
		 */
		studentList.add(new Student(10,"JUNG",35,89,60));S
		studentList.add(new Student(11,"CHOI",95,82,68));
		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
		for (Student student : studentList) {
			student.calculation();
		}
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		Student tempList=new Student();
		for (Student student : studentList) {
			for(int i=0;i<studentList.size()-1;i++) {
				if(studentList.get(i).getTot()>studentList.get(i+1).getTot()) {
					studentList.get(i).getRank()++;
				}
			}
		}
		/*
		 * 3. 전체학생출력
		 */
		System.out.println("3. 전체학생출력 (enhanced for)");
		Student.headerPrint();
		/*
		 * 4. 번호3번 학생한명 출력
		 */
		System.out.println("4.번호3번 학생한명 출력  ");
		/*
		 * 5. 학점A인 학생들 출력
		 */
		System.out.println("5. 학점A인 학생들 출력");
		/*
		 6.이름이 KIM인학생들 출력
		 */
		System.out.println("6.이름이 KIM인학생들 출력");
		/*
		 * 7.번호3번학생한명삭제
		 */
		System.out.println("7.번호3번학생삭제");
		/*
		 * 8.이름KIM인 학생들삭제
		 */
		System.out.println("8.이름KIM인 학생들삭제");
		/*
		 * 9.평점 F 인 학생들삭제
		 */
		System.out.println("9.평점 F 인 학생들삭제");
		/******************안해도됨******************************/
		/*
		 * 10. 학생총점으로 오름차순정렬
		 */
		System.out.println("10. 학생총점으로 내림차순정렬");
		/*
		  11. 학생이름순으로 오름차순정렬
		 */
		System.out.println("11.학생이름순으로 오름차순정렬");
		/********************************************************/
	}

}
