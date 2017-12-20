package hufeilong;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n=sc.nextInt();
		if(n>10000){
			System.out.println("您输入的数大了，请重输");
		}else if(n<10){
			System.out.println("您输入的数是一位数");
		}else if(n<100){
			System.out.println("您输入的数是两位数");
		}else if(n<1000){
			System.out.println("您输入的数是三位数");
		}else if(n<10000){
			System.out.println("您输入的数是四位数");
			sc.close();
		}
		
	}
}
