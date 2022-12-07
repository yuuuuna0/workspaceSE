
public class ControlStopThread2 extends Thread{
	private boolean isPlay;				
	public ControlStopThread2() {
		isPlay=true;
	}
	

	public void setPlay(boolean isPlay) {
		this.isPlay = isPlay;
	}


	@Override
	public void run() {
		while(isPlay) {			//isPlay가 false로 지정되어도 5번까지 출력 후 조건문을 빠져나오게 된다.
			try {
				System.out.println("---------------------");
				System.out.println("1. game move!");
				Thread.sleep((int)(Math.random()*1000)+1);
				System.out.println("2. game fight!");
				Thread.sleep((int)(Math.random()*1000)+1);
				System.out.println("3. game get score!");
				Thread.sleep((int)(Math.random()*1000)+1);
				System.out.println("4. game power up!");
				Thread.sleep((int)(Math.random()*1000)+1);
				System.out.println("5. game score update!");
				Thread.sleep((int)(Math.random()*1000)+1);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return;
		//end run
	}
}
