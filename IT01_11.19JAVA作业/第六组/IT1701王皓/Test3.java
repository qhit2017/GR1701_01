package com.wanghao.qhit01;

/**
 * 作者：王皓 E-mail:954610522@qq.com 
 * 
 * 创建时间：2017年11月18日 下午20:42:06
 */
public class Test3 {
	public static void main(String[] args) {

		System.out.println("1000以内所有的奇数为：");
		
		int sum = 0;
		
		for (int i = 1; i <= 1000; i++) {
			
			if (i % 2 != 0) {
				System.out.print(i + "\t");
				sum += 1;
				
				if (sum % 5 == 0) {
					System.out.println();
				}
			}
		}

	}

}
