package chapter01;

public class Constant15 {

	public static void main(String[] args) {
		//상수 : 변하지 않는 값
		
		final int MAX_NUM=100; //초기화
		final int MIN_NUM; //선언
		final double PI=3.14;
		
		MIN_NUM=0; //리터널값
		//PI=10.5; //리터널값 변경시 fanal이 선언되어 있어 ERROR
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		System.out.println(PI);

	}

}
