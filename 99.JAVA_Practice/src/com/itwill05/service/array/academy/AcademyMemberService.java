package com.itwill05.service.array.academy;
/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */
public class AcademyMemberService {
	private AcademyMember[] members;

	public AcademyMemberService() {
		members = new AcademyMember[9];
		members[0] = new AcademyStudent(1, "KIM", "자바");
		members[1] = new AcademyStudent(2, "LEE", "리눅스");
		members[2] = new AcademyStudent(3, "KIM", "자바");
		members[3] = new AcademyStudent(4, "LEE", "IOT");
		members[4] = new AcademyGangsa(5, "CHOI", "프로그래밍");
		members[5] = new AcademyGangsa(6, "KIM", "DB");
		members[6] = new AcademyGangsa(7, "DIM", "OS");
		members[7] = new AcademyStaff(8, "AIM", "영업");
		members[8] = new AcademyStaff(9, "QIM", "생산");

	}


	 // 1.AcademyMember 전체출력
	public void print() {
		for (AcademyMember academyMember : members) {
			academyMember.print();
		}
	}

	/*
	 * 2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘
	 * 
	 */
	public AcademyMember findNo(int no) {
		AcademyMember tempMember=new AcademyMember();
		for (AcademyMember academyMember : members) {
			if(academyMember.getNo()==no) {
				tempMember=academyMember;
				break;
			}
		}
		return tempMember;
	}
	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember[] findName(String name) {
		int count=0;
		for (AcademyMember academyMember : members) {
			if(academyMember.getName().equals(name)) {
				count++;
			}
		}
		AcademyMember[] tempMember=new AcademyMember[count];
		int a=0;
		for (AcademyMember academyMember : members) {
			if(academyMember.getName().equals(name)) {
				tempMember[a]=academyMember;
				a++;
			}
		}
		return tempMember;
	}
	/*
	 * 3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyStaff객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */
	
	public AcademyMember[] findStudent() {
		int index=0;
		for (AcademyMember academyMember : members) {
			if(academyMember instanceof AcademyStudent) index++;
		}
		AcademyMember[] academyMember=new AcademyMember[index];
		int a=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				academyMember[a]=members[i];
				a++;
			} 
		}
		return academyMember;
	}
	public AcademyMember[] findStaff() {
		int index=0;
		for (AcademyMember academyMember : members) {
			if(academyMember instanceof AcademyStaff) index++;
		}
		AcademyMember[] academyMember=new AcademyMember[index];
		int a=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				academyMember[a]=members[i];
				a++;
			} 
		}
		return academyMember;
	}
	public AcademyMember[] findGangsa() {
		int index=0;
		for (AcademyMember academyMember : members) {
			if(academyMember instanceof AcademyGangsa) index++;
		}
		AcademyMember[] academyMember=new AcademyMember[index];
		int a=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				academyMember[a]=members[i];
				a++;
			} 
		}
		return academyMember;
	}
	/*
	 * 4.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘
	 */
	public AcademyMember[] findClass() {
		AcademyMember[] student=this.findStudent();
		int index=0;
		for (AcademyMember academyMember : student) {
			if(academyMember.getClass().equals("자바")) index++;
		}
		AcademyMember[] java=new AcademyMember[index];
		int a=0;
		for (int i = 0; i < student.length; i++) {
			if(student[i].get().equals("자바")) {
				java[a]=student[i];
			}
		}
		return java;
	}
	public AcademyMember[] findDepart() {
		AcademyMember[] staff=this.findStaff();
		int index=0;
		for (AcademyMember academyMember : staff) {
			if(academyMember.g) index++;
		}
		AcademyMember[] java=new AcademyMember[index];
		int a=0;
		for (int i = 0; i < student.length; i++) {
			if(student[i].getClass().equals("자바")) {
				java[a]=student[i];
			}
		}
		return java;
	}

	/*
	 * 5.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘[OPTION]
	 * 5.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘[OPTION] 
	 * 5.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘[OPTION]
	 */

}
