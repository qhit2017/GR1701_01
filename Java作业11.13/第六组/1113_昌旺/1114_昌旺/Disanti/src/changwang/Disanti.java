package changwang;

import java.util.Scanner;

public class Disanti {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊäÈë³É¼¨£º");
		int i = input.nextInt();

		if (i >= 90) {
			System.out.println("A");
		}
		
		else if (i >= 60 ) {
			System.out.println("B");
		}
		
		else  {
			System.out.println("C");
		}
	}

}
