package chapter05;

public class Example02 {
	
	//최대값을 메소드로 구현
	public static int findMax(int[] arr) {
		
		int max= arr[0]; //배열의 첫번째 요소
		/*
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}*/
		//향상 for
		for(int num:arr) {
			if(num>max) {
				max=num;
			}
		}	
		return max;		
	}

	public static void main(String[] args) {
		 int[] numbers= {7,2,9,1,5};
		 int maxnum=findMax(numbers);
		 System.out.println("최대값: "+maxnum);

	}

}
