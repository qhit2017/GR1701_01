package homework;

import java.util.Scanner;

/*作者：刘龑聪
 E-mail：15539919713@163.com
 */
public class Test9_2 {

	static boolean isDivision(int a, int b) {
		boolean isDivision = (a % b == 0) ? true : false;
		return isDivision;
	}

	static boolean isIncludeNum(int a, int b) {
		for (; a > 0;) {
			if (a % 10 == b) {
				return true;
			} else {
				a = a / 10;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("请输入一个不大于10000的数字！！");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int t = 0;

		if (N > 10000) {
			System.out.println("请输入正确的数字！！！");
		} else {
			for (int i = 1; i <= N; i++) {
				if (isDivision(i, 7) && isIncludeNum(i, 7)) {
					System.out.print(i + "\t");
					t++;
					if (t % 10 == 0) {
						System.out.println();
					}
				}
			}
		}
	}
}