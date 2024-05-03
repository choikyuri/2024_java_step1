package chapter05;

public class CarMain {

	public static void main(String[] args) {
		
		Car mycar=new Car(); //heap
		mycar.carName="기아 K5";
		mycar.carColor="하얀색";
		
		System.out.println("멤버변수 사용: "+mycar.carName);
		System.out.println("메서드 사용: "+mycar.getCarName());
		
		//멤버변수를 이용한 컬러출력
		//메서드를 이용하여 차의 이름과 컬러 출력
		System.out.println("멤버변수 사용: "+mycar.carColor);
		System.out.print("메서드 사용: ");
		mycar.showCarInto();
		

	}

}
