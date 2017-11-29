package com.zk.qhit;

import java.util.Scanner;

public class Estimate {
	public static void main(String[] args) {
		 Scanner Sc=new Scanner(System.in);
		 System.out.println("请输入第一个五位数");
		 int a=Sc.nextInt();
		 if(a/10000==a%10&&a%10000/1000==a%10000/1000&&a>=10000&&a<=99999){
			 System.out.println("这个数是回文数");
		 }else{
			 System.out.println("这个数不是回文数"); 
		 }
	}

}

