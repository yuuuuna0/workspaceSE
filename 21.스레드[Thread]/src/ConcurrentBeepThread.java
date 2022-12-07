import java.awt.Toolkit;

public class ConcurrentBeepThread extends Thread {
	@Override
	public void run() /*throws Exception: 재정의 위반 --> Thread의 throws보다 범위가 넓으면 위반임==>try,catch로 exception 잡아준다*/{
		
		Toolkit toolKit=Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			toolKit.beep();
			System.out.println("beep!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
