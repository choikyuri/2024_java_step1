package chapter05;

import javax.swing.JOptionPane;

public class MyLottoMethod {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세요"));//5
        int cnt = 0;
        System.out.println("==== 이번주 로또 예상번호 ====");
        while (number > cnt) {
            System.out.print("[" + (cnt + 1) + "] : ");
            int[] lotto = new int[6]; // 0 1 2 3 4 5
            int index = 0;
            while (index < 6) {
                int num = (int) (Math.random() * 45) + 1;
                if (!contains(lotto, num)) { //중복체크
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
	
	//중복체크해주는 메소드
	private static boolean contains(int[] arr, int num) {
		for (int i : arr) {
	        if (i == num) { //배열방에 있는 숫자 == 방금 받아온 숫자
	            return true; //중복된 값이 있음
	        }
	    }
		return false; //중복된 값이 없음
	}//contains

}//class
