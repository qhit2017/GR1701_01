package machao;

/**
 * @author 作者 E-mail:996939518@qq.com
 * @date 创建时间：2017年11月19日 下午8:33:31
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Diqiti {
	public static void main(String[] args) {
		// 编写JAVA程序，从1，2，3，4，5，这五个数任意
		// 取出两个数，列出他们的所有组合并且输出到屏幕上。
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {
				System.out.print(a);
				System.out.print(b);
				System.out.println();
			}
		}
	}

}
