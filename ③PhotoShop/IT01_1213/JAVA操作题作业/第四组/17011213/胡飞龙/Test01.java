package hufeilong;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个小数");
		double h=sc.nextDouble();
		System.out.println("请输入第二个小数");
		double j=sc.nextDouble();
		if (h==j) {
			System.out.println("两个小数相等");
		}else {
			System.out.println("两个小数不相等");
		}
		sc.close();
	}
}
