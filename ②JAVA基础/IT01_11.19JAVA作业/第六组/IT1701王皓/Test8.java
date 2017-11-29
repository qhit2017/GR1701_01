package com.wanghao.qhit01;

/**
 * 作者：王皓 E-mail:954610522@qq.com 
 * 
 * 创建时间：2017年11月18日 下午21:19:33
 */
public class Test8 {
	public static void main(String[] args) {

		System.out.println("个位数为6且能被3整除的数如下表示");
		int sum = 0;
		for (int i = 100; i < 1000; i++) {

			if ((i % 10 == 6) && (i % 3 == 0)) {

				System.out.print(i + "\t");
				sum += 1;
				
				if (sum % 6 == 0) {
					
					System.out.println();

				}
			}
		}
	}

}
