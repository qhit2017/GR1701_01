package com.zk.qhit;
/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class Ball {
	public static void main(String[] args) {
		
	
	  /**5  一球从100米高度自由落下，每次落地后反跳回原高度的一半；
       *再落下，求它在 第10次落地时，共经过多少米？第n次反弹多高？
       */
		
    int h = 100;
	float h1=h/2;
	int n = 0;
	for(n = 2;n<= 10;n++){
		h += h1/2;
		h1 = h1/2;
	}
	System.out.println("第"+n+"次落地经过"+h+"米");
	System.out.println("第"+n+"次反弹"+h+"米");
	
	}
}      
