import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个整数不大于10000");
		int n = sc.nextInt();
		for (int a = 1; a < n; a++) {
			if ((a % 7 == 0) || (a / 1000 == 7) || (a / 100 == 7)
					|| (a / 10 % 10 == 7) || (a % 10 == 7)) {
				System.out.println("是7的倍数和包含7的数字的数是:" + a);

			}

		}

	}

}
