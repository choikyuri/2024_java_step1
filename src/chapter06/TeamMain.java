package chapter06;

public class TeamMain {

	public static void main(String[] args) {
	
		//TeamGroup�� ��ü(team)
		TeamGroup team=new TeamGroup();
		
		team.init();
		team.Disp();
		
		System.out.println();
		TeamMember t=new TeamMember();
		t.setmName("����");
		System.out.println("�����̸�: "+t.getmName());
		t.setmPhone("010-1234-5678");
		System.out.println("������ȭ��ȣ: "+t.getmPhone());
        t.setsName("������");
        System.out.println("�������̸�: "+t.getsName());
	
	
	}

}
