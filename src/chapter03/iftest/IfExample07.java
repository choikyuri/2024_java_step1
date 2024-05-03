package chapter03.iftest;

import java.util.Scanner;

public class IfExample07 {

	public static void main(String[] args) {
		// Scanner 사용
		Scanner scan=new Scanner(System.in);
		
		//num1
		System.out.print("1. 첫번째 수 : ");
		double num1=Double.parseDouble(scan.nextLine());
		System.out.println("첫번째 입력받은 수 출력 : "+num1);
		System.out.println();
		
		//num2
		System.out.print("2. 두번째 수 : ");
		double num2=Double.parseDouble(scan.nextLine());
		System.out.println("두번째 입력받은 수 출력 : "+num2);
		System.out.println();
		

	}

}
