package machao;

import java.util.Scanner;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月21日 下午8:40:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ZhengshuN {
	public static void main(String[] args) {
//编写JAVA程序,通过控制台输入一个整数N,(N不大于10000),输出
//所有7的倍数和包含7的数.		
		System.out.println("请输入一个不大于10000的数:");
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if (q <= 10000) {
			for (int a = 1; a <= q; a++) {
				if (a % 7 == 0 || a / 1000 == 7 || a / 100 == 7 || a / 10 == 7) {
					System.out.println(a);
				}
			}
		} else {
			System.out.println("请输入一个正确的数!");
		}
		sc.close();
	}
}
}
