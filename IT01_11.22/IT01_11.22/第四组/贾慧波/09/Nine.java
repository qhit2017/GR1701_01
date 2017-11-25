package com;

import java.util.Scanner;

/**
 * @author 作者 E-mail:271406@163.com
 * @date 创建时间：2017年11月17日 下午7:44:49
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Nine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数值不可大于10000");
		int b = sc.nextInt();
		if (b> 10000) {
			System.out.println("错误");
		} else {
			for (int j = 1; j < b; j++) {
				if (j % 7 == 0 || j %1000 == 7 || j % 100 == 7
						|| j / 10 % 10 == 7 || j % 10 == 7) {

					System.out.println("输出7的倍数和含7的数字" + j);
				}

			}

		}

	}
}
