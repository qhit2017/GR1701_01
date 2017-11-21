package maqchao;

/**
 * @author 作者 E-mail:996939518@qq.com
 * @date 创建时间：2017年11月19日 下午8:19:11
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Babei {
	public static void main(String[] args) {
		// 编写JAVA程序，求1000以内所有8的倍数之和。
		int sum = 0;
		for (int N = 1; N <= 1000; N++) {
			if (N % 8 == 0) {
				sum += N;
			}
		}
		System.out.println(sum);
	}

}
