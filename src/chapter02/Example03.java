package chapter02;

public class Example03 {

	public static void main(String[] args) {
		//#1
		//���׿����ڸ� �̿��Ͽ� score1�� 60 ���� ũ�ų� ������ �հ�
		//�׷��� ������ ���հ����� ��ȯ �Ͻÿ�.
		int score1=60;
		
		String pass=(score1>=60)?"�հ�":"���հ�";
		System.out.println("�հ� ���� : "+pass);
		
		//#2
		//���׿����ڸ� �̿��Ͽ� score2�� 90���� ũ�� 'A'�̰�
		//score2�� 80���� ũ�� 'B' �� ���ϴ� ��� 'C'�� �����Ѵ�
		int score2=80;
		char grade;
		grade=(score2 >90)?'A':((score2>80)?'B':'C');
		System.out.println("���� : "+grade);
		

	}

}
