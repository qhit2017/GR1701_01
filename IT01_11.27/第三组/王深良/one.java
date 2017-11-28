package wangshenliang;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  作者 王深良E-mail:793708547@QQ.com
 * @date    创建时间：2017年11月28日 下午7:02:59 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class one {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a[] =new int [10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第"+(i+1)+"个数");
			a[i]=sc.nextInt();
			
			
		}
		System.out.println(Arrays.toString(a));
	}

}
