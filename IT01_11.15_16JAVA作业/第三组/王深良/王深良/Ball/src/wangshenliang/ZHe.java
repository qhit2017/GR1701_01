package wangshenliang;

import java.util.Scanner;

/**
 * @author 作者 王深良E-mail:793708547@QQ.com
 * @date 创建时间：2017年11月17日 下午1:18:12
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class ZHe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个值");
		int a = sc.nextInt();
		if (a > 0)
			System.out.println(a + "是正数");
		if (a < 0)
			System.out.println(a + "是负数");
	}

}
