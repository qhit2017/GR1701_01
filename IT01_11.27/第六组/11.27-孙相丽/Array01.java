package com.sxl;

import java.util.Scanner;

//1 从键盘接收10个数，并存入数组中，
//然后循环遍历数组中的元素
public class Array {

	public static <Scaner> void main(String[] args) {
		// 从键盘接收10个数，并存入数组中，
		Scanner sc = new Scanner(System.in);
		int[] i = new int[10];
		// 循环遍历数组中的元素
		for (int j = 0; j < i.length; j++) {
			i[j] = sc.nextInt();
			i[j] = j + 1;
			System.out.println("a[" + j + "]=" + i[j]);
   
		}

		sc.close();
	}

}
