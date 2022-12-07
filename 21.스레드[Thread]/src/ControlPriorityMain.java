
public class ControlPriorityMain {

	public static void main(String[] args) {
		/*
		 * priority(우선순위)
		 */
		ConcurrentBeepThread bt=new ConcurrentBeepThread();
		ConcurrentPrintThread pt=new ConcurrentPrintThread();
		System.out.println("ConcurrentBeepThread priority: "+bt.getPriority());
		System.out.println("ConcurrentPrintThread priority: "+pt.getPriority());
		bt.setPriority(10);
		pt.setPriority(1);
		bt.start();
		pt.start();
		
		
	}

}
