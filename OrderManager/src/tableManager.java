import java.util.Scanner;

public class tableManager {
//테이블 현황과 주문목록을 보여준다.
	
	customerTable table_cus [][] = new customerTable [4][5];
	//테이블은 총 20자리로 제한
	
	void tableInit(){		//테이블 맨 처음에 번호 매겨줌
		int table_count = 1;
		for(int i = 0; i < 4; i++ ){
			for(int j=0 ; j<5 ; j++){
				customerTable empty_cus = new customerTable("empty", table_count);
				table_cus[i][j] = empty_cus;
				table_count++;
			}
		}
	}
	void showState (){		//상태 보여주기	
		System.out.println("테이블 현황");
			for(int i= 0; i < 4; i++ ){
				for(int j = 0 ; j<5 ; j++){
					System.out.print(table_cus[i][j].table_num+" : "+table_cus[i][j].name+"\t"); 
				}
				System.out.println();
			}
	}	
	void tableOrder(){		//주문을 만들고 메뉴를 넣어줌.
		
		Scanner s = new Scanner(System.in);
	
		//주문자 정보 받는다.
		System.out.println("주문자 이름 :");
		String name = s.nextLine();
		System.out.println("넣을 테이블 번호:");
		int ord_num = s.nextInt();
	
		customerTable new_cus = new customerTable("["+name+"]",ord_num);
		
		//메뉴 반복 받기
		int selector = 0;
		while(selector != 99){
			System.out.println("메뉴 고르시오");
			System.out.println("1:양파 | 2:당근 | 3:고구마 | 4:멸치 | 98:방금 주문 지우기 |99:빠져나가기");
			selector = s.nextInt();
			if(selector == 1) {
				System.out.println("양파 선택");
				new_cus.addOrder("양파");
			}else if(selector == 2){
				System.out.println("당근 선택");
				new_cus.addOrder("당근");
			}else if(selector == 3){	
				System.out.println("고구마 선택");
				new_cus.addOrder("고구마");
			}else if(selector == 4){
				System.out.println("멸치");
				new_cus.addOrder("멸치");
			}
			System.out.println("입력되었습니다.");
		}
		

		for (int i = 0 ; i<4 ;i++){
			for (int j = 0 ; j<5;j++){
				if (table_cus[i][j].table_num == ord_num){
					table_cus[i][j] = new_cus;
				}
			}
		}
		System.out.println(ord_num+"번 테이블에"+name+"님 입력완료");
		new_cus.showOrderAll();
		showState();
		
	}

	void tablePay(){		//테이블 계산
		System.out.println("계산할 테이블 번호를 입력하시오.");
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

