package threadEx;
import java.awt.*;
import javax.swing.*;

public class ThreadTimerEx extends JFrame {
	public ThreadTimerEx() {
		 setTitle("Thread를 상속받은 타이머 스레드 예제"); //타이틀 넣어줌
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x누르면 종료됨
		 
		 Container c = getContentPane(); //컨테이너 판 만들어줌
		 c.setLayout(new FlowLayout()); // 레이아웃 만들어줌

		 // 타이머 값을 출력할 레이블 생성
		 JLabel timerLabel = new JLabel(); 
		 timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80)); //타이머에 글씨체 고딕
		 c.add(timerLabel);
		 TimerGUI th = new TimerGUI(timerLabel);
		 setSize(250,150);
		 setVisible(true);
		 th.start(); // 타이머 스레드의 실행을 시작하게 한다.
		
		 
		 long id = Thread.currentThread().getId();	//현 스레드의 아이디를 호출한다.
		 String name = Thread.currentThread().getName(); // 현 스레드의 이름을 호줄한다.
		 int priority = Thread.currentThread().getPriority(); // 현 스레드의 우선순위를 호출한다.
		 Thread.State s = Thread.currentThread().getState();  // 현 스레드의 상태를 호출한다.
		 
		 System.out.println("현재 스레드 이름 = " + name);
		 System.out.println("현재 스레드 ID = " + id);
		 System.out.println("현재 스레드 우선순위 값 = " + priority);
		 System.out.println("현재 스레드 상태 = " + s); 
	} 
}
