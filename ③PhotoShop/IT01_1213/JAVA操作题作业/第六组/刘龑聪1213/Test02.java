package test;

import java.util.Scanner;

/*Author：刘龑聪
  E-mail：15539919713@163.com
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个10-99的整数:");
		int a = sc.nextInt();
		if ((a>=10)&&(a<=99)) {
			String s = "";
			s += a/16;
			if (a%16<=9) {
				s += a%16;
			} else {
				s += (char)(a%16+55);
			}
			System.out.println(s);
		}else {
			System.out.println("请输入一个10-99的整数！");
		}
		sc.close();
	}
}
