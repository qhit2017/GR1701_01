package com.zk.qhit.Java￥;

import java.util.Scanner;


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
