package chapter06;

public class Subway {
	
		//멤버변수
		public String lineNumber;
		public int passengerCount;
		public int money;
		
		//생성자 오버로드
		public Subway(String lineNumber) {
			
			this.lineNumber = lineNumber;
		} 
		
		public void take(int money) {
			this.money +=money;
			passengerCount++;
		}
		
		public void showInfo() {
			System.out.println("지하철 "+lineNumber+"의 승객은 "+passengerCount+"명이고, 수입은 "+money+"원입니다.");
		}
		
		
	
	

}
