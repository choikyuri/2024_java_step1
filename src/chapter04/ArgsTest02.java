package chapter04;

public class ArgsTest02 {

	public static void main(String[] args) {
		
		//�迭����1
		int a[]=new int[5];
		
		//�迭����2
		int b[]; //����
		//.....
		b=new int[5];
		
		int aVal;
		int bVal;
		int Tot;
		
		//�迭 ����3(�Ű����� Ȱ��)
		args=new String[2];
		args[0]="1"; //[0] ÷��,�ε��� / "1" ���
		args[1]="2";
		
		if(args.length==2) {
			aVal=Integer.parseInt(args[0]);
			bVal=Integer.parseInt(args[1]);
		}else {
			aVal=0;
			bVal=0;
		}
		
		Tot=aVal+bVal;
		System.out.println(Tot);
		
		//�迭 ����4
		String[] str;
		str=new String[10];
		
		
		
		
		
		
	}//main

}
