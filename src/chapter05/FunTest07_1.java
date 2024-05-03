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
			step = "존재하지 않는 수업 단계 입니다";
			break;
		}
		
	   return step;
	   */
		
		String step = null;
		
		if(edu==1) 
		{
			step="1단계";
		}else if(edu==2) 
		{
			step="2단계";
		}else if(edu==3) 
		{
			step="3단계";
		}else
		{
			System.out.println("현재 스터디 단계가 없습니다.");
			step="0단계";
		}
		
		return step;
	}

	public static void main(String[] args) {
		//사용자로부터 스터디 단계를 입력받아서 EduStep 호출하기
		//메소드를 호출한 결과값을 반환받아 step에 저장
		
		Scanner scan= new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요: ");
		int number=scan.nextInt(); //1
		
		String step=EduStep(number);
		System.out.println("현재 수업 단계는 "+step+" 입니다.");

	}

}
