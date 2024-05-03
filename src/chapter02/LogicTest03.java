package chapter02;

public class LogicTest03 {

	public static void main(String[] args) {

		int num1=10;
		int num2=20;
		
		System.out.println("----------AND----------");
		boolean flag1=(num1>10)&&(num2>20);
		System.out.println("false && false : "+flag1);//F
		
		boolean flag2=(num1>10)&&(num2>0);
		System.out.println("false && true : "+flag2);//F
		
		boolean flag3=(num1>0)&&(num2>20);
		System.out.println("true && false : "+flag3);//F
		
		boolean flag4=(num1>0)&&(num2>0);
		System.out.println("true && true : "+flag4);//T
		
		System.out.println("-----------OR----------");
		
		boolean flag5=(num1>10||num2>20);
		System.out.println("false || false : "+flag5);//F
		
		boolean flag6=(num1>10||num2>0);
		System.out.println("false || true : "+flag6);//T
		
		boolean flag7=(num1>0||num2>20);
		System.out.println("true || false : "+flag7);//T
		
		boolean flag8=(num1>0||num2>0);
		System.out.println("true || true : "+flag8);//T
		
		System.out.println("-----------NOT----------");
		//num1과 num2는 같지 않다
		boolean flag=(num1 != num2);
		System.out.println(flag);
		
		flag=!(num1>0);//num1>0 : true
		System.out.println(flag);//false

	}

}
