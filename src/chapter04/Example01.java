package chapter04;

public class Example01 {

	public static void main(String[] args) {
		// for���� �̿��Ͽ� ���� �迭�� ������ �ٴ����� ����� ���Ͻÿ�
		int[][] array= { {95,86}, {83,92,96}, {78,83,93,87,88} };
		
		
		double avg=0;
		int total=0;
		int alltotal=0;
		int count=0;
		
		int sum[]=new int[3];
		
		//for���� �̿� -> �� ���� �����ͼ� ������ ���� �о sum�� �����ϰ�(count++) ��ձ��� ���Ͽ� ��� 
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum[i]+=array[i][j]; //{95,86} -> (0,0) (0,1) | {83,92,96} -> (1,0) (1,1) (1,2) | {78,83,93,87,88} -> (2,0) (2,1) (2,2) (2,3) (2,4)
				count++;
			}
			System.out.println("�� ���� �� : "+sum[i]);
			avg=sum[i]/(double)count;
			System.out.println("�� ���� ��� : "+avg);
			System.out.println("-------------------------");
			count=0; //�ʱ�ȭ
		}//out for
		

	}

}
