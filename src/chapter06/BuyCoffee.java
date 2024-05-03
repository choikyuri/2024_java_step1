package chapter06;

public class BuyCoffee {

	public static void main(String[] args) {
		
		//고객 2명 생성(Kim 12000원 / Park 10000원)
		Customer Kim = new Customer("Kim",12000);
		Customer Park = new Customer("Park",10000);
		
		//카페 생성(카페객체이름 -> 힘이나는 커피)
		Cafe cafeA=new Cafe("힘이나는 커피");
		
		//카페 방문(힘이나는 커피 ->  Kim 4000 / Park 4500)
		Kim.visitCafe(cafeA, 4000);
		Park.visitCafe(cafeA, 4500);
		
		//카페정보 확인
		cafeA.showInfo();
		
		//고객정보 확인
		Kim.showInfo();
		Park.showInfo();

	}

}
