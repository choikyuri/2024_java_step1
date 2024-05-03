package chapter06;

public class TeamGroup {
	
	//멤버변수
	private TeamMember[] member=new TeamMember[6];
	

	//기본생성자
	
	//초기화 메소드
	public void init() {
		member[0]=new TeamMember("최영준","남");
		member[1]=new TeamMember("김성웅","남");
		member[2]=new TeamMember("송수진","여");
		member[3]=new TeamMember("권한솔","여");
		member[4]=new TeamMember("장민","남");
		member[5]=new TeamMember("김현수","남");
	}
	
	//출력 메소드
	public void Disp() {
		for(int i=0; i<member.length;i++) {
			System.out.print("성명: "+(member[i].getName()));
			System.out.println(", 성별: "+ member[i].getGender());
		}
	
	}
}
