package chapter05;

public class Car {
	
	//�������(=�ʵ�)
	String carName;
	String carColor;
	int carNumber;
	
	//������
	
	//�޼ҵ�
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
