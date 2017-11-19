package gaojie;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月13日 下午5:00:52
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
