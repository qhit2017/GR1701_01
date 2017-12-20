package com.javashiti;

import java.util.Set;

public class T03 {
	static boolean is6End(int a){
		String s = ""+a;
		if (s.charAt(s.length()-1)=='6') {
			return true;
		} else {
			return false;
		}												
	}	                                            						
	public static void main(String[] args) {
		T03 t03 =new T03();	
		int count = 0;
		for (int i = 10000; i < 100000; i++) {
			if (t03.is6End(i) && i%3==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println();
		System.out.println("总共有："+count+"个数");
			
		
		/*						
		//9999-100000
		int count = 0;
		for (int i = 10000; i < 100000; i++) {
			if (i%10==6 && i%3==0) {
				System.out.println(i);
				count++;				
			}																						
		}
		System.out.println();
		System.out.println("总共有："+count+"个数");
		*/
	}
}
