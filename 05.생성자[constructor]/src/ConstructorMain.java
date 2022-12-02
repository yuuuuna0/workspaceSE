
public class ConstructorMain {

	public static void main(String[] args) {
		System.out.println("----------------------c1-------------------------");
		/*
		 * << new Constructor(); >>
		 * 		1. Constructor클래스(틀)로 객체 생성 
		 * 		2. 생성자메쏘드(블록)호출
		 * 		3. 생성된 객체의 주소를 반환
		 */
		Constructor c1=new Constructor();
		System.out.println("c1:"+c1);
		c1.print();
		Constructor c2=new Constructor(1,2);
		System.out.println("c2:"+c2);
		c2.print();
		
	}

}
