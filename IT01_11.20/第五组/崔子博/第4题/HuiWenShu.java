package com.zk.qhit.statictest;

import java.util.Scanner;

public class HuiWenShu {
	public static void main(String[] args) {
		
		//一个5位数，判断它是不是回文数。
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个五位数：");		
		int i = sc.nextInt();

		 if(i/10000==i%10&&i/1000%10==i/10%10){
			System.out.println("回文数");
		}
		else{
			System.out.println("不是");
		}
		
				
		
	}

}
