package chapter03.whiletest;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0; //����(+), ���(-)
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------------");
			System.out.println("����>");
			
			int menuNum=Integer.parseInt(scan.nextLine());
			//int menuNum=scan.nextInt();
			
			switch (menuNum) {
			case 1:
				System.out.println("���ݾ�>");
				int money= Integer.parseInt(scan.nextLine());
				//int money= scan.nextInt();
				balance += money;
				break;
				
			case 2:
				System.out.println("��ݾ�>");
				balance -= Integer.parseInt(scan.nextLine());
				break;
				
			case 3:
				System.out.println("�ܰ�>");
				System.out.println(balance);
				break;
			
			case 4: 
				run=false;
				break;
			}//switch		
			System.out.println();
		}//while
          System.out.println("���α׷� ����");
	}//main

}
