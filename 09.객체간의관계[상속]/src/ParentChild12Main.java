
public class ParentChild12Main {

	public static void main(String[] args) {
		System.out.println("-------------Child1-------------");
		Child1 child11=new Child1();
		child11.member1=1;
		child11.member2=2;
		child11.member3=3;
		child11.member4=5;
		child11.method1();
		child11.method2();
		child11.method3();
		child11.method4();
		System.out.println(">> child11 주소:"+child11);
	
		System.out.println("-------------Child2-------------");
		Child2 child21=new Child2();
		child21.member1=1;
		child21.member2=2;
		child21.member5=5;
		child21.method1();
		child21.method2();
		child21.method5();
		System.out.println(">> child21 주소:"+child21);
		
		System.out.println("------------Parent--------------");
		Parent p=new Parent();
		p.member1=1111;
		p.member2=2222;
		p.method1();
		p.method2();
		
	}

}
