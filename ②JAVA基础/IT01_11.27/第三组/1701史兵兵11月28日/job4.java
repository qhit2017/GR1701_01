package job;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:738348954@qq.com
 * @date    创建时间：2017年11月28日 下午7:10:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class job4 {
	public static void main(String[] args) {
		//从键盘输入10个数，并从大到小排序
		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];

		int b = 0;

		for (int k = 0; k < a.length; k++) {
			System.out.println("请输入第" + (k + 1) + "个数： \t");
			a[k] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));

		for (int j = 0; j < a.length - 1; j++) {

			for (int i = 0; i < a.length - 1; i++) {

				if (a[i] > a[i + 1]) {

					b = a[i];

					a[i] = a[i + 1];

					a[i + 1] = b;

				}

			}

		}
		System.out.println("由小到大的排序为：");
		System.out.println(Arrays.toString(a));

		sc.close();

	}

}
