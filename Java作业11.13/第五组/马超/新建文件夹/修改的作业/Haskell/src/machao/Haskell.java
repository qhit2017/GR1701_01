package machao;

/**
 * @author 作者 E-mail:996939518@qq.com
 * @date 创建时间：2017年11月14日 下午7:33:46
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Haskell {
	public static void main(String[] args) {
		// 打印九九乘法表
		for (int a = 1; a <= 9; a++) {

			for (int b = 1; b <= a; b++) {

				System.out.print(a + "*" + b + "=" + a * b + "\t");
			}
			System.out.println();
		}
	}
}
