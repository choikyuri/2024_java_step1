package chapter01;

public class ExplicitConversion14 {

	public static void main(String[] args) {
		
         //ĳ���� ����(����� ����ȯ)
		 int iNum=1000;
		 byte bNum=(byte)iNum; //-128 ~ 127
		 
		 System.out.println(iNum);
		 System.out.println(bNum); //���ǵ� �����(�ս�)
		 System.out.println("=============================");
		 
		 double dNum1=1.2; //8
		 float fNum1=0.9f; //4
		 
		 int iNum2=(int)(dNum1+fNum1); //1.2+0.9=2.1 => 2
		 int iNum3=(int)dNum1+(int)fNum1; //1+0=1
		 
		 System.out.println(iNum2); //2
		 System.out.println(iNum3); //1
		 
		 
	}

}
