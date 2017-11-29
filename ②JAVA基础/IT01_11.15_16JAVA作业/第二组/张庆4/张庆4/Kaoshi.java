package zhangqing;

import java.util.Scanner;

/* @author  作者：张庆  E-mail1738041626@QQ.com
 * @date    创建时间：2017年11月15日 下午6:31:33
 * @Tel: 1438438 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Kaoshi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数");
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("为正数" + a);
		} else if(a<0){
			System.out.println("负数" + a);
		}else{
			System.out.println("既不为正数也不为负数");
		}

	}
}
