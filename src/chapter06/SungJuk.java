package chapter06;

import javax.swing.JOptionPane;

public class SungJuk {
	
	//�������=�ʵ�
	private String std_num; //1004
	private String std_name; //�ֹ鼳
	private int java, oracle, spring; //92,100,95
			
			
	//������
	
	//�޼ҵ�
	public void Sum() {
		int total=java+oracle+spring;
		System.out.println("�� �հ�: "+total);
	}
	
	public void Avg() {
		double avg=(double)(java+oracle+spring)/3;
		System.out.println("�� �հ�: "+avg);
	}

	public static void main(String[] args) {

		SungJuk rec = new SungJuk(); //SungJuk Ŭ������ ��ü����(rec)
		rec.std_num=JOptionPane.showInputDialog("�й�"); //1004
		rec.std_name=JOptionPane.showInputDialog("����"); //�ֹ鼳
		
		rec.java=Integer.parseInt(JOptionPane.showInputDialog("�ڹ����� �Է�"));//92
		rec.oracle=Integer.parseInt(JOptionPane.showInputDialog("����Ŭ���� �Է�"));//100
		rec.spring=Integer.parseInt(JOptionPane.showInputDialog("���������� �Է�"));//95
		
		System.out.println("�й�-"+rec.std_num+" | ���� - " +rec.std_name+"���� �����Դϴ�." );
		System.out.println("========================================================");
		rec.Sum();
		rec.Avg();
		

	}

}
