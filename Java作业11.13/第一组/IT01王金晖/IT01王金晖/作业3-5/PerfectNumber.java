package wangjinhui;

/**
 * 作者邮箱：1239197556@qq.com
 * 
 * 创建时间：2017年11月13日 下午8:39:51
 */
public class Perfectnumber1113 {
	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {

			int tem = 0;

			for (int x = 1; x < i; x++) {

				if (i % x == 0) {

					tem += x;
				}
			}

			if (tem == i) {

				System.out.println(i);

			}
		}
	}

}
