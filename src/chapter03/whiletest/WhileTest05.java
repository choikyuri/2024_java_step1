package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.print("Java 교과목 점수를 입력하세요 : ");
			int scr=scan.nextInt();
			
			
			/*
			//방법 1 => (||)
			if(scr < 0 || scr>100) {
				System.out.println("0~100 까지의 점수만 입력 가능합니다.");
				break;
			}else if(scr >= 60) {
				System.out.println("합격 하셨습니다");
				break;
			}else {
				System.out.println("불합격 하셨습니다.");
				break;
			}//if
			*/
			//방법 2 (&&)
			if(scr >= 60 && scr <= 100) {
				System.out.println("합격");
				break;
			}
			else if(scr < 60 && scr >= 0) {
				System.out.println("불합격");
				break;
			}
			else break;
			
		}//while
         
		System.out.println("프로그램 종료");
		
	}

}
