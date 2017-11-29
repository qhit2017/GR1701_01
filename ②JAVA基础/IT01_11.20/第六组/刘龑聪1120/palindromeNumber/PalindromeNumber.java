package palindromeNumber;

import java.util.Scanner;

/*作者：刘龑聪
 *E-mail：15539919713@163.com
 */
public class PalindromeNumber {
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
