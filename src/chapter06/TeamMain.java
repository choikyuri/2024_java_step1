package chapter06;

public class TeamMain {

	public static void main(String[] args) {
	
		//TeamGroup의 객체(team)
		TeamGroup team=new TeamGroup();
		
		team.init();
		team.Disp();
		
		System.out.println();
		TeamMember t=new TeamMember();
		t.setmName("고예림");
		System.out.println("팀장이름: "+t.getmName());
		t.setmPhone("010-1234-5678");
		System.out.println("팀장전화번호: "+t.getmPhone());
        t.setsName("박찬흠");
        System.out.println("부팀장이름: "+t.getsName());
	
	
	}

}
