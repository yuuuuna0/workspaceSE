
public class MemberMethodMain {

	public static void main(String[] args) {
		System.out.println("main stmt1");
		MemberMethod mm1 = new MemberMethod();
		/*
		 * 멤버메쏘드 실행(호출)
		 *  -형식: 참조(주소)변수.메쏘드이름();
		 *  -main실행흐름을 mm1주소에 있는 객체의 method1이라는 이름의 메쏘드(실행코드블록)로 보낸다.
		 */
		mm1.method1();
		System.out.println("main stmt2");
		mm1.method2();
		System.out.println("main stmt3");
		System.out.println("********매개변수가 있는 메쏘드 호출********");
		mm1.method3(3);		//3이 매개변수로 들어가는 리터럴
		System.out.println("main stmt4");
		mm1.method3(5);
		System.out.println("main stmt5");
		mm1.method4("안녕",3);
		System.out.println("main stmt6");
		mm1.method4("수업끝!!!",10);
		System.out.println("main stmt7");
		/*
		 * Quiz:
		 * 		정유나 님 누구세요!
		 * 		정유나 님 누구세요!
		 * 		정유나 님 누구세요!
		 */
		mm1.method5("정유나","누구세요",3);
		System.out.println("main stmt8");
		mm1.method5("이효리","뭐하세요",3);
		System.out.println("main block end");
		
		return;
	}

}
