
public class ConcurrentBeepPrintMain {

	public static void main(String[] args) {
		System.out.println("1. main thread start");
		System.out.println("2. main thread ConcurrenBeepThread 객체 생성");
		ConcurrentBeepThread beepThread=new ConcurrentBeepThread();
		System.out.println("3. main thread ConcurrenBeepThread 객체.start 메쏘드 호출");
		beepThread.start();
		System.out.println("3. main thread ConcurrenPrintThread 객체 생성");
		ConcurrentPrintThread printThread=new ConcurrentPrintThread();
		System.out.println("3. main thread ConcurrenPrintThread 객체.start 메쏘드 호출");
		printThread.start();
		System.out.println("9. main thread end JVM 호출");
		
		
		
	}

}
