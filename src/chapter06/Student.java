package chapter06;

public class Student {
	
	//�������=�ʵ�
	public static final int studentID=1000;
	public String studentName;
	int grade;
	String address;
	
	//������ �����ε�
	public Student() {
		
	}

	public Student(String studentName, String address) {
		this.studentName = studentName;
		this.address = address;
	}
	
	//�޼ҵ�
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	//����ڰ� ����
	public void showStudedntInfo() {
		System.out.println(studentName+", "+address);
	}
	

}
