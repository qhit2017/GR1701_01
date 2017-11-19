package num;

import java.util.Scanner;

public class Num1 {
	public static void main(String[] args) {
		
		System.out.print("请输入一个数:");
		Scanner sc = new Scanner(System.in);
		float k = sc.nextFloat();
		
		if (k > 0) {
			System.out.println("输入的数是正数!");
		} else if (k == 0) {
			System.out.println("输入的数是零!");
		} else {
			System.out.println("输入的数是负数!");
		}
		sc.close();
	}
}