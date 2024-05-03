package chapter05;

public class FunTest06 {
	
	//멤버변수=필드 (this로 대입연산)
	public String channel;
	public int channelInt;
	public int volume;
	
	//생성자 생략가능(디폴트 생성자이기 때문에 자동 생성)
	
	//메소드
	public int channelUp(int volume) {
		this.volume=volume;
		System.out.println("소리를 높이겠습니다.");
		return volume+2;
	}
	public void channelDown(int volume) {
		this.volume=volume;
		System.out.println("소리를 내리겠습니다.");
		System.out.println("소리를 "+volume+"만큼 내립니다.");
	}
	
	public static void main(String[] args) {
		
		FunTest06 tv=new FunTest06();
		int a=5;
		int b=9;
		System.out.println("소리를 "+tv.channelUp(a)+"만큼 올립니다.");
		System.out.println("===========================");
		
		int volume1=tv.channelUp(b);
		System.out.println("소리를 "+volume1+"만큼 내립니다.");
		System.out.println("===========================");
		//void 메소드 호출
		tv.channelDown(b);
				
	}

}
