package com.ztt;
/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年12月13日 下午8:02:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test04 {

	public static void main(String[] args) {
		
		float a = 100;
		
		float b = 1;
		
		for (int i = 0; i < 10; i++) {
			
			a = a/2;
			
			if (i == 10) {
				
				b += a;
				
			}else {
				
				b += 2*a;
				
			}
			
		}
		
		System.out.println("一共经历了"+b+"米");

	}

}
