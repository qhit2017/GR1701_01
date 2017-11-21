package wangshenliang;
/** 
 * @author  作者 王深良E-mail:793708547@QQ.com
 * @date    创建时间：2017年11月21日 下午8:15:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Zy10 {
	public static void main(String[] args) {
		System.out.println("乘法口诀表");
		int a = 1;

		do {
			int b = 1;
			do {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
			} while (b <= a);
			a++;
			System.out.println();
		} while (a <= 9);
	}

}
