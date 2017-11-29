package zhangtongtong;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		
		// 输入一个数，判断正负并输出结果
		
		System.out.println("请输入一个数：");
		
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();

		if (a > 0) {
			
			System.out.println("该数为正数");
			
		} else if (a == 0) {
			
			System.out.println("该数为0");
			
		} else {
			
			System.out.println("该数为负数");
		}

	}
}
