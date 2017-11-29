package jtc;

import java.util.Scanner;

/** 
 * @author  作者:jtc
 * @date    创建时间：2017年11月16日 下午5:57:54 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Zhuoye {
	public static void main(String[] args) {
		//一球从h米高度自由落下，每次落地后反跳回原高度的一半；
	    //再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入h的高度");
		double h = sc.nextDouble();
		
		double h1 = h/2;
		int i = 0;
		for (i = 2;i < 10;i++){
			h = h + h1 * 2;
			h1 = h1/2;
		}
		System.out.println(i+"次落地经过"+h+"米");
		System.out.println("第"+i+"次反弹"+h1+"米");	
}
}