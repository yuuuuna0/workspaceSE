/*
 * 동기화
 */
public class SynchronizeUpperLowerThreadMain {

	public static void main(String[] args) {
		SynchronizeUpperLowerPrintSharedObject sharedObject=new SynchronizeUpperLowerPrintSharedObject();
		SynchronizeUpperThread upperThread=new SynchronizeUpperThread(sharedObject);
		SynchronizeLowerThread lowerThread=new SynchronizeLowerThread(sharedObject);
		upperThread.start();
		lowerThread.start();
		
		
	}

}
