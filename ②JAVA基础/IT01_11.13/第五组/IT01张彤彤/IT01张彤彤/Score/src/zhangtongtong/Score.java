package zhangtongtong;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊäÈë³É¼¨£º");
		int a = input.nextInt();
		
		if (a>=90){
			System.out.println("A");
		}
		if (a>=60&&a<=89){
			System.out.println("B");
		}
		if(a<60&&a>=0){
			System.out.println("C");
		}
	}
}
