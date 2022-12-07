
public class ControlStopThreadMain {

	public static void main(String[] args) throws Exception {
		System.out.println("1. main");
		/*
		ControlStopThread1 cst1=new ControlStopThread1();
		cst1.start();
		Thread.sleep(1000);
		//cst1.stop();
		*/
		ControlStopThread2 cst2=new ControlStopThread2();
		cst2.start();
		Thread.sleep(5000);
		//cst2.stop();0
		cst2.setPlay(false);
		Thread.sleep(100000);
		System.out.println("9. main thread jvm return");
	}

}
