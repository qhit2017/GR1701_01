package gaojie;

import java.util.Scanner;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月13日 下午4:40:07
 */
public class Grade1113 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int i = input.nextInt();

		if (i >= 90) {
			System.out.println("A");
		}
		
		if (i >= 60 && i <= 89) {
			System.out.println("B");
		}
		
		if (i < 60 && i >= 0) {
			System.out.println("C");
		}
		

	}

}
