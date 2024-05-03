package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		
		
		//멤버변수 활용하여 초기화(이름, 주소)
		Student student1=new Student();
		student1.studentName="고예림";
		student1.address="강서구";
		student1.showStudedntInfo();
		
		//생성자를 이용하여 초기화(이름, 주소 => student2)
		Student student2=new Student("최영준", "대구");
		student2.showStudedntInfo();
		
		//get/set 메소드
		Student student3=new Student();
		student3.setStudentName("솔데스크");
		student3.setAddress("종로구");
		student3.showStudedntInfo();
		
		System.out.println(student3.getStudentName());
		System.out.println(student3.getAddress());
	

	}

}
