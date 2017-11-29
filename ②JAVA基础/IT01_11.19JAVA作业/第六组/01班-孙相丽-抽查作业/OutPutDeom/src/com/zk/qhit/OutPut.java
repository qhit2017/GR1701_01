package com.zk.qhit;

/**
 * @author 
 * @date 创建时间：2017年11月18日 下午4:49:51
 * @version 1.0
 * @E-mail 
 * 
 * @since
 * @return
 * @function
 */
public class OutPut {

	public static void main(String[] args) {
		// 1至10所有的整数相加，得到累加值大于20的当前数字，将该数字输出
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			if (sum > 20) {
				break;
			}

		}
		System.out.println(sum);
	}
}
