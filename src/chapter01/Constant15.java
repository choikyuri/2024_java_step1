package chapter01;

public class Constant15 {

	public static void main(String[] args) {
		//��� : ������ �ʴ� ��
		
		final int MAX_NUM=100; //�ʱ�ȭ
		final int MIN_NUM; //����
		final double PI=3.14;
		
		MIN_NUM=0; //���ͳΰ�
		//PI=10.5; //���ͳΰ� ����� fanal�� ����Ǿ� �־� ERROR
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		System.out.println(PI);

	}

}
