package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * ActionEvent를 처리하기 위한 핸들러는 반드시 ActionListener 인터페이스를 구현해야한다.
 */
public class NorthButtonActionEventHandler implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("실행스레드 이름: "+Thread.currentThread().getName());
		System.out.println("이벤트 소스: "+e.getSource());
		System.out.println("north button click!!");
		
		
		
	}
	
	
}
