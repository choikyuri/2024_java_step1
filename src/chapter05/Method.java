package chapter05;

import java.util.Scanner;

public class Method {

	//�������(=�ʵ�)
	
	//������
		
	//�޼���
	Scanner scan = new Scanner(System.in);
	
	public void makeBread() {
		System.out.println("���� ����ϴ�.");
	}//�޼���1
	
	//public ��������
	void makeBread(int count) {
		for(int i=0;i<count;i++) {
			System.out.println((i+1)+"��° ���� ��������ϴ�.");
		}
		System.out.println("��û�Ͻ� "+count+"���� ���� ��� �Ϸ�Ǿ����ϴ�.");
	}//�޼���2
	
	void makeBread(int count, String name) {
		for(int i=0;i<count;i++) {
			System.out.println((i+1)+"��° ���� ��������ϴ�.");
		}
		System.out.println("��û�Ͻ� "+count+"���� "+name+"���� ��� �Ϸ�Ǿ����ϴ�.");
	}//�޼���3
	
	//=================================================================
	void order() {
		
		boolean run=true;
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. �� ������ ���� | 2.�� ������ ���� ���� | 3.����");
			System.out.println("------------------------------------------");
			System.out.println("����>>");
			
			int input_num = scan.nextInt();
			/*
			switch (input_num) {
			case 1: 
				System.out.print("�� ���� �Է� : ");
				int cnt1=scan.nextInt();
				makeBread(cnt1);
				break;
			case 2:
				System.out.print("�� ���� �Է� : ");
				int cnt2=scan.nextInt();
				System.out.print("���� ���� : ");
				String name=scan.nextLine();
				makeBread(cnt2, name);
				break;
			case 3:
				System.out.println("���α׷� ����");
				run=false;
				break;
			default:
				System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�");
			}//switch
			*/
			
			//next(): ���������� Hello World => Hello
			//nextLine(): �������  Hello World => Hello World
			
			if(input_num==1) {
				System.out.print("�ֹ��� ���� ����: ");
				int cnt=scan.nextInt();
				makeBread(cnt);
			}else if(input_num==2){
				System.out.print("�ֹ��� ���� ����: ");
				int cnt=scan.nextInt();
				System.out.print("�ֹ��� ���� ����: ");
				String name=scan.next(); 
				makeBread(cnt, name);
			}else if(input_num==3) {
				System.out.println("���α׷� ����");
				break;
			}else {
				System.out.println("�߸��� ��ȣ �Դϴ�.");
			}		
				
		}//while
	}
	
	
}
