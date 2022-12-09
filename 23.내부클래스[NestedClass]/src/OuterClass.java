
public class OuterClass {
	//인스턴스 멤버필드
	public int outer_member_field=8888;
	//인스턴스 멤버메쏘드
	public void outer_member_method() {
		System.out.println("OuterClass.member_method()");
	}
	/***********************************************************/
	
	
	
	
	
	
	
	
	/*
	 * 인스턴스 멤버클래스(Nested class,Inner Class)
	 * 		- 작성이유: 내부클래스에서 외부클래스의 멤버 접근을 손쉽게 하기 위해서 작성
	 */
	public class InnerClass{
		public int inner_member_field=3333;
		public void inner_member_method() {
			System.out.println("InnerClass.member_method()");
		}
		/**************Inner(내부클래스)에서 Outer(외부클래스)의 멤버로 접근***********/
		public void inner_outer_member_access() {
			System.out.println(InnerClass.class);
			System.out.println(OuterClass.this);
		}
	}
	
}
