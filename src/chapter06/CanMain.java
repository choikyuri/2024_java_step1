package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		
		String select="";
		int money=0;
		
		Vending ven=new Vending();
		ven.init(); //�����غ� �Ϸ�
		
		System.out.println("���� �����ϼ���. :");
		Scanner scan=new Scanner(System.in);
		money=scan.nextInt(); //�� ����
		ven.showCans(money);//1100
		System.out.println("===================");
		
		System.out.print("���Ḧ �����ϼ���: ");
		select=scan.next();//nextLine : space & enter�� ������ ������ �ν�
		ven.outCan(select);
		

	}

}
