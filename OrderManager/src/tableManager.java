import java.util.Scanner;

public class tableManager {
//���̺� ��Ȳ�� �ֹ������ �����ش�.
	
	customerTable table_cus [][] = new customerTable [4][5];
	//���̺��� �� 20�ڸ��� ����
	
	void tableInit(){		//���̺� �� ó���� ��ȣ �Ű���
		int table_count = 1;
		for(int i = 0; i < 4; i++ ){
			for(int j=0 ; j<5 ; j++){
				customerTable empty_cus = new customerTable("empty", table_count);
				table_cus[i][j] = empty_cus;
				table_count++;
			}
		}
	}
	void showState (){		//���� �����ֱ�	
		System.out.println("���̺� ��Ȳ");
			for(int i= 0; i < 4; i++ ){
				for(int j = 0 ; j<5 ; j++){
					System.out.print(table_cus[i][j].table_num+" : "+table_cus[i][j].name+"\t"); 
				}
				System.out.println();
			}
	}	
	void tableOrder(){		//�ֹ��� ����� �޴��� �־���.
		
		Scanner s = new Scanner(System.in);
	
		//�ֹ��� ���� �޴´�.
		System.out.println("�ֹ��� �̸� :");
		String name = s.nextLine();
		System.out.println("���� ���̺� ��ȣ:");
		int ord_num = s.nextInt();
	
		customerTable new_cus = new customerTable("["+name+"]",ord_num);
		
		//�޴� �ݺ� �ޱ�
		int selector = 0;
		while(selector != 99){
			System.out.println("�޴� �����ÿ�");
			System.out.println("1:���� | 2:��� | 3:������ | 4:��ġ | 98:��� �ֹ� ����� |99:����������");
			selector = s.nextInt();
			if(selector == 1) {
				System.out.println("���� ����");
				new_cus.addOrder("����");
			}else if(selector == 2){
				System.out.println("��� ����");
				new_cus.addOrder("���");
			}else if(selector == 3){	
				System.out.println("������ ����");
				new_cus.addOrder("������");
			}else if(selector == 4){
				System.out.println("��ġ");
				new_cus.addOrder("��ġ");
			}
			System.out.println("�ԷµǾ����ϴ�.");
		}
		

		for (int i = 0 ; i<4 ;i++){
			for (int j = 0 ; j<5;j++){
				if (table_cus[i][j].table_num == ord_num){
					table_cus[i][j] = new_cus;
				}
			}
		}
		System.out.println(ord_num+"�� ���̺���"+name+"�� �Է¿Ϸ�");
		new_cus.showOrderAll();
		showState();
		
	}

	void tablePay(){		//���̺� ���
		System.out.println("����� ���̺� ��ȣ�� �Է��Ͻÿ�.");
		Scanner s = new Scanner(System.in);
		int selector = s.nextInt();
		
		for (int i = 0 ; i<4 ;i++){
			for (int j = 0 ; j<5;j++){
				if (table_cus[i][j].table_num == selector){
					table_cus[i][j].showOrderList();;
					table_cus[i][j] = new  customerTable("empty", selector);
				}
			}
		}
		
		
		System.out.println();
	}
	
}
