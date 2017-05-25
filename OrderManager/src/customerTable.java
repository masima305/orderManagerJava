
public class customerTable {
	//커스터머가 포함된 테이블정보들...
	
	int table_num; // 테이블 넘버
	String name;
	String [][] order_list = new String [10][2]; // 오더 리스트는 편의상 10개로 제한
	int count_order = 0; //주문 갯수  인덱서
	int total_price; //총 합 가격

	customerTable( String name,int table_num) {
		// 테이블 지정.
		this.name = name;
		this.table_num = table_num;
	}
	void addOrder(String order){
		//주문 하나 들어갈때마다  추가.
		if(count_order != 10){
			order_list[count_order][0] = order;
			order_list[count_order][1] = "10000";
			count_order++;
		}else{
			System.out.println("주문수 다 참");
		}
	}
	private void deleteOrder(){
		if(count_order != 0){
			order_list[count_order][0] = "";
			count_order --;
			System.out.println();
		}else{
			System.out.println("암것두 없음");
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
		System.out.println("이름:"+name);
		System.out.println("앉은테이블:"+table_num);
		System.out.println("\t주문목록 | 가격");
		for(int i = count_order ; i >= 1 ; i-- ){
			System.out.println(order_list[j][0] + "\t" + order_list[j][1]);
			j++;
		}
	}
	
	
}

