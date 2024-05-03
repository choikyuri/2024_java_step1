package chapter02;

public class LogicTest01 {

	public static void main(String[] args) {
		// 논리 연산자
	    char a,b;
	    boolean c;
	    a='A'; //65
	    b='B'; //66
	    
	    c=(true||true) && false; //T && F
	    System.out.println(c); //F
	    
	    System.out.println("===========");
	    c=a<b && (a==b); //T && F
	    System.out.println(c); //F
	    c=a<b || (a==b); //T || F
	    System.out.println(c); //T
	}

}
