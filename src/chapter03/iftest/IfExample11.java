package chapter03.iftest;

import java.util.Scanner;

public class IfExample11 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String ID=scan.nextLine();
		
				
		if(ID.equals("admin")) {
			System.out.print("��й�ȣ : ");
			int pass=Integer.parseInt(scan.nextLine());
			if(pass == 240219) {
				System.out.println(ID + "�� ȯ���մϴ�.");
				}
			else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
		     }
		else {
			System.out.println("������ ID�� �����Ͽ� �ּ���.");

			}//if
	}//main
}//class
