package whh;

/**
 * @author 作者 E-mail:2421922506@QQ.com
 * @date 创建时间：2017年11月24日 下午5:51:18
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Summation {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);

		int a = 1;
		int s = 0;
		while (a <= 100) {
			if (a % 2 != 0) {
				s += a;
			}

			a++;
		}
		System.out.println(s);
	}

}
