package chapter05;

public class Example01 {
	
	/*두 정수를 입력받아서(=매개변수) 그 합을 계산하여 반환하는 메소드를 구현해보세요.*/
	private static int sum1(int a, int b) {
		//int hap=a+b;
		//return hap;
		return a+b;
	}
	
	public static void sum2(int a, int b) {
		System.out.println("방법2 "+(a+b));
	}
	
	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		//방법1
		int result=sum1(num1,num2);
		System.out.println("방법1 "+result);
		
		//방법2
		sum2(num1,num2);
	}
}
