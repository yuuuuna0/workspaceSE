/*
제한자(final)
	1. 클래스앞에 붙일경우
	   상속금지 
       ex> public final class Test{}
    2. 멤버메쏘드앞에 붙일경우 
       오버라이딩 금지
       ex> public final void print(){}
    3. 멤버변수 앞에붙일경우--> 상수
       ex> public final int PORT_NUMBER=80;
       상수화된다.    
       변경금지
*/
public class FinalMethodClass {
	public void method1() {
		System.out.println("FinalMethodClass.method1()");
		
	}
	public final void method2() {
		System.out.println("FinalMethodClass.method2() 난 final메쏘드 재정의 금지");
	}
}
