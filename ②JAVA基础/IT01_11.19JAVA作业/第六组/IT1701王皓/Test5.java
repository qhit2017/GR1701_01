package com.wanghao.qhit01;

/**
 * 作者：王皓 E-mail:954610522@qq.com 
 * 
 * 创建时间：2017年11月18日 下午20:57:42
 */
public class Test5 {
	public static void main(String[] args) {
		System.out.println("1000以内所有能被5和3整除的数如下表示：");
		
		int i = 1;
		int sum = 0;
		
		do {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.print(i + "\t");
				sum += 1;
				
				if (sum % 6 == 0) {
					System.out.println();
				}
			}

			i++;
		} while (i <= 1000);
	}
}
