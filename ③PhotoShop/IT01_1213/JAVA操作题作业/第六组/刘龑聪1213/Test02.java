package test;

import java.util.Scanner;

/*Author��������
  E-mail��15539919713@163.com
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��10-99������:");
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
			System.out.println("������һ��10-99��������");
		}
		sc.close();
	}
}
