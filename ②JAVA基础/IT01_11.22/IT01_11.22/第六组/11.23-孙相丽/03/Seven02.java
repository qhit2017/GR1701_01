package com.sxl;

import java.util.Scanner;

public class Seven02 {
	public static void main(String[] args) {
		/**
		 * 键盘输入N(N<=10000),输出所有7的倍数和包含7的数字
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个不大于10000的数！");
		long l = sc.nextLong();
		if(l>10000){
			System.out.println("数字不能大于10000");
		}else{
			for(int i = 1;i<l;i++){
				if(i%7==0||i%10==7||i/10%10==7||i/100%10==7||
						i/1000==7){
					System.out.println(i);
				}
			}
		}
		
		sc.close();
	}
}
