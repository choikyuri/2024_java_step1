package chapter07;


class Person2{
	
	String name;
	int age;
	
	//생성자
	public Person2() { 
		this("이름없음", 0); //this: Person2(String name, int age)과 같음
	}	
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person2 returnSelf() {//자기자신의 주소
		return this;
	}
	
}

public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person2 noName=new Person2();
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println("noName의 주소: "+noName);
		System.out.println("noName의 주소: "+noName.returnSelf());
		
		System.out.println("-------------------------------------");
		Person2 p=new Person2();
		System.out.println("p의 주소: "+p);
		System.out.println("p의 주소: "+p.returnSelf());
		//주소 복사
		System.out.println("-------------------------------------");
		Person2 person=noName.returnSelf();
		System.out.println("person의 주소: "+person);
		System.out.println("noName의 주소: "+noName);
		
	}

}




