package machao;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//编写JAVA程序，通过控制台输入两个小数，
		//判断两个小数是否相等，并输出判断结果。
		System.out.println("请输入两个小数");
		Scanner sc=new Scanner(System.in);
		double w = sc.nextDouble();
		double s = sc.nextDouble();
		
		System.out.println((w==s)?"两数相等":"两数不相等");
	}
}
