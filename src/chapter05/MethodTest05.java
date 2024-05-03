package chapter05;

public class MethodTest05 {


	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static double divide(double a, double b) {
		return a/b;
	}

	public static void main(String[] args) {
		int result=add(5,3);
		System.out.println(result); //+
		System.out.println(subtract(10,4)); //-
		System.out.println(multiply(6,7)); // *
		System.out.println(divide(20.4,4.0)); // /
	}
	

}
