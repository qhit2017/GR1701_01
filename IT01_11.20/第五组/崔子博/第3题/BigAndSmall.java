package com.zk.qhit.statictest;

import java.util.Scanner;

public class BigAndSmall {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入X的值");
		double x = sc.nextDouble();
		System.out.println("请输入Y的值");
		double y = sc.nextDouble();
		System.out.println("请输入Z的值");
		double z = sc.nextDouble();
		double max=0;
		if(x>=y){
			max=x;
		}else{
			max=y;y=x;
		}
		if(max<=z){
			System.out.println(z+">"+max+">"+y);
		}else{
			if(z>=y){
				System.out.println(max+">"+z+">"+"y");
			}else{
				System.out.println(max+">"+y+">"+"z");
			}
		}
	
	}
	}


