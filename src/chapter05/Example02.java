package chapter05;

public class Example02 {
	
	//�ִ밪�� �޼ҵ�� ����
	public static int findMax(int[] arr) {
		
		int max= arr[0]; //�迭�� ù��° ���
		/*
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}*/
		//��� for
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
		 System.out.println("�ִ밪: "+maxnum);

	}

}
