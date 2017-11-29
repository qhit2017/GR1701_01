package com.zk.qhit;

import java.util.Scanner;

/**
 * @author 
 * @date 创建时间：2017年11月18日 下午5:36:45
 * @version 1.0
 * @E-mail 
 * 
 * @since
 * @return
 * @function
 */
public class Seven {
	public static void main(String[] args) {
		// 通过控制台输入一个数N（N不大于10000），输出所有7的倍数和包含7的数字
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个不大于10000的整数");
		int N = sc.nextInt();
		if (N > 10000) {
			System.out.println("数字不能大于10000");
		} else {
			for (int i = 1; i < N; i++) {
				if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7
						|| i / 100 == 7 || i / 1000 == 7) {
					System.out.println(i);
				}

			}
		}

		sc.close();
	}

}
