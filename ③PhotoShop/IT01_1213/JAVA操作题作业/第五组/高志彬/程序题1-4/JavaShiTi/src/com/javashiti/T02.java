package com.javashiti;

import java.util.Iterator;
import java.util.Scanner;

public class T02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��ʮ��������");
		int s = sc.nextInt();
		if (s <= 99 && s >= 10) {
			String a = Integer.toString(s, 16);
			System.out.println("ת��Ϊ16����Ϊ��" + a);
		} else {
			System.out.println("����������ֲ��ڷ�Χ�ڣ�" 
							+ "����10~99֮��ѡȡ���֡�");
		}

	}

}
