package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		
		//�л� 2�� ����(studentJames, studentTom)
		StdInfo studentJames=new StdInfo("James", 12000);
		StdInfo studentTom=new StdInfo("Tom", 10000);
		
		//����Ÿ��
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100); //-1000
		//James ����Ȯ��
		studentJames.showInfo(); //����
		bus100.showInfo();//��������, �ο��� ����
		System.out.println("===============================");
		Bus bus999=new Bus(999);
		studentTom.takeBus(bus999);
		studentTom.takeBus(bus100);
		studentTom.showInfo();
		bus100.showInfo();
		bus999.showInfo();
		
		System.out.println();
		//����ö Ÿ��
		Subway subwayGreen=new Subway("2ȣ��");
		studentTom.takeSubway(subwayGreen);
		//����Ȯ��
		studentTom.showInfo();
		subwayGreen.showInfo();
		
		Subway subwayOrange = new Subway("3ȣ��");
		studentJames.takeSubway(subwayOrange);
		studentJames.showInfo();
		subwayOrange.showInfo();

	}

}
