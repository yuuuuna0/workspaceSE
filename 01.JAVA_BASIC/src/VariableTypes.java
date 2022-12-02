
public class VariableTypes {

	public static void main(String[] args) {
		/*
		 논리형(1byte)
		  - 논리형 변수
		  - 논리형 리터럴(값,데이터) : true,false
		 */
		boolean bool1;
		boolean bool2;
		boolean bool3;
		boolean bool4;
		bool1 = true;
		bool2 = false;
		bool3 = true;
		bool4= bool3;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		System.out.println(bool4);
		
		/*
		 문자형(한개문자)(2byte)
		  - 문자형 변수
		  - 문자형 리터럴: 'A', '힣', 'a', '1'
		 */
		char munja1, munja2, munja3, munja4, munja5, munja6;
		munja1 = 'A';
		munja2 = 'B';
		munja3 = '김';
		munja4 = '경';
		munja5 = '1';
		munja6 = munja3;
		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja3);
		System.out.println(munja4);
		System.out.println(munja5);
		System.out.println(munja6);
		
		/*
		 숫자형
		  1. 정수형 변수(byte, short, int, long)
		    - 정수형 리터럴: 1,2,3,4,56,-90000,214353 (int)
		  2. 실수형 변수 (float, double)
		    - 실수형 리터럴: 0.1, .1, 3.141592, 10000.0 (double)
		 */
		byte b1 = 3;
		byte b2 = -128;
		byte b3 = 127;
		byte b4 = 0b01111111;	//0b : 2진수로 표현하는 법
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		short s1 = 767;
		short s2 = -32768;
		short s3 = 32767;
		short s4 = 0b0111111111111111;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		int i1,i2,i3,i4,i5,i6;
		i1 = 90;
		i2 = 90;
		i3 = -2147483648;
		i4 = 2147483647;
		i5 = 0b01111111111111111111111111111111;
		i6 = i1;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		
		long l1 = 232;
		long l2 = 214748364852L;	//정수형 리터럴이 int 범위를 넘는 경우 L 붙여서 리터럴을 확장함
		System.out.println(l1);
		System.out.println(l2);		
		
		float f1,f2,f3;
		f1 = 0.1F;	//실수형 리터럴은 double이 기본 type이기 때문에 F 붙여서 변수에 대입 해준다
		f2 = 3.14F;
		f3 = 10000.0F;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		double d1, d2, d3;
		d1 = 3.141592;
		d2 = 12345678912345678912345678.0;	//double은 float보다 정밀도가 좋다. 유효숫자가 더 많이 나옴 but double의 유효숫자 표현도 한계가 있음
		d3 = 1.2345678912345678912345678;		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		System.out.println("-----------문자열형--------------");
		String str1 = "오늘은";
		String str2 = "수요일";
		String str3 = "변수를 공부합니다.";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		/*
		 문자열 접합 연산자( + )
		 */
		String str4 = str1+str2+str3;
		System.out.println(str4);
		String str5 = str1+" "+str2+" "+str3;
		System.out.println(str5);
		
		String name = "김경호";
		int age = 34;
		char gender = 'M';
		double height = 175.2;
		double weight = 68.8;
		
		String myInfo = name+" "+age+" "+gender+" "+height+" "+weight;
		System.out.println(myInfo);
		
	}
}
