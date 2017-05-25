package threadEx;

import javax.swing.JLabel;

public class TimerGUI extends Thread {
	JLabel timerLabel;
	public TimerGUI(JLabel timerLabel){
		this.timerLabel = timerLabel;
	}
	
	// ������ �ڵ�. run()�� �����ϸ� ������ ����
	public void run() {
		int n=0; // Ÿ�̸� ī��Ʈ ��
		while(true) { // ���� ����
			timerLabel.setText(Integer.toString(n));
			n++; // ī��Ʈ ����
			try {
				Thread.sleep(1000); // 1�ʵ��� ���� �ܴ�.
			} catch(InterruptedException e) { return;}
	}
	}
	
}
