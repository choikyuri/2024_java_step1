package chapter03.fortest;

public class ForTest04 {

	public static void main(String[] args) {
		System.out.println("===0부터 100까지의 수중 홀수의 합을 출력===");
		
		int num;
		int total=0;
		
		for(num=0;num<=100;num++) {
			
			if(num%2==0) {
				continue; //그냥 가세요~ (무시)
			}
			System.out.print(num+" ");
			total+=num;
			
		}
		System.out.println();
		System.out.println("0부터 100까지의 수중 홀수의 합 : "+total);
		
		System.out.println("==========================");
		
		System.out.println("1부터 20까지의 수중 홀수만 출력 ");		
		for(int i=1;i<=20;i++) {
			
			if(i%2==1) {
			System.out.print(i+" ");
			}
		}
		
	}//main

}//class
