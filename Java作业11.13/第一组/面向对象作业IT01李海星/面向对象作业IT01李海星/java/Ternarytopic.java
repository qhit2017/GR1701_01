package objectoriented;

import java.util.Scanner;

public class Ternarytopic {
/*3、利用三元条件运算符的嵌套或选择结构来完成此题：
	 学习成绩>=90分的同学用A表示，
	 60-89分之间的用B表示，
	 60分以下的用C表示。
	 程序分析：(a>b)?a:b这是条件运算符的基本例子。
*/	
public static void main(String[] args) {
		       System.out.println("请输入成绩0~120");
Scanner sc =new Scanner(System.in);
		int d=sc.nextInt();
		if (d>=90 && d<=120){
		       System.out.println("A");
		}
		else if(89>=d && d>=60){			
		       System.out.println("B");
		}else {
			
		       System.out.println("C");
		
		}
	}
}
