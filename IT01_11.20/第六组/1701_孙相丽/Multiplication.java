package com.zk.qhit;

/**
 * @author
 * @date 创建时间：2017年11月18日 下午6:19:58
 * @version 1.0
 * @E-mail 
 * @since
 * @return
 * @function
 */
public class Multiplication {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= i) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();

			i++;
		}

	}
}
