package com.gzz.arrays;
/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月27日 下午6:40:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Array02 {
	//2 定义一个整型数组{5,9,12,45,18,30}，
	//要求打印出数组中所有元素之和，并打印出最大值和最小值。
	public static void main(String[] args) {
		int []a={5,9,12,45,18,30};		
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("最大值：" + max);
		System.out.println("最小值：" + min);
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];			
		}
		System.out.println("元素之和："+sum);
		
		
		
		
		
		
		
	}

}
