/*
제어문
   1. if 문
       -형식 : 
	      stmt0;
		  if(조건문){
		      //조건문 -->   논리형데이타가 반환되는 연산(논리연산,비교연산) 또는 논리형변수(데이터) 
			  stmt1;
		  } else{
		      stmt2;
		  }
		  stmt3;

		   조건데이타가 true인경우  stmt0-->stmt1-->stmt3;
		   조건데이타가 false인경우  stmt0-->stmt2-->stmt3;
 */

public class IfTest1 {
	/*
	 * 정렬: ctrl + shift + f
	 */
	public static void main(String[] args) {
		System.out.println("main block start");
		System.out.println("stmt1");
		boolean condition = true;

		if (condition) {
			/*
			 * true일 때 실행되는 블록
			 */
			System.out.println("stmt2");
			System.out.println("stmt3");
			System.out.println("stmt4");
		}
		System.out.println("stmt5");

		if(condition) {
			//true일 때 실행되는 블록
			System.out.println("stmt6");
			System.out.println("stmt7");
		} else{
			//false일 때 실행되는 블록
			System.out.println("stmt8");
			System.out.println("stmt9");
		}
		System.out.println("stmt10");
		
		if(condition)
			System.out.println("stmt11");	//세미콜론이 한 statement의 기준이기 때문에 if문 중괄호 없어도 해당 라인까지가 if문임(한 줄)

		if(condition)
			System.out.println("stmt12");	
		else
			System.out.println("stmt13");	
		System.out.println("stmt14");
		
		System.out.println("main block end");
		/*
		 * return; 
		   - 현재 return문을 실행하는 실행흐름을 호출한 곳 
		   - return문은 생략 가능
		 */
		return;
		// System.out.println("After return statement");
	}

}
