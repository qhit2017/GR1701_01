package machao;

import java.util.Arrays;
import java.util.Scanner;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月28日 下午7:34:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test04 {

	public static void main(String[] args) {
		//从键盘输入10个数,将第二个与第六个交换,第四个和第8个交换,
		//输出原来的10个数,以及交换后的10个数.
		Scanner sc=new Scanner(System.in);
		int[]a=new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("输入"+(i+1)+"个数");
			a[i]=sc.nextInt();
		}System.out.println(Arrays.toString(a));
		int L=0;
		int W=0;
		for (int i = 0; i < a.length; i++) {
			if (i==1) {
				L=a[1];
				a[1]=a[5];
				a[5]=W;
			}if (i==3) {
				W=a[3];
				a[3]=a[7];
				a[7]=L;
			}
		}System.out.println(Arrays.toString(a));
	}

		
	}

