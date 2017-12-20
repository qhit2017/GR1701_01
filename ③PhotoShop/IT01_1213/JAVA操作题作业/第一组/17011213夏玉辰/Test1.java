package com.qhit;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
		
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] a = new int[4];

		int b = 0;

		for (int k = 0; k < a.length; k++) {

			a[k] = sc.nextInt();
		}

		for (int j = 0; j < a.length - 1; j++) {

			for (int i = 0; i < a.length - 1; i++) {

				if (a[i] > a[i + 1]) {

					b = a[i];

					a[i] = a[i + 1];

					a[i + 1] = b;

				}

			}

		}
		System.out.println(Arrays.toString(a));

		
	}
}
