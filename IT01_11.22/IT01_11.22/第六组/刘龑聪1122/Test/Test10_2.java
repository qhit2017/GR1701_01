package homework;

/*作者：刘龑聪
 E-mail：15539919713@163.com
 */
public class Test10_2 {
	public static void main(String[] args) {

		System.out.println("九九乘法表：");
		int a = 1;
		while (a <= 9) {
			int b = 1;
			while (b <= a) {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
			}
			a++;
			System.out.println();
		}
	}
}
