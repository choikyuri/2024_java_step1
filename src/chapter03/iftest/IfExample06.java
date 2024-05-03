package chapter03.iftest;

public class IfExample06 {

	public static void main(String[] args) {
		// 1¡° ~ 6¡°±Ó¡ˆ πﬁ¿ª ºˆ ¿÷¿Ω ∞¢ ¡°ºˆ¥Á ∫–Ωƒ ΩÓ±‚
		int num=(int)(Math.random()*6)+1; //0 1 2 3 4 5 -> 1 2 3 4 5 6
		
		if(num==1) {
			System.out.println("1¡° -> º¯¥Î");
		}else if(num==2) {
			System.out.println("2¡° -> ø¿¬°æÓ∆¢±Ë");
		}else if(num==3) {
			System.out.println("3¡° -> æÓπ¨");
		}else if(num==4) {
			System.out.println("4¡° -> ±Ë∏ª¿Ã");
		}else if(num==5) {
			System.out.println("5¡° -> ±Ëπ‰");
		}else {
			System.out.println("6¡° -> ∂±∫∫¿Ã");
		}

	}//main

}//class
