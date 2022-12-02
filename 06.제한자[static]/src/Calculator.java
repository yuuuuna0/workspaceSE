

public class Calculator {
	/*
	 * - add( 두개의 정수를 매개변수로 받아서 더한 결과값을 반환)
	 * - sub( 두개의 정수를 매개변수로 받아서 뺀   결과값을 반환)
	 * - div( 두개의 정수를 매개변수로 받아서 나눈 결과값을 반환)
	 * - mul( 두개의 정수를 매개변수로 받아서 곱한 결과값을 반환)
	 */
	private Calculator() {
		
	}
	/**
	 * 더하기
	 * @param i 항1
	 * @param j 항2
	 * @return 더한 결과값
	 */
	public static int add(int i,int j) {
		return i+j;
	}
	public static int sub(int i,int j) {
		return i-j;
		}
	public static int div(int i,int j) {
		return i/j;
	}
	public static int mul(int i,int j) {
		return i*j;
	}
}
