package com.qhit;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������10~99֮���һ��ʮ��������");
		int a = sc.nextInt();
		String str4 = Integer.toString(a, 16);
		System.out.println(str4);
	}
}
