package jtc;

import java.util.Scanner;

/** 
 * @author  作者:jtc
 * @date    创建时间：2017年11月16日 下午7:00:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Shu {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("输入一个数");
	int a = sc.nextInt();
	
	if(a>0){
		System.out.println("输入正数数为："+a);
	}
	else if(a<0) {
		System.out.println("输入的负数为："+a);
	}	
	else{
		System.out.println("既不是整数也不是负数");
	}
		
	}
	
	
}

