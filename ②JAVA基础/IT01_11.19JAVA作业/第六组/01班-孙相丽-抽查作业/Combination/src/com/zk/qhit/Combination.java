package com.zk.qhit;

/**
 * @author 
 * @date 创建时间：2017年11月18日 下午5:03:53
 * @version 1.0
 * @E-mail 
 * 
 * @since
 * @return
 * @function
 */
public class Combination {

	public static void main(String[] args) {
		// 从1,2,3,4,5这五个数任意取出俩个数，列出它们的所有组合，并输出
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i != j) {
					System.out.println(i +" "+ j);
				}
			}
		}

	}
}
