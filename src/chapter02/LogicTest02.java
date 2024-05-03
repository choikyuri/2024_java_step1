package chapter02;

public class LogicTest02 {

	public static void main(String[] args) {
		int num1=10;
		int i=2;
		
		boolean value=((i=i+2)<10 && (num1=num1+2)<10);
		System.out.println(i); //4
		System.out.println(num1);//12
		System.out.println(value);//false
		
		System.out.println("==============");
		value=((i=i+2)<10 || (num1=num1+2)<10);
		System.out.println(i); //6
		System.out.println(num1); //12 -> 앞항이 true이므로 무조건 true 그러므로 뒷항은 연산하지 않음
		System.out.println(value);//true

	}

}
