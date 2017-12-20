/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月13日 下午7:07:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package cc;

import java.util.Scanner;

public class Direti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个10~99之间的数");
		int a = sc.nextInt();
		String b=Integer.toString(a,16);
		System.out.println(b);

	}

}
