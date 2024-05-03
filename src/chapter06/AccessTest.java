package chapter06;

public class AccessTest {
	
	//멤버변수=필드
	private int aa; //현재 클라스에서만 사용
	public int bb; //접근한정자 공용(다른 클래스나 패키지에서 사용가능)
	int cc; //public 생략
	
	//디폴트 생성자 생략가능

	//메서드
	public void SetAa(int aa) {
		this.aa=aa;
	}
	public void SetBb(int bb) {
		this.bb=bb;
	}
	public void SetCc(int cc) {
		this.cc=cc;
	}
	
	public void Disp() {
		System.out.println("aa값:"+aa+"\nbb값:"+bb+"\ncc값:"+cc);
	}
	

	public static void main(String[] args) {
		
		AccessTest obj=new AccessTest();
		// aa 초기화 방법
		//#1
		//obj.aa=10;
		//#2
		obj.SetAa(20);
		
		obj.SetBb(30);
		
		obj.cc=40;
		
		obj.Disp();
	

	}

}
