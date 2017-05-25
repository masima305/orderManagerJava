package threadEx;

import javax.swing.JLabel;

public class TimerGUI extends Thread {
	JLabel timerLabel;
	public TimerGUI(JLabel timerLabel){
		this.timerLabel = timerLabel;
	}
	
	// 스레드 코드. run()이 종료하면 스레드 종료
	public void run() {
		int n=0; // 타이머 카운트 값
		while(true) { // 무한 루프
			timerLabel.setText(Integer.toString(n));
			n++; // 카운트 증가
			try {
				Thread.sleep(1000); // 1초동안 잠을 잔다.
			} catch(InterruptedException e) { return;}
	}
	}
	
}
