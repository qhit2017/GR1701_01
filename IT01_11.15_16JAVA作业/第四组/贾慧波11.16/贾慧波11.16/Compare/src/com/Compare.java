package com;

import java.util.Scanner;

/**
 * @author 作者 E-mail:271406@163.com
 * @date 创建时间：2017年11月16日 下午7:40:10
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

class Compare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字");
		double i = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("请输入二个数字");
		double k = sc1.nextInt();
		if (i > k) {
			System.out.println(i+">"+k );

		}
		if (i < k) {
			System.out.println(i+"<"+k);
		}

	}

}
