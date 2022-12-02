
public class AcademyMemberTypeCastingMain {

	public static void main(String[] args) {
		/*
		 * public class AcademyStudent extends AcademyMember{}
		 * public class AcademyGangsa extends AcademyMember{}
		 * public class AcademyStaff extends AcademyMember{}
		 * 
		 * AcademyMember의 자식타입 객체(AcademyStudent,AcademyGangsa,AcademyStaff)들은
		 * AcademyMember 타입변수에 대입 가능
		 */
		AcademyStudent st1=new AcademyStudent(1,"KIM","Android");
		AcademyMember m1=st1;
		AcademyMember m2=new AcademyStudent(2,"Lee","JAVA");
		AcademyMember m3=new AcademyStudent(3,"JIM","OFFICE");
		
		AcademyMember m4=new AcademyGangsa(4, "박강사", "보안");
		AcademyMember m5=new AcademyGangsa(5, "정강사", "빅데이터");
		
		AcademyMember m6=new AcademyStaff(6, "천상용", "회계팀");
		AcademyMember m7=new AcademyStaff(6, "박승곤", "원장");
		/***** AcademyMember에 정의되지 않은 메쏘드 호출 불가능******
		String ban = m1.getBan();
		**************************************************************/
		/***** AcademyMember에 정의된 메쏘드 중 재정의된 메쏘드 호출 가능******/
		
		System.out.println("----------AcademyMember 전체 출력-----------------");
		m1.print();
		m2.print();
		m3.print();
		m4.print();
		m5.print();
		m6.print();
		m7.print();
		
		
	}

}
