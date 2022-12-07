
public class SynchronizeLowerThread  extends Thread{
	private SynchronizeUpperLowerPrintSharedObject sharedObject;
	public SynchronizeLowerThread(SynchronizeUpperLowerPrintSharedObject sharedObject) {
		this.sharedObject=sharedObject;
	}
	@Override
	public void run() {
		while(true) {
			sharedObject.printLower();
		}
	}
}
