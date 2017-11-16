package com;

/**
 * @author 作者 E-mail:271406@163.com
 * @date 创建时间：2017年11月13日 下午7:27:28
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
//1000之间的完数
public class Perfectnumber {
	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {
			int tem = 0;
			for (int x = 1; x < i; x++) {
				if (i % x == 0) {

					tem += x;

				}

			}if(tem==i){System.out.println(i);}

		}

	}

}
