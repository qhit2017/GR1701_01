package com.jkl;

import java.util.Scanner;


public class Disiti {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a>b) {
			System.out.println("a>b");
		} else if(a<b){
			System.out.println("a<b");
		} else {
			System.out.println("��������ȷ����");
		}
	}
}
