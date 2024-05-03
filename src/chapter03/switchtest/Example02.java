package chapter03.switchtest;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/*
		사용자로부터 요일을 입력받아(1~7) 해당 요일에 어떤 음식을 먹을지 출력하는 프로그램을 작성하세요.
		(월요일:떡볶이, 화요일:스파게티,------,일요일:초밥)-->여러분이 먹고싶은거 아무거나 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("뭐 먹을까요? ");
		String str1;
		str1=scan.nextLine();
		
		switch (str1) {
		case "월요일":
			System.out.println("쌀밥");
			break;
		case "화요일":
			System.out.println("보리밥");
			break;
		case "수요일":
			System.out.println("잡곡밥");
			break;
		case "목요일":
			System.out.println("현미밥");
			break;
		case "금요일":
			System.out.println("전복밥");
			break;
		case "토요일":
			System.out.println("송이밥");
			break;
		case "일요일":
			System.out.println("녹차밥");
			break;
		default:
			System.out.println("잘 못 입력 하셨습니다.");
		}//switch
		
	}

}
