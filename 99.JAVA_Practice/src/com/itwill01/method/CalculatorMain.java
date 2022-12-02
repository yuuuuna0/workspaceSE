package com.itwill01.method;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		int result = cal.add(23, 34);
		System.out.println("두 정수의 합: " + result);
		result = cal.sub(23, 34);
		System.out.println("두 정수의 차: " + result);
		result = cal.div(53498, 82);
		System.out.println("두 정수의 나눈 값: " + result);
		result = cal.mul(23, 34);
		System.out.println("두 정수의 곱: " + result);
	}

}
