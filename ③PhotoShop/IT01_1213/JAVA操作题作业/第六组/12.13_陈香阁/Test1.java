package com.gaojie.qhit01;

import java.util.Scanner;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��18�� ����11:03:50
 */
public class Test1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����ж�����\n");
		int i = sc.nextInt();
		
		if (i > 0) {
			System.out.println(i + "Ϊ����");
		}
		if (i == 0) {
			System.out.println(i + "�Ȳ�������Ҳ���Ǹ���");
		}
		if (i < 0) {
			System.out.println(i + "Ϊ����");
		}

	}

}
