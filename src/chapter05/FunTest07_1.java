package chapter05;

import java.util.Scanner;

public class FunTest07_1 {
	
	public static String EduStep(int edu) {
		/*
		String step = "";
		
		switch (edu) {
		case 1:
			step = "Step1";
			break;

		case 2:
			step = "Step2";
			break;

		case 3:
			step = "Step3";
			break;

		default:
			step = "�������� �ʴ� ���� �ܰ� �Դϴ�";
			break;
		}
		
	   return step;
	   */
		
		String step = null;
		
		if(edu==1) 
		{
			step="1�ܰ�";
		}else if(edu==2) 
		{
			step="2�ܰ�";
		}else if(edu==3) 
		{
			step="3�ܰ�";
		}else
		{
			System.out.println("���� ���͵� �ܰ谡 �����ϴ�.");
			step="0�ܰ�";
		}
		
		return step;
	}

	public static void main(String[] args) {
		//����ڷκ��� ���͵� �ܰ踦 �Է¹޾Ƽ� EduStep ȣ���ϱ�
		//�޼ҵ带 ȣ���� ������� ��ȯ�޾� step�� ����
		
		Scanner scan= new Scanner(System.in);
		System.out.print("���͵� �ܰ踦 �Է��ϼ���: ");
		int number=scan.nextInt(); //1
		
		String step=EduStep(number);
		System.out.println("���� ���� �ܰ�� "+step+" �Դϴ�.");

	}

}
