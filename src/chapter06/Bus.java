package chapter06;

public class Bus {
	
		//�������
		int busNumber;
		int passengerCount;
		int money;
		
		//������ �����ε�(int busNumber)
		public Bus(int busNumber) {
			this.busNumber = busNumber;
		}
		
		//�޼ҵ�
		public void take(int money) { //�°��� �� �� 
			this.money += money; //���� ���� ����
			passengerCount++; //�°� ��
		}

		public void showInfo() {
			System.out.println("���� "+busNumber+"�� �°��� "+passengerCount+"���̰�, ������ "+money+"���Դϴ�.");
		}

}
