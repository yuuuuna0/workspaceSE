package com.itwill05.service.array.academy;

public class AcadeMemberServiceMain {

	public static void main(String[] args) {
		AcademyMemberService academyMemberService=new AcademyMemberService();
		System.out.println("1.AcademyMember 전체출력");
		academyMemberService.print();
		System.out.println("2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘");
		academyMemberService.findNo(1);
		System.out.println("2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘");
		academyMemberService.findName("KIM");
		System.out.println("3.AcademyMember 중에서 1-AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		System.out.println("3.AcademyMember 중에서 2-AcademyStaff객체들  모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		System.out.println("3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		academyMemberService.findStudent();
		academyMemberService.findStaff();
		academyMemberService.findGangsa();
		System.out.println(
		"4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		System.out.println(
		"4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		System.out.println(
		"4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		System.out.println(academyMemberService.findBan());
		System.out.println(academyMemberService.findDepart());
		System.out.println(academyMemberService.findSubject());
		System.out.println("---------------------------------------------");
		System.out.println(
				"5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		System.out.println(
				"5.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		System.out.println(
				"5.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		
		
		
	}

}
