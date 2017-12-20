package machao;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
       //编写JAVA程序，通过键盘输入，判断一个数是正数还是负数。
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		System.out.print("请输入一个数:");
		
		if (a > 0) {
			System.out.println("输入的数是正数!");
		} else if (a == 0) {
			System.out.println("输入的数是零!");
		} else {
			System.out.println("输入的数是负数!");
		}
		sc.close();
	}

	}

