package chapter04;

public class ArgsTest01 {

	public static void main(String[] args) {
		
		int[] numbers=new int[5];
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(i+"번 인덱스에 있는 요소 : "+numbers[i]);
		}

	}

}
