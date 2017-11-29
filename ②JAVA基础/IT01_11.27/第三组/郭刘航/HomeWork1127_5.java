package GLH;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class HomeWork1127_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //从键盘输入10个数，将第2个与第6个交换，第4个与第8个交换，输出原来的10个数，以及交换后的10个数
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];

		int b = 0;
		int c = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数\t ");
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (i == 1) {
				b = a[1];
				a[1] = a[5];
				a[5] = b;

			}
			if (i == 3) {
				c = a[3];
				a[3] = a[7];
				a[7] = c;
			}

		}
		System.out.println(Arrays.toString(a));

		sc.close();
	}

	}


