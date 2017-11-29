package com.zk.qhit;

import java.util.Scanner;

public class Integer {
	public static void main(String[] args) {
		 Scanner Sc=new Scanner(System.in);
		 System.out.println("请输入第一个整数");
		 int x=Sc.nextInt();
		 System.out.println("请输入第二个整数");
		 int y=Sc.nextInt();
		 System.out.println("请输入第三个整数");
		 
		 int z=Sc.nextInt();
		 
		 int f;
		 
		 if(x>y){
			 f=x;
			 x=y;
			 y=f;
			 }
		 if(x>z){
			 f=x;
			 x=z;
			 z=f;
			 }
		 if(y>z){
			 f=y;
			 y=z;
			 z=f;
			 }
		 if(x>z){
			 f=x;
			 x=z;
			 z=f;
			 }
		 System.out.println("由小到大是:"+x+"<"+y+"<"+z);
	}
}



