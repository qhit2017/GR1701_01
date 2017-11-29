package wangshenliang;

import java.util.Scanner;

/**
 * @author 作者 王深良E-mail:793708547@QQ.com
 * @date 创建时间：2017年11月16日 下午1:54:45
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int q;
		int w;
		int e;
		int f;
		int r;
		int g;
		int z;
		int n;
		int x;

		q = a > b ? a : b;
		w = c > d ? c : d;
		e = q > w ? q : w;
		System.out.println(e);
		f = q < w ? q : w;
		r = c < d ? c : d;
		z = a < b ? a : b;
		g = f > r ? f : r;
		g = f > z ? f : z;
		System.out.println(g);

		n = r < z ? r : z;
		x = f > n ? f : n;
		x = r > n ? r : n;
		System.out.println(x);
		System.out.println(n);

	}

}
