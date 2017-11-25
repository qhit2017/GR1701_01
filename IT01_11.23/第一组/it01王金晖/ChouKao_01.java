package jtc;

import java.util.Scanner;


public class ChouKao_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		double a = sc.nextDouble();
		System.out.println("请输入第二个数：");
		double b = sc.nextDouble();
		if (a > b) {
			System.out.println("结果为a > b");
		} 
		if (a < b) {
			System.out.println("结果为a < b");
		}else{
			System.out.println("结果为a = b");
		}
	}
}
