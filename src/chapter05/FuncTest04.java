package chapter05;

import javax.swing.JOptionPane;

public class FuncTest04 {
	
	public static void Display(String A[]) {
		String res=""; //빈문서
		
		for(int i=0;i<A.length;i++) {
			res+=A[i]+" ";
		}
		
		System.out.println(res);
		JOptionPane.showMessageDialog(null, "배열의 요소값\n\n"+res);
		
	}

	public static void main(String[] args) {
		String str[]= {"Java", "Oracle", "JSP", "HTML5", "CSS", "SpringBoot"};
		Display(str);

	}

}
