/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��13�� ����7:51:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package cc;

import java.util.Scanner;

public class Disiti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a=0.5;
		double g = 0;
		System.out.println("������ش�����");
		double b=sc.nextDouble();
		for (int i = 1; i <b; i++) {
			g =g+2*100*a;
			a=a*0.5;
		}
		System.out.println(100+g);
	}

}
