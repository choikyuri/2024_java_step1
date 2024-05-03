package chapter02;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		//String 변수방에서 +는 산술연산자가 아닌 부호연산자로(서로 결합하는 연산자) 사용
		//단, 반드시 문자열이 먼저 선언되어야 함 
	
		String str1="JDK"+14;
		String str2=str1+" 사용";
		System.out.println(str2);
        //어떤 것이 먼저 연산 되느냐에 따라 다른 결과가 나옴
		String str3="JDK"+11+13;
		String str4=11+13+"JDK";
		
		System.out.println(str3);
		System.out.println(str4);
		
	}

}
