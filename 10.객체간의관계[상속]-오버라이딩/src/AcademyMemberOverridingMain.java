
public class AcademyMemberOverridingMain {

	public static void main(String[] args) {
		/****** 존재하지 않는 객체 생성******
		AcademyMember academyMember=new AcademyMember(0, "누구");
		academyMember.print();
		************************************/
		
		AcademyStudent student1=new AcademyStudent(1, "KIM", "LINUX");
		AcademyStudent student2=new AcademyStudent(2, "KANG", "JAVA");
		
		AcademyGangsa gangsa1=new AcademyGangsa(3, "BOGUS", "자바");
		AcademyGangsa gangsa2=new AcademyGangsa(4, "HONG", "오피스");
		
		AcademyStaff staff1=new AcademyStaff(5, "LEE", "영업");
		AcademyStaff staff2=new AcademyStaff(6, "PARK", "취업팀");
		
		System.out.println("----------------Student--------------------");
		/******호출되면 안되는 메쏘드 호출*******
		 student1.print();
		 ****************************************/
		student1.print();
		student2.print();
		System.out.println("----------------Gangsa--------------------");
		gangsa1.print();
		gangsa2.print();
		System.out.println("----------------Staff--------------------");
		staff1.print();
		staff2.print();
		
		
		
	}

}
