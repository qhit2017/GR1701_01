package liuyancong;
/*×÷Õß£ºÁõıŒ´Ï
  E-mail£º15539919713@163.com
 */
public class DigitalCombiantion {
	public static void main(String[] args) {
		int i = 0;
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {
				i++;
				System.out.print(a);
				System.out.print(b);
				System.out.print("\t");
				if (i % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
}