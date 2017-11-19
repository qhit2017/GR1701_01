package num;

import java.util.Scanner;

/*作者：刘龑聪
 *E-mail：15539919713@163.com
 */
public class Num2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数a:");
		float a = sc.nextFloat();
		System.out.println("请输入第二个数b:");
		float b = sc.nextFloat();

		System.out.print("你输入的两个数:");
		System.out.println((a > b) ? "a>b" : (a == b) ? "a=b" : "a<b");

		sc.close();
	}
}