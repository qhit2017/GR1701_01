package Quzi;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月20日 下午8:22:31
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Quzi9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个10000内的整数");
		int a = sc.nextInt();
		for (int b = 1; b <= a; b++) {
			if (b % 7 == 0 || b % 1000 == 7 || b % 100 == 7 || b % 10 == 7) {
				System.out.println(b);
			}
		}
	}

}
