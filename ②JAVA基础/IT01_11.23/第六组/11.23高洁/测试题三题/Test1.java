package com.gj.qhit;

import java.util.Scanner;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月24日 上午7:31:07
 */
public class Test1 {public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("请输入两个小数");
	
	Double i = sc.nextDouble();
	Double g = sc.nextDouble();
	
	if (i==g) {
		
		System.out.println(i+"="+g);

	} else {
		System.out.println(i+"!="+g);
	}

	sc.close();

}
}


