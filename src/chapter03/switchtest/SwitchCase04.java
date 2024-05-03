package chapter03.switchtest;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		// Scanner 클래스의 인스턴스 변수 sc에 값을 입력받음
		Scanner sc=new Scanner(System.in);
		//등급 물어보기
		System.out.print("회원님의 등급은 어떻게 되나요? ");
		// A, a -> 최우수고객
		// B, b -> 우수고객
		// 나머지 -> 일반고객
		
		// charAt(0) : String -> char
		char grade=sc.nextLine().charAt(0); //A,a,B,b...
		
		switch (grade) {
		case 'A': case 'a': 
			System.out.println("최우수고객");
			break;
		case 'B': case 'b':
			System.out.println("우수고객");
			break;
		default:
			System.out.println("일반고객");
			break;
		}
		
	}

}
