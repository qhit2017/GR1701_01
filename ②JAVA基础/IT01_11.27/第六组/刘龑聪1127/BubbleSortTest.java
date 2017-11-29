package liuyancong;

import java.util.Arrays;
/*Author£ºÁõýŒ´Ï
 *E-mail£º15539919713@163.com
 */
public class BubbleSortTest {
	public static void main(String[] args) {
		
	int[] a = {45,56,62,21,35};
	
	for (int i = 0; i < a.length-1; i++) {
		for (int j = 0; j < a.length-1; j++) {
			if (a[j]<a[j+1]) {
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
	}
	System.out.println("ÅÅÐòºó£º"+Arrays.toString(a));
	}
}
