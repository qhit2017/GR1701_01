package Zuoye1213;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Zy_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ĸ�����");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		System.out.println();
		int temp;
		if(a>b){
			temp=a;
			a=b;
			b=temp;
		}
		if(a>c){
			temp=a;
			a=c;
			c=temp;
		}
		if(a>d){
			temp=a;
			a=d;
			d=temp;
		}
		if(b>c){
			temp=b;
			b=c;
			c=temp;
		}
		if(b>d){
			temp=b;
			b=d;
			d=temp;
		}
		if(c>d){
			temp=c;
			c=d;
			d=temp;
		}
		System.out.println(a+" "+b+" "+c+" "+d);
	
	}
}
