package chapter04;

public class Example02 {

	public static void main(String[] args) {
		//for ���� �̿��Ͽ� ���� �迭�� ������ �ٴ����� ��հ� ��ü��� �� ���ϼ���
		int[][] array = { {95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88} }; //3�� x��
		/* ����� 2���� �迭
		95 86 => 0
		83 92 96 => 1
		78 83 93 87 88 => 2
        */
		double avg=0; //�� ���� ���
		int total=0; //�� ���� ��
		int alltotal=0; //��ü�迭�� ��
		int count=0; //��ü ����� ���� ��
		//��  array.length => 3
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) { // 0�� => 0��, 1�� | 1�� => 0��, 1��, 2��
				total +=array[i][j]; //array[1][0] array[1][1] array[1][2]
				count++;//��ü ��տ� ���� ī��Ʈ
			}
			alltotal +=total; //��ü ��տ� ���� ��
			avg=(double)total/array[i].length;
			System.out.println((i+1)+"��° ���� ��� : "+avg+"�Դϴ�.");
			total=0; //���� ���� ����� ���� �����Ⱚ ����
		}//for
		
		avg=(double)alltotal/count;
		System.out.println("�迭 ��ü�� ��� : "+avg+"�Դϴ�.");

	}

}
