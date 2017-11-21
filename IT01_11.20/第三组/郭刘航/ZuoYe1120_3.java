package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月20日 下午10:07:40 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ZuoYe1120_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个整数");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = 0;
		
		if(a>b){
			a=x;
			a=b;
			b=x;
		}if(a>c){
			a=x;
			a=c;
			c=x;
		}if(b>c){
			b=x;
			b=c;
			c=x;
		}
		System.out.println(a+" "+b+" "+c);
	}
}
