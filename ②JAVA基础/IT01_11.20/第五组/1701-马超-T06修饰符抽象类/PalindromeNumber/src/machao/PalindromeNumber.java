package machao;

import java.util.Scanner;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月21日 下午8:22:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PalindromeNumber {
	//一个5位数，判断它是不是回文数。
	//即12321是回文数，个位与万位相同，十位与千位相同。
	public static void main(String[] args) {
		System.out.print("请输入一个五位数：");
		Scanner sc = new Scanner(System.in);
		int num = sc .nextInt();
		
		if(num/10000==num%10&&num/1000%10==num/10%10){
			System.out.println("你输入的数是回文数！");
		}else{
			System.out.println("你输入的数不是回文数！");
		}
		sc.close();
	}
}


