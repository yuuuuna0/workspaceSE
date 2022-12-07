
public class ControlSleepThreadMain {

	public static void main(String[] args) throws Exception {
		System.out.println("1. main");
		System.out.println("2. main 스레드 3초간 실행 sleep");
		Thread.sleep(3000);
		System.out.println("3. main 스레드 3초 후 깨어난 뒤 실행");
		ControlSleepThread cst=new ControlSleepThread();
		cst.start();
		System.out.println("9. main return");
		
		
		
	}

}
