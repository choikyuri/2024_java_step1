package chapter06;

public class StudentInfo {
	
	//멤버변수(=필드)
	int studentID; //1004
	private String studentName; //백설
	int grade;//1
	String address;//일산동구
	
	//생성자
	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}

	public StudentInfo(int studentID, String studentName, int grade, String address) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
	}

	
	//메소드
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
		
	
	

}
