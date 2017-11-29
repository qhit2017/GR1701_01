package com.zk.qhit01;

import java.util.Arrays;
import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 0;
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int j = 0; j < a.length - 1; j++) {

			for (int i = 0; i < a.length - 1; i++) {

				if (a[i] < a[i + 1]) {
					b = a[i];
					a[i] = a[i + 1];
					a[i + 1] = b;
				}

			}
		}
		System.err.println(Arrays.toString(a));

	}

}
