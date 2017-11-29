package com;

/**
 * @author 作者 E-mail271406@163.com
 * @date 创建时间：2017年11月17日 下午7:03:20
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Multiple {
	public static void main(String[] args) {

		int sum = 0;
		for (int a = 1; a <= 1000; a++) {
			if (a % 8 == 0) {
				sum += a;
			}
		}
		System.out.println(sum);

	}

}
