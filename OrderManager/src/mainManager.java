import java.util.Scanner;

public class mainManager {

	public static void main(String[] args) {

	
		forGUI starter = new forGUI();
	
		
	/*	
		Scanner s = new Scanner(System.in);

		// TODO Auto-generated method stub

		// GUI 완성되면 넣을것
		// new forGUI();

		System.out.println("식당 주문 관리");

		tableManager table = new tableManager();
		table.tableInit();
		table.showState();
		while (true) {
			System.out.println("-------------------------------------------");
			System.out.println("뭐할래?");
			System.out.println("| 1.주문하기 | 2.테이블 상태 | 3.계산하기 | 4.등록조회 |");
			System.out.print("=>");
			String a = s.next();
			
			
			switch (a) {
				case "1":
					System.out.println("주문하기");
					table.tableOrder();
					break;
				case "2":
					System.out.println("테이블 상태입니다.");
					table.showState();
					break;
				case "3":
					System.out.println("계산하기 입니다.");
					table.tablePay();
					break;
				default:
					System.out.println("해당 숫자가 없습니다");
					break;
			}
		}

		/*
		 * 조회--------------------------- System.out.println("메뉴 목록");
		 * System.out.println("고객"); System.out.println("매출");
		 * System.out.println("직원"); System.out.println("메뉴");
		 */
	
	
	}
}
