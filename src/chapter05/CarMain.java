package chapter05;

public class CarMain {

	public static void main(String[] args) {
		
		Car mycar=new Car(); //heap
		mycar.carName="��� K5";
		mycar.carColor="�Ͼ��";
		
		System.out.println("������� ���: "+mycar.carName);
		System.out.println("�޼��� ���: "+mycar.getCarName());
		
		//��������� �̿��� �÷����
		//�޼��带 �̿��Ͽ� ���� �̸��� �÷� ���
		System.out.println("������� ���: "+mycar.carColor);
		System.out.print("�޼��� ���: ");
		mycar.showCarInto();
		

	}

}
