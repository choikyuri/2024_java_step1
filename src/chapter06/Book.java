package chapter06;

public class Book {
	
	//멤버변수(=필드)
	public String bookname;
	public String author;
	
	//생성자
	public Book() {
		
	}
	
    //메모리 확보 + 멤버변수방에 초기화
	public Book(String bookname, String author) {
		this.bookname = bookname;
		this.author = author;
	}
	
	//메소드
	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	//사용자 정의 메소드
	public void showBookinfo() {
		System.out.println("책이름: " + bookname+"| 저자: " + author );
	}


}
