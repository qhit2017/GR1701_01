package com.ztt;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2017年11月27日 下午7:19:47
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Circulation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();

		}

		System.out.println(Arrays.toString(a));

	}
}
