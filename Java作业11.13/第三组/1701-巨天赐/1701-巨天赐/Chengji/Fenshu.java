package toy;

import java.util.Scanner;

public class Fenshu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÊäÈë·ÖÊý");
		int i = sc.nextInt();
		if (i >= 90) {
			System.out.println("a");
		}
		if (i >= 60 && i <= 89) {
			System.out.println("b");
		}
		if (i <= 60) {
			System.out.println("c");
		}

	}
}
