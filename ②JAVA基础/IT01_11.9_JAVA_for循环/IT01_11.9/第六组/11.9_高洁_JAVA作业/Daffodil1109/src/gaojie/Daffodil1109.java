package gaojie;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月8日 下午4:43:17
 */
public class Daffodil1109 {
	public static void main(String[] args) {
		for (int a = 100; a <= 1000; a++) {

			int b = a / 100;
			int c = a / 10 % 10;
			int d = a % 10;
			int e = (b * b * b) + (c * c * c) + (d * d * d);
			
			if (a == 1000) {
				break;
			}
			if (a == e) {
				System.out.println("水仙花的值为：" + a);
			}

		}

	}
}
