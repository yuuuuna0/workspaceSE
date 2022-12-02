
public class WhileUse {

	public static void main(String[] args) {
		
		System.out.println(">> 1~10 사이의 정수 출력(10회 출력)");
		int i=0;
		while(i<10) {
			System.out.print((i+1)+" ");
			i++;
		}
		System.out.print("\n");
		System.out.println(">> 1~10 사이의 정수 출력(10회 출력)");
		i=1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		System.out.println(">> 1~100 사이의 정수 중에서 홀수 출력");
		i=1;
		while(i<=100) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		System.out.println(">> 1~100 사이의 정수 중에서 4의 배수 출력");
		i=1;
		while(i<=100) {
			if(i%4==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		
		/*
		 * Quiz:
		 *  -1900년도부터 2022년까지의 연도 중에서 윤년을 출력하세요.
		 */
		System.out.println();
		System.out.println(">> 1900년부터 2022년까지의 연도 중 윤년 출력");
		int year=1900;
		while(year<=2022) {
			if((year%4==0 && year%100!=0) || (year%400==0)) {
				System.out.print(year+"년\t");
			}
			year++;
		}
		
		System.out.println();
		System.out.println(">> 1~100 사이의 정수 중에서 짝수와 홀수의 합[누적]");
		
		i=1;
		int oddTotal=0;
		int evenTotal=0;
		int total=0;
		
		while(i<=100) {
			if(i%2==1) {
				//홀수
				oddTotal = oddTotal+i;
			} else {
				//짝수
				evenTotal = evenTotal+i;
			}
			total+=i;	//연산 후 대입 연산자(total = total+i)
			i++;
		}
		System.out.println("1~100 사이의 정수 중에서 홀수의 합: "+oddTotal);
		System.out.println("1~100 사이의 정수 중에서 짝수의 합: "+evenTotal);
		System.out.println("1~100 사이의 정수 합: "+total);
		
	}

}
