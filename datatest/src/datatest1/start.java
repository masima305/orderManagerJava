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
			System.out.println("������ ���̽��� ����Ǿ����ϴ�.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�ý��� ���� ����!");
			System.out.println("SQLException:" + e);
		} catch (Exception e) {
			System.out.println("Exception" + e);
		}
	}
	
	public void execute_query1() throws SQLException{
		System.out.println("����1 : ");
		
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
		System.out.println("����2.SCREEN �� 11�ʰ��̰� ������ü�� ��D�� �� ��G���� LAPTOP�� �� �հ踦 ���Ͻÿ�");
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
		System.out.println("����3.PC�� hd�� 2.4 �ʰ��� �Ͱ� laptop�� speed�� 130 �ʰ��� ���� �� ������ ���Ͻÿ�");
		System.out.println("�ذ����");
	}
	public void execute_query4() throws SQLException{
		System.out.println("����4.Cd�� ��8x���̰� PC�� �� �� �̻��� LAPTOP���� SPEED�� ū �𵨹�ȣ�� ������ ���Ͻÿ�");
		System.out.print("���� ���ذ� �Ȱ��ϴ�...");
	}
	public void execute_query5() throws SQLException{
		System.out.println("����5.��� 1GB �뷮�� ���� �ϵ� ��ũ�� ����� ��ž�� �ӵ��� �� ������ü�� ���϶�");
	
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
		System.out.println("����6.���� model 2005 ��ǰ�� ������ �ִµ�, �̺��� �� �ӵ��� ���� PC�� LAPTOP�� ����� �Ѵ�. � ��ǰ���� �ִ°�?");
	
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
		System.out.println("����7.��D�� ������ü�� PRINTER �� �÷� ����� ������ ��ǰ�� �𵨰� Ÿ��(�Ʒ� �׸��� ������ ����) ������ ������.");
	
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