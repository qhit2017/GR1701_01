package HEL;

import java.util.Arrays;
import java.util.Scanner;


public class HomeWork1127_3 {

	public static void main(String[] args) {
		//从键盘输入10个数，输出后5个数
		Scanner sc = new Scanner(System.in);
		int []a = new int [10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数 ");
			a[i] = sc.nextInt();
		}
		for (int i = (a.length - 5); i < a.length; i++) {
			System.out.println("第" + i + "个数为：" + a[i]);

		}
		sc.close();
	}
}


