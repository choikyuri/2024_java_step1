package chapter05;

public class MethodTest06 {
	
	public static int getStringLength(String str) { // String str=""Hello, Java!";
		
		return str.length();
		
	}

	public static void main(String[] args) {
		
		int strlen=getStringLength("Hello, Java!");
		System.out.println(strlen);
		System.out.println(getStringLength("메소드호출"));

	}

}
