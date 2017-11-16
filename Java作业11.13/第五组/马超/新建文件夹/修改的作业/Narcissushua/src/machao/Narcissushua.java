package machao;

/**
 * @author 作者 E-mail:996939518@qq.com
 * @date 创建时间：2017年11月14日 下午7:18:34
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Narcissushua {
	public static void main(String[] args) {
		// 打印出100到1000的所有的"水仙花数" 。
		// (所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身
		// 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。)

		System.out.println("第一题\n打印出100到1000的所有的水仙花数");
		int hundred = 0;
		int tens = 0;
		int untis = 0;
		for (int i = 100; i <= 1000; i++) {
			hundred = i / 100;
			tens = i / 10 % 10;
			untis = i % 10;
			if (i == (hundred * hundred * hundred + tens * tens * tens + untis
					* untis * untis)) {
				System.out.println("水仙花数的个数:" + i);
			}
		}
	}
}