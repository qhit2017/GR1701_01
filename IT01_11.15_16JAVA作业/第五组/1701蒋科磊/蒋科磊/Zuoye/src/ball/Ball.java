package ball;

import java.util.Scanner;

public class Ball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入h为多少");
		double h = sc.nextInt();
		double hs = h / 2;
		int i = 0;
		System.out.println("请输入n为多少");
		int n = sc.nextInt();
		for (i = 2; i < n; i++) {
			h = h + hs * 2;
			hs = hs / 2;

		}
		System.out.println("第" + i + "次落地经过" + h + "米");
		System.out.println("第" + i + "次反弹" + hs + "米");

	}

}
