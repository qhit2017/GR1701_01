package com.gaojie.qhit01;

import java.util.Scanner;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��18�� ����11:29:54
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����������С�������жϴ�С");
		
		float i = sc.nextFloat();
		float g = sc.nextFloat();
		
		if (i < g) {
			System.out.println(i + "<" + g);
		}
		
		if (i == g) {
			System.out.println(i + "=" + g);
		}
		
		if (i > g) {
			System.out.println(i + ">" + g);
		}

	}
}
