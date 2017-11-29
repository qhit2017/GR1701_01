package com;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:271406@163.com
 * @date    创建时间：2017年11月20日 下午8:35:47 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Palindrome {public static void main(String[] args) {
//一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
  Scanner sc=new Scanner(System.in);	
    System.out.println("输入一个五位数");	
   int i=sc.nextInt();
   if(i<10000||i>99999){
	   System.out.println("输入错误，请重新输入");
   }else if(i/10000==i%10&&i/1000%10==i/10%10){
	   System.out.println("输出回文数");
   }else{
	   System.out.println("输出不是回文数");
   }


	
}

	
	
	
	
}


