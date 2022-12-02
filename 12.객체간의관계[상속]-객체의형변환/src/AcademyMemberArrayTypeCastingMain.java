 
public class AcademyMemberArrayTypeCastingMain {

	public static void main(String[] args) {
		AcademyMember[] members= {
				new AcademyStudent(1, "KIM", "JAVA"),
				new AcademyStudent(2, "LIM", "DESIGN"),
				new AcademyStudent(3, "FIM", "ANDROID"),
				new AcademyGangsa(4, "JIM", "IOS"),
				new AcademyGangsa(5, "BIM", "ANDROID"),
				new AcademyStaff(6, "TIM", "ACCOUNTING"),
				new AcademyStaff(7, "NIM", "MARKETING")
		};
		
		AcademyMember[] receiveMembers=members;
		
		System.out.println("-----AcademyMember 전체 출력------");
		for(int i=0;i<receiveMembers.length;i++) {
			/*
			 * AcademyStudent,AcadeyGangsa,AcademyStaff에서 재정의 된 print 메쏘드 호출
			 */
			receiveMembers[i].print();
		}
		
		System.out.println("--------intstanceof---------");
		/*
		 * 연산자-->  instanceof
		 * 		- 형태: 참조변수 instanceof 클래스이름
		 * 		- 연산결과: true or false
		 * 		-ex> boolean b=recieveMembers[0] instanceof AcademyStudent;
		 */
		AcademyMember am=new AcademyStudent(90, "김학생", "정보처리");
		if(am instanceof AcademyStudent) {
			AcademyStudent tempStudent=(AcademyStudent)am;
			String tempBan=tempStudent.getBan();
			System.out.println("학생반:"+tempBan);
		}
		System.out.println("-------------AcademyMember배열에 있는 객체들 중에서 AcademyStudent객체들만 출력----------------");
		for(int i=0;i<receiveMembers.length;i++) {
			if(receiveMembers[i] instanceof AcademyStudent) {
				receiveMembers[i].print();
				AcademyStudent tempStudent=(AcademyStudent)receiveMembers[i];
				System.out.println("학생반:"+tempStudent.getBan());
			}
		}
		
		
		
		
	}

}
