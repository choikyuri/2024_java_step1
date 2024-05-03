package chapter01;

public class LongVariable05 {

	public static void main(String[] args) {
		// Long Type
		//int num1=12345678900; //int -> 32비트(X)
		long num2=12345678900L; //long -> 64비트
		long num3=1000; //long형의 64비트지만 L이 선언되어 있지 않으므로 int로 인식하여 자동 형변환됨
		
		System.out.println(num2);
		System.out.println(num3);
		
		int level; //선언만 하고 초기화 하지 않음
		level=10;//리터널 값
		
		System.out.println(level);
		System.out.println(num2+num3); // 더 큰 범위인 long으로 자동형변환

	}

}
