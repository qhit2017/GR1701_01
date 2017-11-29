package com;

/**
 * @author 作者 E-mail:271406@163.com
 * @date 创建时间：2017年11月17日 下午7:36:40
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Eight {
	public static void main(String[] args) {
		int j = 0;
		for (int i = 100; i < 1000; i++) {
			if (i % 10 == 6 && i % 3 == 0) {
				System.out.print(i + "  ");
				j++;
			}
		}
		System.out.println();
		System.out.println("总数为：" + j);
	}

}
