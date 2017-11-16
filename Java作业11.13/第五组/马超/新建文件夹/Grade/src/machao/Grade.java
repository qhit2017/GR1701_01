package machao;

import java.util.Scanner;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月14日 下午7:09:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Grade {
    public static void main(String[] args) {
    	//利用三元条件运算符的嵌套或选择结构来完成此题
    	//学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
    	for (;;) {
    	System.out.println("请输入该学生的成绩");
    	Scanner sc = new Scanner(System.in);
    	int grade = sc.nextInt();

    	System.out.println(grade >= 90 ? "A" : grade >= 60 ? "B" : "C");
	}
    }
}