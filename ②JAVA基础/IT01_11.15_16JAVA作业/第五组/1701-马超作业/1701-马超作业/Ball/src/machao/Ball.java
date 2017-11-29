package machao;

import java.util.Scanner;

/**
 * @author 作者 E-mail:996939518@qq.com
 * @date 创建时间：2017年11月16日 下午7:15:23
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Ball {
	public static void main(String[] args) {
		// 一球从h米高度自由落下，每次落地后反跳回原高度的一半,
		// 再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入H为多少");
		double H = sc.nextInt();
		double hn = H / 2;

		int a = 0;
		System.out.println("请输入N为多少");
		int N = sc.nextInt();
		for (a = 1; a < N; a++) {
			H = H + hn * 2;
			hn = hn / 2;
		}
		System.out.println("第" + a + "次落地经过" + H + "米");
		System.out.println("第" + a + "次反弹" + hn + "米");
	}

}
