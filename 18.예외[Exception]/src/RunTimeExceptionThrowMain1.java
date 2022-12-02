
public class RunTimeExceptionThrowMain1 {
	/*
	 * 모든 메쏘드는 throws RuntimeException 구문이 생략되어있다
	 *   - 이 메쏘드에서는 RuntimeException의 자식Exception들이 발생할수있다.
	 */
	public static void main(String[] args) {		//throws RuntimeException 생략
		System.out.println("stmt1");
		String str="김경호";
		System.out.println("stmt2");
		//예외 발생 코드
		int length = str.length();
		/*
		 1. 예외상황 발생하면  NullPointerException객체 생성한 후 예외발생코드를 가지고있는 메쏘드를(메인메쏘드) 호출한 곳으로 던진다.(throw)
		 2. 현재 실행흐름은 실행을 멈추고 예외발생코드를 가지고있는 메쏘드를(메인메쏘드) 호출한 곳으로 이동
		 */
		System.out.println(length);
		System.out.println("stmt3");
		
		int[] intArray=null;
		intArray=new int[3];
		System.out.println("stmt4");
		intArray[3]=9999;
		/*
		 1. 예외상황 발생하면 ArrayIndexOutOfBoundsException 객체 생성한 후 예외발생코드를 가지고있는 메쏘드를(메인메쏘드) 호출한 곳으로 던진다.(throw)
		 2. 현재 실행흐름은 실행을 멈추고 예외발생코드를 가지고있는 메쏘드를(메인메쏘드) 호출한 곳으로 이동
		 */
		System.out.println("stmt5");
		
	}

}
