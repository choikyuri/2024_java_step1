package chapter05;

public class FuncTest05 {
	
	//멤버변수=필드 
	public String channel;
	public int channelInt;
	public int volume;
	
	public int channelUp(int volume) {
		System.out.println("소리를 높이겠습니다.");
		return volume+2;
	}
	
	public void channelDown(int volume) {
		System.out.println("소리를 "+volume+"만큼 내립니다.");
		//return volume-2;
	}

	public static void main(String[] args) {
		
		FuncTest05 tv=new FuncTest05();	
		
		System.out.println("소리를 "+tv.channelUp(5)+"만큼 올립니다.");
		System.out.println("===========================");
		int volume=tv.channelUp(9);
		System.out.println("소리를 "+volume+"만큼 올립니다.");
		
        System.out.println();
        tv.channelDown(5); 
        
        
	}

}
