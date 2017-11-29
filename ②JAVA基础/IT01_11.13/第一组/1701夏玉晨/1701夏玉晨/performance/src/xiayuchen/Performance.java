package xiayuchen;

import java.util.Scanner;

public class performance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊäÈë³É¼¨£º");
		int i = input.nextInt();

		if (i >= 90) {
			System.out.println("a");
		}
		
		if (i >= 60 && i <= 89) {
			System.out.println("b");
		}
		
		if (i < 60 && i >= 0) {
			System.out.println("c");
		}
		

	}

}
