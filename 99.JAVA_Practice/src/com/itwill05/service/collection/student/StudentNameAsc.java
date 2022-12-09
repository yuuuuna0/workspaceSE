package com.itwill05.service.collection.student;

public class StudentNameAsc implements Comparable<Student>{

	@Override
	public int compareTo(Student nextStudent) {
		Student studentN=new Student();
		return studentN.getName().compareTo(nextStudent.getName());
	}

}
