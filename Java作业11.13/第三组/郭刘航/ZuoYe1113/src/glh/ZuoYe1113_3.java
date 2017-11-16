package glh;

import java.util.Scanner;

public class ZuoYe1113_3 {
	public static void main(String[] args) {
		for (;;) {

			Scanner sc = new Scanner(System.in);
			int grade = sc.nextInt();

			System.out.println(grade >= 90 ? "A" : grade >= 60 ? "B" : "C");

		}
	}
}
