 /*
		switch 문
		
		 - 형식
		 
		    switch(변수){
		    	case 값_1:
		    	  stmt1;
		    	  break;
		    	case 값_2:
		    	  stmt2;
		    	  break;  
		        case 값_n:
		          stmt3;
		    	  break;
		        default:
		          stmt4;
		    }
		
		
		switch(변수)  - 변수값은 byte, short, int, char 
		              값이올수있다.(long 은안됨)
		              - 범위에서 사용할 수 없다.
*/
public class SwitchTest {

	public static void main(String[] args) {
		int level=5;	//게임레벨은 1~5 사이의 정수
		
		switch (level) {
		case 1:
			/*명령문 기술 위치*/
			System.out.println("초보");
			System.out.println("초보");
			System.out.println("초보");
			System.out.println("초보");
			System.out.println("초보");
			/*
			 * break --> switch block을 빠져나간다. + break를 빠져나갈 때까지 실행함
			 */
			break;
		case 2:
			System.out.println("중수");			
			break;
		case 3:		//3~5레벨은 출력값이 같기 때문에 연달아 쓸 수 있음
		case 4:
		case 5:
			System.out.println("고수");	
			break;
			
		default:		//default 생략 가능
			System.out.println("레벨은 1~5 사이의 정수입니다.");
			break;
		}
		
		
	}

}
