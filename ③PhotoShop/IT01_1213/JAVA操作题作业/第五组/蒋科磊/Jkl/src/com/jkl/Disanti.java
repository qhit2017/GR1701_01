package com.jkl;

import java.util.Scanner;


public class Disanti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����");
		int a=sc.nextInt();
		if (a>0) {
			System.out.println("����������");
		} else if(a<0){
			System.out.println("�����Ǹ���");
		} else {
			System.out.println("��������ȷ����");
		}
	}
}
