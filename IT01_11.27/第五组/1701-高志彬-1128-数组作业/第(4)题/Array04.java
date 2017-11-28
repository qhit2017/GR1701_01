package com.gzz.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月27日 下午6:45:41
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Array04 {
	// 4 从键盘输入10个数，并从大到小排序
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length - 1; i++) {
			boolean isSort = false;
			int temp = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					isSort = true;
				}
				if (isSort) {
					break;
				}
			}
			System.out.println(Arrays.toString(a));
		}
		System.out.println("最终结果（从小到大）：" + Arrays.toString(a));
	}

}