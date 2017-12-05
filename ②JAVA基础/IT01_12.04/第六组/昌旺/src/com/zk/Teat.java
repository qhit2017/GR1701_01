/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月4日 下午8:55:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package com.zk;

import java.util.ArrayList;
import java.util.Scanner;

public class Teat {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Gaokaochengji gc=new Gaokaochengji();
		boolean isq=true;
		gc.help1();
		boolean isqq=false;
		ArrayList<Kaoshi> ss=new ArrayList<Kaoshi>();
		while (isq) {
			int key=sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("请输入数据");
				gc.addkaoshi(ss, sc);
				break;
			case 2:
				gc.inforkaoshi(ss);
				break;
			case 3:
				gc.help2();
				isqq=true;
				while (isqq) {
					switch (key) {
					case 1:
						gc.maxkaoshi(ss, "总分");
						break;
					case 2:
						gc.maxkaoshi(ss, "语文");
						break;
					case 3:
						gc.maxkaoshi(ss, "数学");
						break;
					case 4:
						gc.maxkaoshi(ss, "外语");
						break;
					case 5:
						gc.help1();
						isqq=false;
						break;

					default:
						break;
					}
					
				}
			case 4:
				isq=false;
				break;

			default:
				System.out.println("");
				break;
			}
			
		}

	}

}
