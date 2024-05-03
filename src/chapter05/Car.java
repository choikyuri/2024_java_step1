package chapter05;

public class Car {
	
	//멤버변수(=필드)
	String carName;
	String carColor;
	int carNumber;
	
	//생성자
	
	//메소드
	public void setCarName(String name) {
		carName=name;
	}
	
	public String getCarName() {
		return carName;
	}
	
	public void showCarInto() {
		System.out.println(carName+", "+carColor);
	}
	

}
