import java.util.Scanner;

public class Score {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊäÈë³É¼¨£º");
		int i = input.nextInt();

		if (i >= 90) {
			System.out.println("A");
		}

		if (i >= 60 && i <= 89) {
			System.out.println("B");
		}

		if (i < 60 && i >= 0) {
			System.out.println("C");
		}
	}

}
