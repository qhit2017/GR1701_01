package com.zk.qhit;
import java.util.Scanner;

public class Scores {
	
	/**
	* 时间：11.10
	* 星期：六
	* 下午：6：00
	* 地点：机房一
	* 科目：高软
	*/
			public static void main(String[] args) {
		
			/**3、利用三元条件运算符的嵌套或选择结构来完成此题：
			* 学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
			*程序分析：(a>b)?a:b这是条件运算符的基本例子。
			*/
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入同学的学习成绩");
			int scores = sc.nextInt();
			
			
			if(scores >= 90){
				System.out.println("该同学的学习成绩等级是：A");
			}else if(scores>= 60){
				System.out.println("该同学的学习成绩等级是：B");
			}else{
				System.out.println("该同学的学习成绩等级是：C");
			}sc.close();
		}
			
	}

	
	
	
	
	
	
	
	

