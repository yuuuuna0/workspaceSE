
public class CreateCustomThreadMain {

	public static void main(String[] args) {
		/*
		 3. Thread 객체를 생성한다.						//main에서 실행
		 4. Thread 객체를통해서 Thread를 시작시킨다.	//main에서 실행
		 */
		System.out.println("1. main thread start");
		CreateCustomThread cct=new CreateCustomThread();
		cct.setName("사용자 정의 스레드");
		System.out.println("2. main thread CreateCustomThread객체.start() 메쏘드 호출 전");
		/*
		 * <<Thread>>
		 	public void start()
		 	-	Causes this thread to begin execution
		 		the Java Virtual Machine calls the run method of this thread. --> VM으로 호출되었으니 VM으로 반환된다. ==> 모든 스레드는 VM으로 호출하고 VM으로 반환된다.
			-	The result is that two threads are running concurrently: 
				the current thread (which returns from the call to the start method(메인스레드)) and 
				the other thread (which executes its run method(사용자정의스레드)).
			
				It is never legal to start a thread more than once. ->스레드 재사용 불가 
				In particular, a thread may not be restarted once it has completed execution.
		 */
		cct.start();		//cct.run으로 실행 할 경우 main thread로 돌아오지 않기 때문에 사용하지 않고 start method로 실행한다.
		
		System.out.println("3. main thread CreateCustomThread객체.start() 메쏘드 호출 후");
		System.out.println("4. main thread");
		
		
	}

}
