package test;

import java.util.Scanner;

/*Author：刘龑聪
  E-mail：15539919713@163.com
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		for (int i = 0; i < a.length; i++) {
			System.out.print("请输入第"+(i+1)+"个整数:");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i < a.length-1) {
				System.out.print("<");
			}
		}
		sc.close();
	}
}
