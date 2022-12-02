/*
반복문
    
     stmt1;
     
     while(조건문){
		   //조건문--> 논리형데이타를 반환하는 식 (논리형변수, 논리형리터럴)
		stmt2;
	 }
	 stmt3;
     
	 흐름  
	 - stmt1 --> 조건식의 데이타가 true인동안 stmt2를 반복 실행
	 - stmt1 --> 조건식의 데이터가 false인 경우 while block을 빠져나온다. --> stmt3
	 
*/

public class WhileTest {

	public static void main(String[] args) {
		System.out.println("stmt1");
		
		 //논리형리터럴 
		/*
		while(true) {
			System.out.println("stmt2");
		}
		*/
		
		//논리형 변수
		boolean isPlay = true;
		while(isPlay) {
			System.out.println("stmt2");
		}
		System.out.println("stmt99");
		
		
	}

}
