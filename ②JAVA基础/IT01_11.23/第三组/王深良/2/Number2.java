/**
 * @author 作者 王深良E-mail:793708547@QQ.com
 * @date 创建时间：2017年11月24日 下午1:16:09
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Number2 {
	public static void main(String[] args) {
		int i = 1;
		int a = 0;
		while (i < 101) {
			if (i % 2 == 0)
				continue;
			else {
				a += i;

			}
		}System.out.println(a);
	}
}
