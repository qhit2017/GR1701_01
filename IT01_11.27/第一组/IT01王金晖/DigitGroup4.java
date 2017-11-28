package com.wjh;

import java.util.Arrays;
import java.util.Scanner;

public class DigitGroup4 {

	//从键盘输入10个数，并从大到小排序
	public static void main(String[] args) {
		int[] a= new int[10];
		//接受
		for (int i = 0; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入第"+(i+1)+"个数");
			a[i] =sc.nextInt();
			
		}System.out.print("您输入的数字是：");
		System.out.println(Arrays.toString(a));
		//排序
		for (int j = 0; j< a.length-1; j++) {
		    for (int k = 0; k < a.length-1; k++) {
				int l;
				if (a[k]<a[k+1]) {
					l=a[k];
					a[k]=a[k+1];
					a[k+1]=l;
				}
		    	
			}	
		}System.out.print("排序后：");
		System.out.println(Arrays.toString(a));
		
	}
}
