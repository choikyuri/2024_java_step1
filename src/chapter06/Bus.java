package chapter06;

public class Bus {
	
		//멤버변수
		int busNumber;
		int passengerCount;
		int money;
		
		//생성자 오버로딩(int busNumber)
		public Bus(int busNumber) {
			this.busNumber = busNumber;
		}
		
		//메소드
		public void take(int money) { //승객이 낸 돈 
			this.money += money; //버스 수입 증가
			passengerCount++; //승객 수
		}

		public void showInfo() {
			System.out.println("버스 "+busNumber+"번 승객은 "+passengerCount+"명이고, 수입은 "+money+"원입니다.");
		}

}
