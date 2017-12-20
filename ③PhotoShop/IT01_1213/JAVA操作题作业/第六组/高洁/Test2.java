import java.util.Scanner;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年12月12日 上午11:58:01
 */
public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();

		if (s >= 10 && s <= 99) {

			System.out.println(Integer.toString(s, 16));

			System.out.println(Integer.valueOf("f", 16));

		} else {
			System.out.println("超出范围");
		}
	}

}
