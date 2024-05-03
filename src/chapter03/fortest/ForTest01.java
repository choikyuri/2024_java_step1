package chapter03.fortest;

public class ForTest01 {

	public static void main(String[] args) {
		// 1부터 10까지 합
		
		int sum=1;
		/*
		System.out.println(++sum);//2 -> 전위연산
		System.out.println(sum++);//2 -> 후위연산
		System.out.println(sum++);//3
		*/
		//sum=sum+2;
		sum+=2;
		sum+=3;
		sum+=4;
		sum+=5;
		sum+=6;
		sum+=7;
		sum+=8;
		sum+=9;
		sum+=10;
		
		System.out.println(sum);
		
		System.out.println();
		
		int i;
	
		System.out.println("1부터 10까지의 수 출력");
		for(i=0; i<10; i++ ) {
			System.out.print((i+1) + " ");			
		}
		
		int j;
		int sum2=0; //누적변수방은 반드시 초기화
		for(j=1; j<=10; j++ ) {
			sum2+=j; //sum2=sum2+j;			
		}
		System.out.println();
		System.out.println("1부터 10까지의 합 : "+sum2);

	}

}
