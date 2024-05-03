package chapter05;

import java.util.Scanner;

public class Method {

	//멤버변수(=필드)
	
	//생성자
		
	//메서드
	Scanner scan = new Scanner(System.in);
	
	public void makeBread() {
		System.out.println("빵을 만듭니다.");
	}//메서드1
	
	//public 생략가능
	void makeBread(int count) {
		for(int i=0;i<count;i++) {
			System.out.println((i+1)+"번째 빵을 만들었습니다.");
		}
		System.out.println("요청하신 "+count+"개의 빵이 모두 완료되었습니다.");
	}//메서드2
	
	void makeBread(int count, String name) {
		for(int i=0;i<count;i++) {
			System.out.println((i+1)+"번째 빵을 만들었습니다.");
		}
		System.out.println("요청하신 "+count+"개의 "+name+"빵이 모두 완료되었습니다.");
	}//메서드3
	
	//=================================================================
	void order() {
		
		boolean run=true;
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택>>");
			
			int input_num = scan.nextInt();
			/*
			switch (input_num) {
			case 1: 
				System.out.print("빵 개수 입력 : ");
				int cnt1=scan.nextInt();
				makeBread(cnt1);
				break;
			case 2:
				System.out.print("빵 개수 입력 : ");
				int cnt2=scan.nextInt();
				System.out.print("종류 선택 : ");
				String name=scan.nextLine();
				makeBread(cnt2, name);
				break;
			case 3:
				System.out.println("프로그램 종료");
				run=false;
				break;
			default:
				System.out.println("잘못된 번호를 입력하셨습니다");
			}//switch
			*/
			
			//next(): 공백허용안함 Hello World => Hello
			//nextLine(): 공백허용  Hello World => Hello World
			
			if(input_num==1) {
				System.out.print("주문할 빵의 갯수: ");
				int cnt=scan.nextInt();
				makeBread(cnt);
			}else if(input_num==2){
				System.out.print("주문할 빵의 갯수: ");
				int cnt=scan.nextInt();
				System.out.print("주문할 빵의 종류: ");
				String name=scan.next(); 
				makeBread(cnt, name);
			}else if(input_num==3) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 번호 입니다.");
			}		
				
		}//while
	}
	
	
}
