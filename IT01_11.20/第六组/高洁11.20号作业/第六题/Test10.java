package com.gaojie.qhit01;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月18日 下午1:21:38
 */
public class Test10 {
	public static void main(String[] args) {
		System.out.println("九九乘法表 do while循环表示如下");
		
		int i = 1;

		do {
			int g = 1;
			
				do {
					System.out.print(i + "*" + g + "=" + i * g + "  ");
					g++;
				} while (g <= i);

			System.out.println();
			i++;
			} while (i <= 9);

	}

}
