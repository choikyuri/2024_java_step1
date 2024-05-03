package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample05 {

	public static void main(String[] args) {
		/*전시관의 입장료는 미취학 아동은 1000원 ->7
		전시관의 입장료는 초등학생은 2000원->13
		전시관의 입장료는 중,고등학생은 3500원 ->19
		전시관의 입장료는 성인은 5000원*/
		
		int age;
		int charge;
		
		age=Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));
		
		//if(논리연산 : && 또는 ||)
		//0보다 크면서 8보다 작으면		
		if(age>0 && age<8) {
			charge=1000;
			System.out.println("미취학 아동입니다.");
		//8보다 크거나 같으면서 14보다 작으면
		}else if(age>=8 && age<14){
			charge=2000;
			System.out.println("초등학생 입니다.");
		//14보다 크거나 같으면서 20보다 작으면
		}else if(age>=14 && age <20){
			charge=3500;
			System.out.println("중,고등학생 입니다.");
		}else {
			charge=5000;
			System.out.println("성인 입니다.");
		}
		
		System.out.println("입장료는 "+charge+"원 입니다.");
       
		
		
	}//main

}//class
