package machao;

import java.util.Scanner;

/**
 * @author 作者 E-mail:996939518@qq.com
 * @date 创建时间：2017年11月28日 下午7:16:54
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test02 {

	public static void main(String[] args) {
		// 从键盘输入10个数,输出后5个数.

		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数");
			a[i] = sc.nextInt();

			for (int j = 5; j < a.length; j++) {
				System.out.println(a[j]);
			}
		}

	}
}
