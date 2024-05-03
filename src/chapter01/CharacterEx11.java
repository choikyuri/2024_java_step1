package chapter01;

public class CharacterEx11 {

	public static void main(String[] args) {
		//A:65 / a:97
		
		int a=65;
		System.out.println(a);
		System.out.println(a+10);
		
		System.out.println("---------");
		//명시적 형변환 int->char
		System.out.println((char)a); //아스키코드로 변환 즉 문자로 변환
		System.out.println("============");
		
		int b=66;
		System.out.println(b);
		System.out.println((char)b);
		System.out.println("============");
		
		int a2=97;
		System.out.println(a2);
		System.out.println((char)a2);
		

	}

}
