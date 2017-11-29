package machao;

import java.util.Scanner;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月21日 下午8:13:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Sort {
public static void main(String[] args) {
	//输入三个整数x,y,z，请把这三个数由小到大输出。	
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int x = sc.nextInt();
		System.out.println("请输入第一个数：");
		int y = sc.nextInt();
		System.out.println("请输入第一个数：");
		int z = sc.nextInt();
		
		int u[]={x,y,z};
		for (int a = 1; a < u.length; a++) {
			for (int b = 0; b < u.length; b++) {
				if (u[a] < u[b]) {
					int c = u[a];
					u[a] = u[b];
					u[b] = c;
				}
			}
		}
		for (int c = 0; c < u.length; c++) {
			System.out.print(u[c]);
			if (c < 2) {
				System.out.print("<");
			}
		}
		sc.close();
	}
}


