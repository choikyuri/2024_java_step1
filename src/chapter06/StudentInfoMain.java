package chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {
		
		// #1. ������� ���� �ʱ�ȭ: studentKim 
		StudentInfo studentKim=new StudentInfo();
		studentKim.studentID=1000;
		studentKim.grade=4;
		studentKim.address="���α�";
		System.out.println(studentKim.address); //null
	    
	    // #2. �����ڸ� ���� �ʱ�ȭ: studentLee
		StudentInfo studentLee=new StudentInfo(1004, "�鼳", 1, "�ϻ굿��");
		System.out.println(studentLee.address); //�ϻ굿��
	
		// #3. getters & setters �ʱ�ȭ: studentPark
		StudentInfo studentPark=new StudentInfo();
		studentPark.setStudentName("����");
		System.out.println(studentPark.getStudentName());
		
	}

}
