package haskell;

/**
 * @author 作者 E-mail271406@163.com
 * @date 创建时间：2017年11月9日 下午4:31:12
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Haskell2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();

		}
	}
}
