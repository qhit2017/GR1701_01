package java.src;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月19日 下午8:21:16
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Quzi5 {
	public static void main(String[] args) {
		int a = 1;
		do {
			if (a % 5 == 0 || a % 3 == 0) {
				System.out.println("能被3和5整除的有:" + a);
			}
			a++;
		} while (a <= 1000);

	}
}
