package glh;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月23日 下午6:55:59 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ZuoYe1123_4 {

	public static void main(String[] args) {
		//从键盘输入1~7的数字，如果数字是1，则输出星期一，如果数字是2，则输出星期二........如果数字是7,则输出星期日(用switch)
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字：");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("你输入错误！！！");	
		}
	}
}
