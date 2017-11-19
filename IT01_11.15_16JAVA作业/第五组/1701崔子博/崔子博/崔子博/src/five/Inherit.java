package five;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:738348954@qq.com
 * @date    创建时间：2017年11月16日 下午6:59:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Inherit {
	public static void main(String[] args) {
		/**编写Java程序，通过控制台输入一个数字，判断该数字是
		 * 正数还是负数，并输出结果。
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数字");
		int a=input.nextInt();
		if(a>0){
			System.out.println("该数字是正数");
		}else if(a<0){
			System.out.println("该数字是负数");
		}
	}

}
