/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月22日 上午10:25:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package changwang;

public class Test10 {
	public static void main(String[] args) {
		int a = 1;
		while (a <= 9) {
			int b = 1;
			while (b <= a) {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
			}
			System.out.println();
			a++;

		}
	}

}
