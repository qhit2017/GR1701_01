package com.ztt;
/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��12��13�� ����8:02:30 
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
		
		System.out.println("һ��������"+b+"��");

	}

}
