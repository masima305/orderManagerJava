package datatest1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class start{
	private static Connection dbTest;	
	private String username="system";
	private String password="yt9953yt";
	
	
	
	start(){
		connectDB();
	}
	private void connectDB() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			dbTest = DriverManager.getConnection("jdbc:oracle:thin:"
												+"@localhost:1521:XE"
												,username
												,password);
			System.out.println("데이터 베이스에 연결되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("시스템 연결 실패!");
			System.out.println("SQLException:" + e);
		} catch (Exception e) {
			System.out.println("Exception" + e);
		}
	}
	
	public void execute_query1() throws SQLException{
		System.out.println("문제1 : ");
		
		String sqlStr = "SELECT maker, model, price FROM PC natural join product where cd like '%8%' and ram >= 24";
		PreparedStatement stmt = dbTest.prepareStatement(sqlStr);
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()){
			System.out.println(rs.getString("maker")+"\t"+rs.getString("model")+"\t"+rs.getString("price"));
		}
		rs.close();
		stmt.close();
	}
	public void execute_query2() throws SQLException{
		System.out.println("문제2.SCREEN 이 11초과이고 제조업체가 ‘D’ 나 ‘G’인 LAPTOP의 총 합계를 구하시오");
		String sqlStr = "SELECT sum(price) FROM product natural join laptop WHERE screen>11 and maker like '%D%' or maker like '%G%'";
		PreparedStatement stmt = dbTest.prepareStatement(sqlStr);
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()){
			System.out.println("price:" + rs.getString("sum(PRICE)"));
		}
		rs.close();
		stmt.close();
	}
	
	public void execute_query3() throws SQLException{
		System.out.println("문제3.PC의 hd가 2.4 초과인 것과 laptop의 speed가 130 초과인 모델의 총 개수를 구하시오");
		System.out.println("해결못함");
	}
	public void execute_query4() throws SQLException{
		System.out.println("문제4.Cd가 ‘8x’이고 PC중 한 개 이상의 LAPTOP보다 SPEED가 큰 모델번호와 가격을 구하시오");
		System.out.print("문제 이해가 안갑니다...");
	}
	public void execute_query5() throws SQLException{
		System.out.println("문제5.적어도 1GB 용량을 지닌 하드 디스크가 내장된 랩탑의 속도와 그 제조업체를 구하라");
	
		String sqlStr = "SELECT maker,speed from product natural join laptop where hd>=1 ";
		PreparedStatement stmt = dbTest.prepareStatement(sqlStr);
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()){
			System.out.println(rs.getString("maker")+"\t"+rs.getString("speed"));
		}
		rs.close();
		stmt.close();
	}
	public void execute_query6() throws SQLException{
		System.out.println("문제6.지금 model 2005 제품을 가지고 있는데, 이보다 더 속도가 빠른 PC나 LAPTOP을 사려고 한다. 어떤 제품들이 있는가?");
	
		String sqlStr = "SELECT model from pc where speed > 133";
		PreparedStatement stmt = dbTest.prepareStatement(sqlStr);
		ResultSet rs = stmt.executeQuery();
		
		String sqlStr2 = "SELECT model from laptop where speed > 133";
		PreparedStatement stmt2 = dbTest.prepareStatement(sqlStr2);
		ResultSet rs2 = stmt2.executeQuery();
		
		while(rs.next()){
			System.out.print(rs.getString("model"));
			System.out.println();
		}
		while(rs2.next()){
			System.out.print(rs2.getString("model"));
			System.out.println();
		}
		
		rs.close();
		stmt.close();
	}
	public void execute_query7() throws SQLException{
		System.out.println("문제7.‘D’ 제조업체의 PRINTER 중 컬러 출력이 가능한 제품의 모델과 타입(아래 그림에 없지만 포함) 가격을 보여라.");
	
		String sqlStr = "SELECT product.model,price from product,printer where product.model = printer.model and printer.type = 'ink-jet'";
		PreparedStatement stmt = dbTest.prepareStatement(sqlStr);
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()){
			System.out.print(rs.getString("model"));
			System.out.print("\t");
			System.out.print(rs.getString("price"));
			System.out.println();
		}
		rs.close();
		stmt.close();
	}
	public static void main(String[] argv) {
		start one = new start();
		
		try {
			one.execute_query1();
			System.out.println("-------------------------------------");
			one.execute_query2();
			System.out.println("-------------------------------------");
			one.execute_query3();
			System.out.println("-------------------------------------");
			one.execute_query4();
			System.out.println("-------------------------------------");
			one.execute_query5();
			System.out.println("-------------------------------------");
			one.execute_query6();
			System.out.println("-------------------------------------");
			one.execute_query7();
			
			
			dbTest.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("SQLException:" + e);
		}
	}
}
