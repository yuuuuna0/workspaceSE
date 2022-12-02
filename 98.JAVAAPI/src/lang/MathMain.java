package lang;

public class MathMain {

	public static void main(String[] args) {
		/*
		 * Math 클래스
		 * 		- 수학 함수를 가지고 있는 클래스
		 * 		- 모든메쏘드 static
		 * 		- 객체 생성 불가능(생성자의 접근 제한자가 private)
		 */
		//	Math math=new Math();		--> Math는 static class
		double r = Math.abs(-123.783);
		System.out.println(r);
		System.out.println(Math.max(1212, 1211));
		System.out.println(Math.min(1212, 1211));
		System.out.println(Math.round(33.5555555));
		System.out.println(Math.round(33.5555555*10)/10.0);
		System.out.println(Math.sqrt(2));
		System.out.println(Math.sqrt(3));
		System.out.println(Math.sqrt(4));
		System.out.println(Math.pow(2, 8));
		
		/*<<public static double random()
		 * Returns a double value with a positive sign, greater than or equal to 0/0 and less than 1.0. Returned value
		 */
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
	}

}
