package test;

import java.util.Scanner;

/*Author：刘龑聪
 *E-mail：15539919713@163.com
 */
public class Test03 {
	public static void main(String[] args) {

		System.out.print("请输入一个不大于10000的整数：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a <= 10000 && a >= 0) {
			for (int i = 1;; i++) {
				a = a / 10;
				if (a <= 0) {
					System.out.println("该数是一个" + i + "位数！");
					break;
				}
			}
		} else {
			System.out.println("请输入一个正确的数！");
		}
	}
}