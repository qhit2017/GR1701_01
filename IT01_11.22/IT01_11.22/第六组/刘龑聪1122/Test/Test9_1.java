package homework;

import java.util.Scanner;

/*作者：刘龑聪
 E-mail：15539919713@163.com
 */
public class Test9_1 {
	public static void main(String[] args) {

		System.out.println("请输入一个不大于10000的数字！！");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int t = 0;

		if (N > 10000) {
			System.out.println("请输入正确的数字！！！");
		} else {
			for (int i = 1; i <= N; i++) {
				if ((i % 7 == 0)
						&& (i / 1000 == 7 || i / 100 % 10 == 7
								|| i / 10 % 10 == 7 || i % 10 == 7)) {
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
