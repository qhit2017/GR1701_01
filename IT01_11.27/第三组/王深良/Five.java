package wangshenliang;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  作者 王深良E-mail:793708547@QQ.com
 * @date    创建时间：2017年11月28日 下午7:29:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Five {
	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
		
		int a[] =new int [10];
		for (int i = 0; i < a.length; i++) {
			System.out.print("请输入第"+(i+1)+"个数:");
			a[i]=sc.nextInt();
			
	}
		for (int i = 0; i < a.length-1; i++) {
			int b;
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]<a[j+1]) {
					b=a[j];
					a[j]=a[j+1];
					a[j+1]=b;
					
				}
				
			}
			
		}
		System.out.println(Arrays.toString(a));
	}
}
