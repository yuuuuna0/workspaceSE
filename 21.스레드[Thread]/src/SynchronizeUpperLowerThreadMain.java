/*
 * 동기화 제한자 synchronized
 * 동기화를 사용할 떄는 동기화 된 객체는 한개만 생성해야 한다(열쇠는 하나만 생성되어야 함)
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
