package chapter06;

public class BuyCoffee {

	public static void main(String[] args) {
		
		//�� 2�� ����(Kim 12000�� / Park 10000��)
		Customer Kim = new Customer("Kim",12000);
		Customer Park = new Customer("Park",10000);
		
		//ī�� ����(ī�䰴ü�̸� -> ���̳��� Ŀ��)
		Cafe cafeA=new Cafe("���̳��� Ŀ��");
		
		//ī�� �湮(���̳��� Ŀ�� ->  Kim 4000 / Park 4500)
		Kim.visitCafe(cafeA, 4000);
		Park.visitCafe(cafeA, 4500);
		
		//ī������ Ȯ��
		cafeA.showInfo();
		
		//������ Ȯ��
		Kim.showInfo();
		Park.showInfo();

	}

}
