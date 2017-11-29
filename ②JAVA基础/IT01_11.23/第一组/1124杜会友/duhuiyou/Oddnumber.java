package com.duhuiyou;

public class Oddnumber {
// 用for 和 while两种方法计算1~100之间奇数的和
	
	public static void main(String[] args) {
		System.out.println("for循环");
		int a=0;
		for (int i = 1; i <=100; i++) {			
			if(i%2!=0){
				a+=i;
				}
				
			}	System.out.println("所有奇数和=");
			System.out.println(a);
		}      
	}
	

