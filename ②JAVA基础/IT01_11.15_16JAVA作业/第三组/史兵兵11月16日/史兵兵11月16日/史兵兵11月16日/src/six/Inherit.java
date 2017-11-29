package six;

import java.util.Scanner;

/**
 * @author 作者 E-mail:738348954@qq.com
 * @date 创建时间：2017年11月16日 下午7:08:06
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Inherit {
	public static void main(String[] args) {
		/**
		 * 编写java程序，通过控制台输入两个小数，判断两个小数 大小，
		 * 并输出结果
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个小数");
		float a = input.nextInt();
		System.out.println("请输入第二个小数");
		float b = input.nextInt();
		if (a > b) {
			System.out.println(a);

		} else {
			System.out.println(b);
		}
	}

}
