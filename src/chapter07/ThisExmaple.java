package chapter07;

public class ThisExmaple {
	
	int day;
	int month;
	int year;
	
	public ThisExmaple() {
		// TODO Auto-generated constructor stub
	}
	

	public ThisExmaple(int year, int month, int day) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	

	public int getDay() {
		return day;
	}



	public void setDay(int day) {
		this.day = day;
	}



	public int getMonth() {
		return month;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		
		ThisExmaple birth1=new ThisExmaple(2024, 03, 07);
		birth1.printThis();//객체의 주소반환
		System.out.println("생년월일: "+birth1.year+"."+birth1.month+"."+birth1.day);
		
		ThisExmaple birth2=new ThisExmaple();
		birth2.printThis();//객체의 주소반환
		birth2.setYear(2024);
		birth2.setMonth(8);
		birth2.setDay(14);
		System.out.println("생년월일: "+birth2.year+"."+birth2.month+"."+birth2.day);
		
		ThisExmaple birth3=new ThisExmaple(2024,5,8);
		birth3.printThis();//객체의 주소반환
		birth3.setYear(2024);
		birth3.setMonth(12);
		birth3.setDay(24);
		System.out.println("생년월일: "+birth3.year+"."+birth3.month+"."+birth3.day);
		

	}

}






