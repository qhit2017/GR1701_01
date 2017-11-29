package java.src;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月19日 下午8:22:52
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Quzi6 {

	public static void main(String[] args) {
		int b = 0;
		for (int a = 1; a <= 10; a++) {
			b = b + a;
			if (b > 20) {
				System.out.println("该数为:" + b);
				break;
			}
		}
	}
}
