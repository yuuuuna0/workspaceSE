
public class OuterClass {
	//인스턴스 멤버필드
	public int outer_member_field=8888;
	//인스턴스 멤버메쏘드
	public void outer_member_method() {
		System.out.println("OuterClass.member_method()");
	}
	/**************Outter(외부클래스)에서 Inner(내부클래스)의 객체 생성 후 사용***********/
	public void outer_inner_class_use() {
		InnerClass ic=new InnerClass();		//OuterClass.InnerClass ic=new OuterClass.InnerClass();
		System.out.println(ic.inner_member_field=12121212);
		ic.inner_member_method();
	}
	
	
	
	
	
	
	
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
			System.out.println(this);	//InnerClass 객체참조
			System.out.println(OuterClass.this);
			outer_member_field=9999;	//외부클래스 참조 없어도 사용할 수 있다. 호출 한 멤버는 InnerClass에서 먼저 찾은 후 OuterClass에서 찾아본다.
			outer_member_method();
		}
	}
	
}
