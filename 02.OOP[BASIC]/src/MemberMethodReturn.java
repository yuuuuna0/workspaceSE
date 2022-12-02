
public class MemberMethodReturn {
	/*
	 * 멤버필드
	 * 		-멤버필드 선언시 값을 대입할 수 있다.(멤버필드 선언 및 초기화)
	 */
	int memberField1=10;
	int memberField2=20;
	int memberField3=30;
	/*
	 * setter method
	 */
	
	/*
	 * getter method
	 */
	
	int getMemberField1() {
		return memberField1;
	}

	int getMemberField2() {
		return memberField2;
	}

	int getMemberField3() {
		return memberField3;
	}

	void setMemberField1(int memberField1) {
		this.memberField1 = memberField1;
	}

	void setMemberField2(int memberField2) {
		this.memberField2 = memberField2;
	}

	void setMemberField3(int memberField3) {
		this.memberField3 = memberField3;
	}

	/*
	 * 멤버메쏘드
	 */
	int method1() {
		System.out.println("---int method1()실행---");
		int result=1+2;
		System.out.println("---int method1()실행종료후 int 데이터 반환---");
		/*
		 * return <<호출한 클래스(객체)에게 반환할 값(변수,리터럴,연산의 결과)>>;
		 * 		- 호출한 곳으로 실행 흐름 반환
		 * 		- 호출한 곳으로 데이터도 반환
		 * 		- 반환할 데이터가 없는 경우에는 return타입을 void로설정 후 return 생략 가능
		 * 		- 반환할 데이터가 있는 경우에는 return타입을 원하는 타입으로 설정 후 return 후 기술된 데이터 반환(return 생략 불가능)
		 */
		return result;
	}
	
	boolean method2() {
		boolean isMarried=false;
		System.out.println("---boolean method2()실행---");
		System.out.println("---boolean method2()실행종료후 boolean 데이터 반환---");
		return isMarried;
	}
	
	 //두개의 정수를 파라메타로 받아서 더한 결과(정수)를 반환하는 메쏘드
	 int add(int a,int b) {
		 System.out.println("---int add(int a,int b)실행---");
		 System.out.println("---int add(int a,int b)실행종료후 int 데이터 반환---");
		 int result = a+b;
		 return result;
	 }

	public String hello(String name) {
		System.out.println("---String hello(String name)실행---");
		System.out.println("---String hello(String name)실행종료후 String 데이터 반환---");
		String msg="";
		msg=name+"님 안녕하세요!!";
		return msg;
	}
	
	
}
