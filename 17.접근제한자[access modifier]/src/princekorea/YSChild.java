package princekorea;

import president.korea.YS;

public class YSChild extends YS {
	/*
	public int member1;
	protected int member2;
	int member3;
	private int member4;
	
	public void method1() {
		System.out.println("YS.method1()");
	}
	protected void method2() {
		System.out.println("YS.method2()");
	}
	void method3() {
		System.out.println("YS.method3()");
	}
	private void method4() {
		System.out.println("YS.method4()");
	}
	*/
	public void access2() {
		this.member1=1;
		this.member2=2;		//protected에 접근하려면 반드시 상속받아야한다.
		/*
		this.member3=3;
		this.member4=4;
		*/
		this.method1();
		this.method2();
		/*
		this.method3();
		this.method4();
		*/
	}
}
