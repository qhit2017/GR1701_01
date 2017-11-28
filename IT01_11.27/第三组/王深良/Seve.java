package wangshenliang;

import java.util.Scanner;

/** 
 * @author  作者 王深良E-mail:793708547@QQ.com
 * @date    创建时间：2017年11月28日 下午7:21:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Seve {
	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
		
		int a[] =new int [10];
		for (int i = 0; i < a.length; i++) {
			System.out.print("请输入第"+(i+1)+"个数:");
			a[i]=sc.nextInt();
			
		
	}
		for (int i = 5; i < a.length; i++) {
			System.out.print(a[i]+ "   ");
			
		}
	}
}
