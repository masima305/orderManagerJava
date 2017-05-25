import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class forGUI extends JFrame{
	forGUI(){
		setTitle("Table POS");//Ÿ��Ʋ�� �����Ѵ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x��ư ������ ����
		
		Container contentPane = getContentPane(); //�������� ����Ʈ���� �˾Ƴ��� ����Ʈ�ҿ� ���� ������Ʈ ����
		JPanel mani_bord = new JPanel(); // ���� ����
		JPanel table_bord = new JPanel();// ���̺� ��
		JPanel order_bord = new JPanel(); // �ֹ� ��
		JPanel menu_bord = new JPanel(); //���� ����Ʈ ��
		JPanel regis_bord = new JPanel(); //����� ����Ʈ��
			
		contentPane.setBackground(Color.LIGHT_GRAY); //��ȸ�� ���
	
		JLabel title = new JLabel("�Ĵ� �ֹ�����",SwingConstants.CENTER);
		JLabel table_title = new JLabel("���̺� ��Ȳ",SwingConstants.CENTER);
		JLabel order_title = new JLabel("�ֹ�����",SwingConstants.CENTER);
		JLabel menu_title = new JLabel("�޴�",SwingConstants.CENTER);
		JLabel regis_title= new JLabel("���/��ȸ",SwingConstants.CENTER);
		
		
		
		contentPane.setLayout(new BorderLayout(10,10)); //FlowLayout��ġ ������ �ޱ�
		
		mani_bord.setLayout(new GridLayout(2,2,10,10));
		
		table_bord.setLayout(new BorderLayout());
		
		order_bord.setLayout(new BorderLayout());
		menu_bord.setLayout(new BorderLayout()); 
		regis_bord.setLayout(new BorderLayout());
		
		
		title.setFont(new Font("Ariel", Font.PLAIN, 35));
		
		contentPane.add(title, BorderLayout.NORTH); //ok��ư �ޱ�
		contentPane.add(mani_bord, BorderLayout.CENTER); //ok��ư �ޱ�
		
		mani_bord.setBorder( new EmptyBorder(10,10,10,10));
		mani_bord.add(table_bord);
		mani_bord.add(order_bord);
		mani_bord.add(menu_bord );
		mani_bord.add(regis_bord );
		
		table_bord.add(table_title, BorderLayout.NORTH);
		order_bord.add(order_title, BorderLayout.NORTH);
		menu_bord.add(menu_title, BorderLayout.NORTH);
		regis_bord.add(regis_title, BorderLayout.NORTH);
	//-----------------------���� ����-----------------------
	//table status
		
		JPanel table_status = new JPanel();
		table_status.setLayout(new GridLayout(5,4,15,15));
		
		JButton one = new JButton("1");
		one.setBackground(Color.WHITE);
		table_status.add(one);
		
		table_status.add(new JButton("2"));
		table_status.add(new JButton("3"));
		table_status.add(new JButton("4"));
		table_status.add(new JButton("5"));
		table_status.add(new JButton("6"));
		table_status.add(new JButton("7"));
		table_status.add(new JButton("8"));
		table_status.add(new JButton("9"));
		table_status.add(new JButton("10"));
		table_status.add(new JButton("11"));	
		table_status.add(new JButton("12"));
		table_status.add(new JButton("13"));
		table_status.add(new JButton("14"));
		table_status.add(new JButton("15"));
		table_status.add(new JButton("16"));
		table_status.add(new JButton("17"));
		table_status.add(new JButton("18"));
		table_status.add(new JButton("19"));
		table_status.add(new JButton("20"));
		
		table_bord.add(table_status);
	//order status
		
		JPanel order_statue = new JPanel();
		JPanel order_manipuler = new JPanel();
		
		order_statue.setLayout(new GridLayout(1,2,15,15));
		order_manipuler.setLayout(new GridLayout(10,1,10,10));
		String a [] = {"1","2","3","4","5","6","7","8","9","10"
							,"11","12","13","14","15","16","17","18","19","20"};
		
		JTextArea order_text = new JTextArea();
		JTextField order_name = new JTextField("�̸��Է�");
		JComboBox table_set = new JComboBox();
		
		for (int i = 0; i < a.length; i++) {
			table_set.addItem(a[i]);
		}
		
		
		order_manipuler.add(new JLabel("������"));
		order_manipuler.add(order_name);
		order_manipuler.add(new JLabel("���̺���"));
		order_manipuler.add(table_set);
		order_manipuler.add(new JButton("�ֹ�"));
		order_manipuler.add(new JButton("���"));
		order_manipuler.add(new JButton("����"));
		
		order_statue.add(order_text);
		order_statue.add(order_manipuler);
		order_bord.add(order_statue);
		
// menu status
		
		JPanel menu_list = new JPanel();
		menu_list.setLayout(new GridLayout(10,2, 5,5));
		for (int j = 0; j < 20; j++) {
			menu_list.add(new JButton(Integer.toString(j)));
		}

		
//regis tab
		
		
		JTabbedPane regis_tab = new JTabbedPane();
		
		JLabel customer_Label = new JLabel("�������", SwingConstants.CENTER);
		JPanel customer_Panel = new JPanel();
		customer_Panel.add(customer_Label);
		regis_tab.addTab("����", customer_Panel);
		
		JLabel income_Label = new JLabel("����", SwingConstants.CENTER);
		JPanel income_Panel = new JPanel();
		income_Panel.add(income_Label);
		regis_tab.addTab("����", income_Panel);

		JLabel employee_Label = new JLabel("����", SwingConstants.CENTER);
		JPanel employee_Panel = new JPanel();
		employee_Panel.add(employee_Label);
		regis_tab.addTab("����", employee_Panel);

		JLabel menu_Label = new JLabel("�޴�", SwingConstants.CENTER);
		JPanel menu_Panel = new JPanel();
		menu_Panel.add(menu_Label);
		regis_tab.addTab("�޴�", menu_Panel);

		
		regis_bord.add(regis_tab);
		menu_bord.add(menu_list);
		setSize(800,800);//����� ���Ѵ�.
		setVisible(true);//���̰� �Ѵ�.

//�о�� https://stackoverflow.com/questions/7050972/layout-manager-preferredsize-java		
	}
}