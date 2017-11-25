package com.yc;

import java.util.Scanner;

public class Test1 {public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	if(a==b){
		System.out.println("a=b");
	}else if(a>b){
		System.out.println("a>b");
	}else {
		System.out.println("a<b");
	}
}
}


