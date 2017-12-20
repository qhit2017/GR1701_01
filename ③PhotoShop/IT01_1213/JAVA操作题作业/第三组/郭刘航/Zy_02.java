package Zuoye1213;

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
public class Zy_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个十进制数：");
		int s = sc.nextInt();
		if (s <= 99 && s >= 10) {
			String a = Integer.toString(s, 16);
			System.out.println("转化为16进制为：" + a);
		} else {
			System.out.println("您输入的数字不在范围内，" 
							+ "请在10~99之间选取数字。");
		}
	}
}
