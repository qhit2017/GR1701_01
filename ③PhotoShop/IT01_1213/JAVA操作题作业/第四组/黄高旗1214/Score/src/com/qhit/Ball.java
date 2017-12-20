package com.number;
/** 
 * @author  作者: xuyunmeng
 * @date    创建时间：2017年12月14日 下午1:45:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Ball {

	public static void main(String[] args) {
		double a = 0.5;
		double b = 0;
		for (int i = 1; i < 10; i++) {
			b = b+2*100*a;
			a = a*0.5;
			
		}
		System.out.println(b+100);
	}
}
