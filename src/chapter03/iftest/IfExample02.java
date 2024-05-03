package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample02 {

	public static void main(String[] args) {
		
		// 10배수를 판단하세요
		// 조건 : dat에 있는 값을 10으로 나눈 나머지가 0인지?
		
		int dat;
		
		dat=Integer.parseInt(JOptionPane.showInputDialog("값을 입력세요.")); 
		
		
		if(dat%10==0 ) {
			System.out.println(dat+"(는)은 10의 배수입니다.");
		}else {
			System.out.println(dat+"(는)은 10의 배수가 아닙니다.");
		}

	}

}
