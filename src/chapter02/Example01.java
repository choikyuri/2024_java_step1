package chapter02;

public class Example01 {

	public static void main(String[] args) {
		// 534���� å�� �л� 30������ �Ȱ��� ������ ������ ��,
		// �л��� ��� ������, ���������� � ������ ���غ��� 
		
		int books=534;
		int students=30;
		
		//�л��� �� ���� ������ å�� ��
		int booksPerStudents = (books/students);
		System.out.println(booksPerStudents);
		//���� å�� ��
		int bookLeft=(books % students);
		System.out.println(bookLeft);

	}

}