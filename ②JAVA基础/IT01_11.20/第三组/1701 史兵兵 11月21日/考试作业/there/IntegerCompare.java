package com.zk.qhit.T3;

import java.util.Scanner;

public class IntegerCompare {
	public static void main(String[] args) {

		//3、输入三个整数x,y,z，请把这三个数由小到大输出。
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入x：");
		int x = sc.nextInt();
		System.out.println("请输入y：");
		int y = sc.nextInt();
		System.out.println("请输入z：");
		int z = sc.nextInt();
		
		int r;
		
		if(x>y){
			r=x;
			x=y;
			y=r;
		}
		if(x>z){
			r=x;
			x=z;
			z=r;
		}
		if(y>z){
			r=y;
			y=z;
			z=r;
		}
		System.out.println("从小到大的顺序为："+x+"<"+y+"<"+z);
		
		
		
		
		
		
		
		
		
	}

}
