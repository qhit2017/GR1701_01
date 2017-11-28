package com.gzz.arrays;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月27日 下午7:26:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Array03 {
	public static void main(String[] args) {
		//3 从键盘输入10个数，输出后5个数
		/*int []a={5,4,68,2,46,48,62,48,244,42};
		System.out.println("输出后五个数为：");
		
		for (int i = 5; i < a.length/2; i++) {
			System.out.println("a["+(i+1)+"]=" +a[i]);
		}
		*/
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];						
		for (int i = 0; i < a.length; i++) {			
			System.out.println("请输入第" + (i + 1) + "个数:");			
			a[i] = sc.nextInt();						
		}
		// 遍历		
		System.out.println(Arrays.toString(a));			
		System.out.println("后五个数是：");	
		for (int i = 5; i<10; i++) {		
			
			System.out.println("a[" + i + "]=" + a[i]);
			
		}	
	}

}
