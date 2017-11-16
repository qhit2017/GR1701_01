package com;

/**
 * @author 作者 E-mail:271406@163.com
 * @date 创建时间：2017年11月13日 下午7:04:46
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
// 求整数1~100的累加值，但要求跳过个位为3的数
public class Sum {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i < 101; i ++ ) {
			if(i%10==3)
				continue;
			sum += i;
			
		}
		System.out.println(sum);
	}

}
