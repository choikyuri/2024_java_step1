package chapter03.iftest;

import java.util.Scanner;

public class IfExample10 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String ID=scan.nextLine();
		
		System.out.print("비밀번호 : ");
		String PW=scan.nextLine();
		//형변환
		int pass=Integer.parseInt(PW);
				
		if(ID.equals("admin")) {
			if(pass == 240219) {
				System.out.println(ID + "님 환영합니다.");
				}
			else {
				System.out.println("비밀번호가 일치하지 않습니다.");
				}
		     }
		else {
			System.out.println("관리자 ID로 접속하여 주세요.");

			}//if
	}//main
}//class
