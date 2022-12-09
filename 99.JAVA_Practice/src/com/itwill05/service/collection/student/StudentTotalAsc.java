package com.itwill05.service.collection.student;

public class StudentTotalAsc implements Comparable<Student>{

	@Override
	public int compareTo(Student nextStudent) {
		Student studentT=new Student();
		return (studentT.getTot())-(nextStudent.getTot());
	}

}
