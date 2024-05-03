package chapter04;

public class ArrayCopy01 {

	public static void main(String[] args) {
		
		int array1[] = {10,20,30,40,50};
		int array2[] = {1,2,3,4,5};
		/*
		for(int i=0;i<array1.length;i++) {
			System.out.println(array1[i]+" ");
		}
		
		System.out.println("========");
		
		for(int arr2:array2) {
			System.out.println(arr2);
		}*/
		
		//복사할 배열, 복사할 첫 위치, 대상배열, 붙여넣을 첫 위치, 복사할 요소 갯수
		System.arraycopy(array1, 0, array2, 1, 4);
		
		for(int i=0;i<array2.length;i++) {
			System.out.println(array2[i]+" ");
		}
		
		System.out.println("========");
		
		for(int arr3:array2) {
			System.out.println(arr3);
		}
	}

}
