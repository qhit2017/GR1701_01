package one;

import java.util.Scanner;

/**
 * @author 作者 E-mail:738348954@qq.com
 * @date 创建时间：2017年11月20日 下午8:08:43
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Work {
	public static void main(String[] args) {
		// 编写Java程序，通过控制台输入一个整数N，（N不大于1000），
		// 输出所有7的倍数和包含7的数字
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数");
		int n = input.nextInt();
		if (n > 1000) {
			System.out.println("您输入的数字错误");

		} else {
			for (int a = 1; a <= 1000; a++) {
				if (a % 7 == 0) {
					System.out.println(a);
				}
				if (a / 1000 == 7 || a / 100 % 10 == 7 || a / 10 % 10 == 7
						|| a % 10 == 7) {
					System.out.println(a);
				}

			}

		}
	}
}
