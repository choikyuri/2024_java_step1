package chapter05;

import javax.swing.JOptionPane;

public class FuncTest01 {
	
	//합계 메소드
	public static void sum(int num1, int num2) {
		int totla=num1+num2;
		System.out.println(totla);
	}
	

	public static void main(String[] args) {
		//두개의 int값을 입력받기
		int a, b;
		a=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		/*
		int sum=a+b;
		System.out.println(sum);
       */
		sum(a,b);
		
	}

}


/*접근제어자
public : 해당 멤버가 어떤 클래스나 패키지에서 접근 가능
protected : 해당 멤버가 같은 패키지 내의 클래스, 해당 클래스를 상속한 클래스에서 접근 가능
default : 해당 멤버는 같은 패키지 안 클래스에에서만 접근 가능(접근 제어자 명시 안할때와 같음)
private : 해당 멤버가 선언된 클래스 내에서만 접근 가능*/
