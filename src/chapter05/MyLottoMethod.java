package chapter05;

import javax.swing.JOptionPane;

public class MyLottoMethod {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("���ϴ� �ζ� ����Ƚ���� �Է��ϼ���"));//5
        int cnt = 0;
        System.out.println("==== �̹��� �ζ� �����ȣ ====");
        while (number > cnt) {
            System.out.print("[" + (cnt + 1) + "] : ");
            int[] lotto = new int[6]; // 0 1 2 3 4 5
            int index = 0;
            while (index < 6) {
                int num = (int) (Math.random() * 45) + 1;
                if (!contains(lotto, num)) { //�ߺ�üũ
                    lotto[index++] = num;
                }
            }
            for (int num : lotto) {
                System.out.print(num + " "); // 2 6 15 23 44 45
            }
            System.out.println();
            cnt++;
          }//while
	}//main
	
	//�ߺ�üũ���ִ� �޼ҵ�
	private static boolean contains(int[] arr, int num) {
		for (int i : arr) {
	        if (i == num) { //�迭�濡 �ִ� ���� == ��� �޾ƿ� ����
	            return true; //�ߺ��� ���� ����
	        }
	    }
		return false; //�ߺ��� ���� ����
	}//contains

}//class
