package zhangqing;

import java.util.Scanner;

/* @author  作者：张庆  E-mail1738041626@QQ.com
 * @date    创建时间：2017年11月15日 下午6:42:10
 * @Tel: 1438438 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Kaoshier {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入a");
	int a=sc.nextInt();
	System.out.println("请输入b");
	int b=sc.nextInt();
	if(a>b){
		System.out.println("a>b");
	}else{
		System.out.println("a<b");
	}
}
}
