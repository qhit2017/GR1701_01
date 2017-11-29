package liuyancong;

import java.util.Arrays;
import java.util.Scanner;

/*Author：刘龑聪
 *E-mail：15539919713@163.com
 */
public interface BubbleSortScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("请输入第"+(i+1)+"个数：");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]<a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("排序后："+Arrays.toString(a));
		sc.close();
	}
}
