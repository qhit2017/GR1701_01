package test;
/*作者：刘龑聪
 *E-mail：15539919713@163.com
 */
public class Test10 {
	public static void main(String[] args) {
		System.out.println("乘法口诀表");
		int a = 1;

		do {
			int b = 1;
			do {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
			} while (b <= a);
			a++;
			System.out.println();
		} while (a <= 9);
	}
}