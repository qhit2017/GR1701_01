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
public class Zy_04 {

	public static void main(String[] args) {
		float l=100;
		float s=l;
		for (int i = 0; i < 10; i++) {
			l=l/2;
			if (i==10) {
				s+=l;
			}else{
				s+=2*l;
			}
		}
		System.out.println("һ��������"+s+"��");	
	}
}
