/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��13�� ����9:48:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package cc;

import java.util.Scanner;

public class Diyiti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a []=new int [4];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int temp;
		for (int j = 0; j < a.length-1; j++) {
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]>a[i+1]) {
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		}
		System.out.println(a[0]+"<"+a[1]+"<"+a[2]+"<"+a[3]);

	}

}
