package threadEx;
import java.awt.event.MouseAdapter;
import java.rmi.MarshalException;

import javax.swing.*;

public class VibratingFrame extends JFrame implements Runnable {
	Thread th; //진동하는 스레드
	public VibratingFrame(){
		setTitle("진동하는 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,200);
		setLocation(300, 300);
		setVisible(true);
		
		getContentPane().addMouseListener(new MouseAdapter(){
			public void mousePressed(MarshalException e) {
				if(!th.isAlive()) return;
					th.interrupt();	
			}
		});
		th = new Thread(this);
	}
	
	public void run(){
		
	}//미완성
}
