package num;

import java.util.Scanner;

public class Num2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数k:");
		float k = sc.nextFloat();
		System.out.println("请输入第二个数l:");
		float l = sc.nextFloat();

		System.out.print("你输入的两个数:");
		System.out.println((k > l) ? "k>l" : (k == l) ? "k=l" : "k<l");

		sc.close();
	}
}