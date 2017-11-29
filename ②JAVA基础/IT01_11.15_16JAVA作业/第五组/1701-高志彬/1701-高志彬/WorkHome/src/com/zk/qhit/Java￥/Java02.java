package com.zk.qhit.Java￥;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月16日 下午7:35:31 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Java02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入第一个数字：");	
		
		float i =sc.nextInt();
		
		System.out.println("请输入第二个数字：");	
		
		float j =sc.nextInt();
		
		if(i>j){
			System.out.println(i+">"+j);
		}else if(i<j){
			System.out.println(i+"<"+j);
		}else{
			System.out.println(i+"="+j);
		}
		
		
	}

}
