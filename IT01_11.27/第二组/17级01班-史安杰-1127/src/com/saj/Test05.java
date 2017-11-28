package com.saj;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第"+(i+1)+"个数");
			a[i]=sc.nextInt();
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
			
		}
		int i=a[1];
		a[1]=a[5];
		a[5]=i;
		
		int n=a[3];
		a[3]=a[7];
		a[7]=n;
		
	System.out.println();
	for (int e = 0; e < a.length; e++) {
		System.out.print(a[e]+" ");
		
	}

	}

}
