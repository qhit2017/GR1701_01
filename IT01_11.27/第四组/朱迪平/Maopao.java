import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 作者 E-mail:271406@163.com
 * @date 创建时间：2017年11月27日 下午6:58:33
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Maopao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];
		int temp;
		for (int l = 0; l < a.length; l++) {
			System.out.println("输入");
			a[l] = sc.nextInt();
		}
		for (int j = 0; j < a.length-1; j++) {
			for (int i = 0; i < args.length - 1; i++) {

				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					
				}
			}
		}System.out.println(Arrays.toString(a));
	}
}
