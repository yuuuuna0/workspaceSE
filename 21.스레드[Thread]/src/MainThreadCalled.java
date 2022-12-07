
public class MainThreadCalled {
	public void main_thread_called_method() {
		System.out.println("\tA."+Thread.currentThread().getName()+" 스레드 실행");
		System.out.println("\tB."+Thread.currentThread().getName()+" 스레드 반환");
		return;
		
	}
}
