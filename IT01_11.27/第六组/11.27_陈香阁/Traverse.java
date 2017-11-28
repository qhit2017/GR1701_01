package com.ArrayTest;

import java.util.Arrays;
import java.util.Scanner;

public class Traverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入十个数");
			a[i] = sc.nextInt();
			sum += a[i];
		}
		System.out.println(Arrays.toString(a));
	}
}
