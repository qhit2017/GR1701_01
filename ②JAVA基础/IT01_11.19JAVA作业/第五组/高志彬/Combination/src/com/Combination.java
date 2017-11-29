package com;

/**
 * @author 作者 E-mail:271406@163.com
 * @date 创建时间：2017年11月18日 下午1:22:52
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Combination {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if( !(i== j)) {
					System.out.print(i);
					System.out.println(j);
				
				}
				

			}
		}

	}

}
