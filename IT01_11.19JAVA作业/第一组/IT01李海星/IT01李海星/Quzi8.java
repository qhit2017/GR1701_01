package java.src;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月19日 下午8:25:13
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Quzi8 {
	public static void main(String[] args) {
		int x = 0;
		for (int a = 100; a <= 1000; a++) {
			if (a % 10 == 6 && a % 3 == 0) {
				System.out.println("个位为6且整除3的数有:" + a);
				x++;
			}
		}
		System.out.println("共有" + x + "个");
	}
}
