package jtc;

import java.util.Scanner;


public class ChouKao_02 {

	public static void main(String[] args) {
		System.out.println("请输入一个三位数：");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("该数的十位数是"+i / 10%10);
	}
}
