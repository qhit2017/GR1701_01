package wangshenliang;

import java.util.Scanner;

/**
 * @author 作者 王深良E-mail:793708547@QQ.com
 * @date 创建时间：2017年11月21日 下午8:24:57
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Int {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		System.out.println("输入1个数");
		int c = a.nextInt();
		System.out.println("输入2个数");
		int d = a.nextInt();

		System.out.println("输入3个数");
		int f = a.nextInt();

		int w;
		int e;
		int r;
		int t;
		int y;
		w = c < d ? c : d;
		e = w < f ? w : f;
		System.out.println(e);
		r = c > d ? c : d;
		t = r > f ? r : f;
		if (c > e && c < t)
			System.out.println(c);
		if (d > e && d < t)
			System.out.println(d);
		if (f > e && f < t)
			System.out.println(f);
		System.out.println(t);

	}

}
