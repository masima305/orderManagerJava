
public class customerTable {
	//Ŀ���͸Ӱ� ���Ե� ���̺�������...
	
	int table_num; // ���̺� �ѹ�
	String name;
	String [][] order_list = new String [10][2]; // ���� ����Ʈ�� ���ǻ� 10���� ����
	int count_order = 0; //�ֹ� ����  �ε���
	int total_price; //�� �� ����

	customerTable( String name,int table_num) {
		// ���̺� ����.
		this.name = name;
		this.table_num = table_num;
	}
	void addOrder(String order){
		//�ֹ� �ϳ� ��������  �߰�.
		if(count_order != 10){
			order_list[count_order][0] = order;
			order_list[count_order][1] = "10000";
			count_order++;
		}else{
			System.out.println("�ֹ��� �� ��");
		}
	}
	private void deleteOrder(){
		if(count_order != 0){
			order_list[count_order][0] = "";
			count_order --;
			System.out.println();
		}else{
			System.out.println("�ϰ͵� ����");
		}
	}
	void showOrderList() {
		int j = 0;
		for(int i = count_order ; i >= 0 ; i-- ){
			System.out.println(order_list[j][0] + "\t" + order_list[j][1]);
		}
	}
	void showOrderAll() {
		int j = 0;
		System.out.println("�̸�:"+name);
		System.out.println("�������̺�:"+table_num);
		System.out.println("\t�ֹ���� | ����");
		for(int i = count_order ; i >= 1 ; i-- ){
			System.out.println(order_list[j][0] + "\t" + order_list[j][1]);
			j++;
		}
	}
	
	
}

