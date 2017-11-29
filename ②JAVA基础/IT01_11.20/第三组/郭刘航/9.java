package glh;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月21日 下午6:30:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Exam_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入N(N<10000)");
		int N = sc.nextInt();
		System.out.println("N范围内所有7的倍数且包含7的数如下表示：");
		if(N < 10000){
		for (int a = 1;a <= N;a++){
			if((a%7==0)
					&&((a%10 == 7)||(a/10%10 == 7)
							||(a/100%10 == 7)||(a/10000 == 7))){
				System.out.println(a);
			}
		}
	}
	if (N >= 10000 || N <= 0){
		System.out.println("范围之外");
	}
}
}
