package Com.zk.qhit.statictest;

import java.util.Scanner;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月21日 下午8:10:17
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Wenshu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个五位数判断是不是回文数");
		int a = sc.nextInt();
		if (a / 10000 == a % 10 || a / 1000 % 10 == a % 100) {
			System.out.println("是回文数");
		} else {
			System.out.println("不是回文数");
		}
	}
}
