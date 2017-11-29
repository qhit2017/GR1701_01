package com;

import java.util.Scanner;

public class Places {public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("输入一个不大于10000的数");
	int a=sc.nextInt();
	if (a<10) {
		System.out.println("该位是一位数");
	}
	else if (a<100) {
		System.out.println("该位是二位数");
	}
	else if (a<1000) {
		System.out.println("该位是三位数");
	}
	else if (a<10000) {
		System.out.println("该位是四位数");
	}
	else if (a==10000) {
		System.out.println("该位是五位数");
	}
}

}
