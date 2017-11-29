package zhudiping;

/**
 * @author 作者 E-mail:271406@163.com
 * @date 创建时间：2017年11月8日 下午8:32:10
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Haskell1 {
	public static void main(String[] args) {
		int a = 1;
		while (a <= 9) {
			int b = 1;
			while (b <= a) {
				System.out.print(a + "*" + b+ "=" + a * b + "\t");
				b++;
			}
			System.out.println();
			a++;
		}

	}

}
