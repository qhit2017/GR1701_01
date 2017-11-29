package machao;

/**
 * @author 作者 E-mail:996939518@qq.com
 * @date 创建时间：2017年11月28日 下午7:06:05
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test01 {

	public static void main(String[] args) {
		// 定义一个整形数组{5,9,12,45,18,30},要求打印出数组中
		// 所有元素之和并打印出最大值和最小值.

		int[] a = { 5, 9, 12, 45, 18, 30 };

		int sum = 0;
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if (a[i] > max) {
				max = a[i];

			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);
	}
}