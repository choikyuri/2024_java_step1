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
			System.out.println((i+1)+"번째: "+bk[i]);
		}
		*/
		//객체 다수 생성
		Book[] library=new Book[5];
		//멤버변수 초기화
		library[0]=new Book("데미안", "헤르만 헤세");
		library[1]=new Book("빨간머리앤", "몽고메리");
		library[2]=new Book("백설공주", "그림형제");
		library[3]=new Book("카산드라의 거울", "베르나르 베르베르");
		library[4]=new Book("어린왕자", "생택쥐페리");
		
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
		bk1.setBookname("자바의 정석");
		bk1.setAuthor("남궁선");
		
		System.out.println("책이름: "+bk1.getBookname());
		System.out.println("저자: "+bk1.getAuthor());
		
		System.out.println("----------------------");
		
		Book bk2=new Book();
		bk2.setBookname("피로사회");
		bk2.setAuthor("한병철");

		System.out.println("책 이름: "+bk2.getBookname());
		System.out.println("저자: "+bk2.getAuthor());
		
		
		
		
		
	}

}
