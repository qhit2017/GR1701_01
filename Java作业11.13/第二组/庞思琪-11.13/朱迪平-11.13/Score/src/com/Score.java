package com;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:271406@163.com
 * @date    创建时间：2017年11月13日 下午6:51:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Score {public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入分数");
	int score=sc.nextInt();
	if(score>=90){System.out.println("A");}
	if((score>=60)&&(score<=89)){System.out.println("B");}
	if(score<60){System.out.println("C");}
	
	
	
	
	
}

}
