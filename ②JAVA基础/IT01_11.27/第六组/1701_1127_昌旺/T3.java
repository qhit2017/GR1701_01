package com.zk.qhit01;

import java.util.Arrays;
import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 5; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
