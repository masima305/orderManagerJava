import java.util.Scanner;

public class mainManager {

	public static void main(String[] args) {

	
		forGUI starter = new forGUI();
	
		
	/*	
		Scanner s = new Scanner(System.in);

		// TODO Auto-generated method stub

		// GUI �ϼ��Ǹ� ������
		// new forGUI();

		System.out.println("�Ĵ� �ֹ� ����");

		tableManager table = new tableManager();
		table.tableInit();
		table.showState();
		while (true) {
			System.out.println("-------------------------------------------");
			System.out.println("���ҷ�?");
			System.out.println("| 1.�ֹ��ϱ� | 2.���̺� ���� | 3.����ϱ� | 4.�����ȸ |");
			System.out.print("=>");
			String a = s.next();
			
			
			switch (a) {
				case "1":
					System.out.println("�ֹ��ϱ�");
					table.tableOrder();
					break;
				case "2":
					System.out.println("���̺� �����Դϴ�.");
					table.showState();
					break;
				case "3":
					System.out.println("����ϱ� �Դϴ�.");
					table.tablePay();
					break;
				default:
					System.out.println("�ش� ���ڰ� �����ϴ�");
					break;
			}
		}

		/*
		 * ��ȸ--------------------------- System.out.println("�޴� ���");
		 * System.out.println("����"); System.out.println("����");
		 * System.out.println("����"); System.out.println("�޴�");
		 */
	
	
	}
}