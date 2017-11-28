package com.zk.qhit01;

import java.util.Arrays;
import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= new int[10];
		int b=0;
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		b=a[1];
		a[1]=a[5];
		a[5]=b;
		
		b=a[3];
		a[3]=a[7];
		a[7]=b;
		System.out.println(Arrays.toString(a));

	}

}
