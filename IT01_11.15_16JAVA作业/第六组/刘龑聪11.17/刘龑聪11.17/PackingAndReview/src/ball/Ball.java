package ball;

import java.util.Scanner;

public class Ball {
	public static void main(String[] args) {
		// 一球从h米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？
		Scanner sc = new Scanner(System.in);
		System.out.println("小球从几米高度自由落下？");
		float h = sc.nextFloat();
		System.out.println("你想知道小球第几次落地时的情况？");
		int n = sc.nextInt();

		float H = h;
		for (int i = 1; i < n; i++) {
			H += h;
			h = h / 2;
		}
		System.out.println("小球第" + n + "次落地时，共经过" + H + "米，第" + n + "次反弹" + h
				/ 2 + "米高！");
		sc.close();
	}
}