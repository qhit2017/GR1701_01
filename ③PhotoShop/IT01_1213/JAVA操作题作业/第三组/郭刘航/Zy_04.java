package Zuoye1213;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
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
		System.out.println("一共经过了"+s+"米");	
	}
}
