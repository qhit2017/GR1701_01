package wangshenliang;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  作者 王深良E-mail:793708547@QQ.com
 * @date    创建时间：2017年11月28日 下午7:24:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class For {
	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
		
		int a[] =new int [10];
		for (int i = 0; i < a.length; i++) {
			System.out.print("请输入第"+(i+1)+"个数：");
			a[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(a));
		int b;
		int c;
		for (int i = 0; i < a.length; i++) {
			b=a[1];
			a[1]=a[5];
			a[5]=b;
			c=a[3];
			a[3]=a[7];
			a[7]=c;
			System.out.print(a[i]+"  ");
		}
	}
}
