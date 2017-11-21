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
		for (int h = 1; h <= 1000; h++) {
			if (h % 8 == 0) {
				sum += h;
			}
		}
		System.out.println(sum);

	}

}
