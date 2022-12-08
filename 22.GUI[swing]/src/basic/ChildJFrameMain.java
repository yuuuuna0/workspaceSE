package basic;

import javax.swing.JFrame;

public class ChildJFrameMain {

	public static void main(String[] args) {
		
		//1. JFrame객체 생성
		ChildJFrame childJFrame=new ChildJFrame();
		
		/*
		JFrame jFrame=new JFrame();		//2. 객체생성
		jFrame.setTitle("난 걍 프레임")
		jFrame.setSize(300,400);		
		jFrame.setVisible(true);		//2. 객체 화면에 보여주세요
		 * 2. Container[JFramep.setVisible(true);
		 * 		- 메인 스레드가 setVisible 호출하면 JVM GUI스레드를 생성
		 * 		- GUI스레드는 무한대기 하면서 클라이언트 이벤트와 그래픽처리를 담당
		 * 		- Container[JFrame]는 계속 떠있다. (JVM이 종료되지 않는다.)
		 
		*/
	}

}
