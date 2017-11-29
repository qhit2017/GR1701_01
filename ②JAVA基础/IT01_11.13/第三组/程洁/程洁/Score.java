package score;

import java.util.Scanner;

/**
 * @author 作者 E——mai l:程洁2564963490@QQ.com
 * @date 创建时间: 2017年11月13日 下午7:56:53
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if (score >= 90) {
			System.out.println("A");
		}
		if ((score >= 60) && (score <= 89)) {
			System.out.println("B");
		}
		if (score < 60) {
			System.out.println("C");
		}

	}
}
