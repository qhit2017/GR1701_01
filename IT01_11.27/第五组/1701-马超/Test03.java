package machao;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 作者 E-mail:996939518@qq.com
 * @date 创建时间：2017年11月28日 下午7:24:28
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test03 {

	public static void main(String[] args) {
		// 从键盘输入10个数,并从大到小排序.

		Scanner sc = new Scanner(System.in);
		int[] a = { 58, 12, 75, 96, 36, 41, 95, 85, 47, 35 };
		int temp;

		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数");
			a[i] = sc.nextInt();

			for (int j = 0; j < a.length - 1; j++) {

				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
				System.out.println(Arrays.toString(a));
			}
		}
	}
}
