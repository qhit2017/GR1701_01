package liuyancong;

import java.util.Arrays;
import java.util.Scanner;

/*Author：刘龑聪
 *E-mail：15539919713@163.com
 */
public class ArrayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.print("请输入第"+(i+1)+"个数：");
			a[i] = sc.nextInt();
		}
		System.out.println("交换前"+Arrays.toString(a));
		int temp;
		
		temp = a[5];
		a[5] = a[1];
		a[1] = temp;
		
		temp = a[7];
		a[7] = a[3];
		a[3] = temp;
		System.out.println("交换后"+Arrays.toString(a));
	}
}
