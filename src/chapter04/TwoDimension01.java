package chapter04;

public class TwoDimension01 {

	public static void main(String[] args) {
		// 이차원 배열
		
		int arr[][]=new int[2][3];
		int n=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				n++; //0
				System.out.print((arr[i][j]=n)+" ");
			}//for
			System.out.println();
		}//for
		
		System.out.println("=========================");
		System.out.println(arr.length); //행
		System.out.println(arr[0].length); //열
		System.out.println("=========================");
		
		int arr1[][]= {{1,2,3},{4,5,6}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
