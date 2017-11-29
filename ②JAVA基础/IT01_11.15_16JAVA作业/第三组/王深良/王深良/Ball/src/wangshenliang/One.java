package wangshenliang;

import java.util.Scanner;

/**
 * @author 作者 王深良E-mail:793708547@QQ.com
 * @date 创建时间：2017年11月16日 下午7:23:13
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class One {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个值");
		float a = sc.nextFloat();
		System.out.println("请输入第二个值");
		float b = sc.nextFloat();
		if (a > b)
			System.out.println(a + ">" + b);
		if (a < b)
			System.out.println(a + "<" + b);
	}

}
