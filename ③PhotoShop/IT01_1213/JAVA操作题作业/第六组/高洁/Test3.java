import java.util.Scanner;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年12月12日 下午1:07:54
 */
public class Test3 {
	public static void main(String[] args) {
		int q = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入为几位数");
		int n = sc.nextInt();

		for (int j = 1;; j++) {
			int a = j;
			int b = 0;

			for (int i = 0;; i++) {

				if (a == 0) {
					break;
				} else {
					a = a / 10;
					b = b + 1;
				}

			}

			if (b == n) {
				if (j % 10 == 6 && j % 3 == 0) {
					q = q + 1;
					System.out.println(j);

				}
			}
			if (b > n) {
				System.out.println(q);
				break;
			}
		}
	}

}
