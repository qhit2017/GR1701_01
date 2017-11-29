package machao;

/**
 * @author 作者 E-mail:996939518@qq.com
 * @date 创建时间：2017年11月19日 下午8:29:35
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Diliuti {
	public static void main(String[] args) {
		// 编写JAVA程序，1至10之间的整数相加，得到
		// 累加值大于20的当前数字，将该数字输出。
		int sum = 0;
		for (int p = 1; p <= 10; p++) {
			sum += p;
			if (sum > 20) {
				System.out.println(sum);
				break;
			}
		}
	}

}
