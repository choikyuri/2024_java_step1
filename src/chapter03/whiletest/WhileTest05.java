package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.print("Java ������ ������ �Է��ϼ��� : ");
			int scr=scan.nextInt();
			
			
			/*
			//��� 1 => (||)
			if(scr < 0 || scr>100) {
				System.out.println("0~100 ������ ������ �Է� �����մϴ�.");
				break;
			}else if(scr >= 60) {
				System.out.println("�հ� �ϼ̽��ϴ�");
				break;
			}else {
				System.out.println("���հ� �ϼ̽��ϴ�.");
				break;
			}//if
			*/
			//��� 2 (&&)
			if(scr >= 60 && scr <= 100) {
				System.out.println("�հ�");
				break;
			}
			else if(scr < 60 && scr >= 0) {
				System.out.println("���հ�");
				break;
			}
			else break;
			
		}//while
         
		System.out.println("���α׷� ����");
		
	}

}
