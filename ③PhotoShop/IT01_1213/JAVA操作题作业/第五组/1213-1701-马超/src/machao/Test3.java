package machao;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		//编写JAVA程序，通过键盘输入，判断两个数的大小。
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数a:");
		float a = sc.nextFloat();
		System.out.println("请输入第二个数b:");
		float b = sc.nextFloat();

		System.out.print("你输入的两个数:");
		System.out.println((a > b) ? "a>b" : (a == b) ? "a=b" : "a<b");

		sc.close();
	}
}
