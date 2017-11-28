package com.sxl;

import java.util.Arrays;

//对该数组进行升序排序
public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 6, 4, 3, 1, 7, 2, 5 };
		// 冒泡法
		boolean isSort;
		int temp;
		for (int j = 0; j < a.length - 1; j++) {
			//假设顺序已排好
			isSort = true;
			System.out.println(Arrays.toString(a));
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					isSort = false;//顺序没有排好
				}
			}
			
			
			if (isSort) {
				break;
			}
		}
	}

}
