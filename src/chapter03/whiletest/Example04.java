package chapter03.whiletest;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		
		boolean run = true;
		int num, num2;
		int save=0; 
		int money;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------------");
			System.out.println("����>");
			
			num=scan.nextInt();
			
			if(num==1) {
				System.out.println("������ �����ϼ̽��ϴ�.");
				System.out.println("���� �ݾ� : "+save);
				System.out.print("�Ա��� �ݾ��� �Է��ϼ��� : ");
				money=scan.nextInt();
				if(money <=0) {
					System.out.println("�ݾ��� �߸� �Է��ϼ̽��ϴ�");
				}else {
					save+=money;
				}
				
			}else if(num==2) {
				System.out.println("����� �����ϼ̽��ϴ�.");
				System.out.println("���� �ݾ� : "+save);
				System.out.print("����� �ݾ��� �Է��ϼ��� : ");
				money=scan.nextInt();
				save -=money; //save=save-money;
				if(save <0 ) {
					System.out.println("�ܾ��� �����մϴ�");
					save +=money;
				}
				/*
				if(save-money<0) {
					System.out.println("�ܾ� ����");
					} else { 
						save-=money;
					}
				*/
			}else if(num==3) {
				System.out.println("�ܾ�Ȯ���� �����ϼ̽��ϴ�.");
				System.out.println("���� �ݾ� : "+save);
			}else if(num==4) {
				System.out.println("���Ḧ �����ϼ̽��ϴ�.");
				run=false;
			}else {
				System.out.println("�߸��� ���� ��ȣ�� �����ϼ̽��ϴ�");
			}
			
		}//while
          System.out.println("���α׷� ����");
	}//main

}
