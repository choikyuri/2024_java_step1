package chapter06;

public class BookMain {

	public static void main(String[] args) {
		/*
		Book[] bk=new Book[5];
		
		
		//Book bk0=new Book();
		//Book bk1=new Book();
		//Book bk2=new Book();
		//Book bk3=new Book();
		//Book bk4=new Book();
        
		
		for(int i=0;i<bk.length;i++) {
			System.out.println((i+1)+"��°: "+bk[i]);
		}
		*/
		//��ü �ټ� ����
		Book[] library=new Book[5];
		//������� �ʱ�ȭ
		library[0]=new Book("���̾�", "�츣�� �켼");
		library[1]=new Book("�����Ӹ���", "����޸�");
		library[2]=new Book("�鼳����", "�׸�����");
		library[3]=new Book("ī������ �ſ�", "�������� ��������");
		library[4]=new Book("�����", "�������丮");
		
		//------------------------------------------------
		//System.out.println(library[0].bookname);
		//System.out.println(library[0].author);
		/*
		library[0].showBookinfo();
		library[1].showBookinfo();
		library[2].showBookinfo();
		library[3].showBookinfo();
		library[4].showBookinfo();
		*/
		
		for(int i=0;i<library.length;i++) {
			library[i].showBookinfo();
		}
		
		System.out.println("---------------------------");
		
		Book bk1=new Book();
		bk1.setBookname("�ڹ��� ����");
		bk1.setAuthor("���ü�");
		
		System.out.println("å�̸�: "+bk1.getBookname());
		System.out.println("����: "+bk1.getAuthor());
		
		System.out.println("----------------------");
		
		Book bk2=new Book();
		bk2.setBookname("�Ƿλ�ȸ");
		bk2.setAuthor("�Ѻ�ö");

		System.out.println("å �̸�: "+bk2.getBookname());
		System.out.println("����: "+bk2.getAuthor());
		
		
		
		
		
	}

}
