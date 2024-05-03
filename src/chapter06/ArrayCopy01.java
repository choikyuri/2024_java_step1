package chapter06;

public class ArrayCopy01 {

	public static void main(String[] args) {
		// 얕은 복사
		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("데미안", "헤르만 헤세");
		bookArray1[1]=new Book("빨간머리앤", "몽고메리");
		bookArray1[2]=new Book("백설공주", "그림형제");
		
		System.out.println("=========bookArray1 원본=========");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookinfo();
		}
		
		//복사
		//복사할 배열, 복사할 첫 위치, 대상배열, 붙여넣을 첫 위치, 복사할 요소 갯수
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		System.out.println("=========bookArray2 복사본=========");
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
		}
		
		//===================================================
		System.out.println();
		bookArray1[0].setBookname("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("=========bookArray1 원본변경=========");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookinfo();
		}
		
		System.out.println();
		System.out.println("=========bookArray2 복사본변경=========");
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
		}
		
	}

}
