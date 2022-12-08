package event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


/*
 * ActionEvent를 처리하기 위한 핸들러는 반드시 ActionListener 인터페이스를 구현해야한다.
 */
public class NorthButtonActionEventHandler implements ActionListener{
	int clickCount=0;
	public ActionEventJFrame frame;
	public NorthButtonActionEventHandler(ActionEventJFrame frame) {
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("실행스레드 이름: "+Thread.currentThread().getName());
		System.out.println("이벤트 소스: "+e.getSource());
		/*
		 * 이벤트 소스 객체 변경
		 */
		JButton source=(JButton)e.getSource();
		clickCount++;
		source.setText("이벤트소스[North] click");
		source.setBackground(Color.RED);
		source.setForeground(Color.YELLOW);
		System.out.println("north button click!!");
		
		/*
		 * 프레임의 타이틀 변경
		 * contentPane(프레임의 멤버필드)의 배경색 변경
		 * 
		 */
		frame.setTitle("click" +clickCount);
		int r=(int)(Math.random()*256);
		int g=(int)(Math.random()*256);
		int b=(int)(Math.random()*256);
		frame.contentPane.setBackground(new Color(r,g,b));
	}
	
	
}
