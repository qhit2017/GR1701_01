package test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		System.out.println("请输入两个小数：");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.println((a==b)?"两数相等":"两数不相等");
	}
}
