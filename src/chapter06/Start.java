package chapter06;

import java.util.Random;

public class Start {
	
	private int pcnum=new Random().nextInt(50)+1; //1~50 ���� ����
	private int count=0;
	private String result="FAIL";
	
	public String check(int mynumber) {
		count++;
		//random(pcnum)������ ������ up, ũ�� down, ��ġ�ϸ� result="SUCCESS"
		if(mynumber < pcnum) {
			System.out.println("UP");
		}else if(mynumber > pcnum) {
			System.out.println("Down");
		}else {
			System.out.println(count+"ȸ ���� ����!");
			result="SUCCESS";	
		}
		
	 	return result;
		
	}

}
