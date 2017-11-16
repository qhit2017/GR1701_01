package whh;

/**
 * @author 作者 E-mail:2421922506@QQ.com
 * @date 创建时间：2017年11月14日 下午6:53:22
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Complete {
	public static void main(String[] args) {
		for (int a = 2; a < 1000; a++) {

			int c = 0;

			for (int b = 1; b < a; b++) {

				if (a % b == 0) {

					c += b;
				}
			}

			if (c == a) {

				System.out.println(a);
			}
		}
	}
}
