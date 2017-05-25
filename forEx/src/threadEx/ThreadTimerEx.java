package threadEx;
import java.awt.*;
import javax.swing.*;

public class ThreadTimerEx extends JFrame {
	public ThreadTimerEx() {
		 setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����"); //Ÿ��Ʋ �־���
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x������ �����
		 
		 Container c = getContentPane(); //�����̳� �� �������
		 c.setLayout(new FlowLayout()); // ���̾ƿ� �������

		 // Ÿ�̸� ���� ����� ���̺� ����
		 JLabel timerLabel = new JLabel(); 
		 timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80)); //Ÿ�̸ӿ� �۾�ü ���
		 c.add(timerLabel);
		 TimerGUI th = new TimerGUI(timerLabel);
		 setSize(250,150);
		 setVisible(true);
		 th.start(); // Ÿ�̸� �������� ������ �����ϰ� �Ѵ�.
		
		 
		 long id = Thread.currentThread().getId();	//�� �������� ���̵� ȣ���Ѵ�.
		 String name = Thread.currentThread().getName(); // �� �������� �̸��� ȣ���Ѵ�.
		 int priority = Thread.currentThread().getPriority(); // �� �������� �켱������ ȣ���Ѵ�.
		 Thread.State s = Thread.currentThread().getState();  // �� �������� ���¸� ȣ���Ѵ�.
		 
		 System.out.println("���� ������ �̸� = " + name);
		 System.out.println("���� ������ ID = " + id);
		 System.out.println("���� ������ �켱���� �� = " + priority);
		 System.out.println("���� ������ ���� = " + s); 
	} 
}
