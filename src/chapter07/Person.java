package chapter07;

public class Person {
	
	String name;
	float height;
	float weight;
	
	//생성자의 오버로딩
	public Person() {
	
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	

}
