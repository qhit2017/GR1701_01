package guo;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ChouKao_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		double a = sc.nextDouble();
		System.out.println("请输入第二个数");
		double b = sc.nextDouble();
		
		if(a > b){
			System.out.println("a > b");
		}
		else{
			System.out.println("a < b");
		}
	}


}
