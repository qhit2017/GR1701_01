package jtc;

import java.util.Scanner;

public class Shu {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("输入一个数");
	int a = sc.nextInt();
	
	if(a>0){
		System.out.println("输入正数数为："+a);
	}
	else if(a<0) {
		System.out.println("输入的负数为："+a);
	}	
	else{
		System.out.println("既不是整数也不是负数");
	}
		
	}
	
	
}

