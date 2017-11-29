package machao;

/**
 * @author 作者 E-mail:996939518@qq.com
 * @date 创建时间：2017年11月19日 下午8:24:31
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Dowhilexunhuan {
	public static void main(String[] args) {
		// 编写JAVA程序，求1000以内，既能被5整除，又能被
		// 3整除的所有的整数，并打印出来。(使用do while循环实现）。
		int i = 1;
		do {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 1000);
	}

}
