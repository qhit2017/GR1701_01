package liuyancong;
/*Author：刘龑聪
 *E-mail：15539919713@163.com
 */
public class MaxMin {
	public static void main(String[] args) {
		int[] a = {5,9,12,45,18,30};
		
		int sum = 0;
		int max = a[0];
		int min = a[0];
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if (a[i]>max) {
				max = a[i];
			}
			if (a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("数组中所有元素之和为："+sum);
		System.out.println("数组元素中最大值为"+max);
		System.out.println("数组元素中最小值为"+min);
	}
}
