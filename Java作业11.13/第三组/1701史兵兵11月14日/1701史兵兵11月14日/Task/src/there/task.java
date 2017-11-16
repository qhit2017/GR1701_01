package there;

import java.util.Scanner;

public class task {
	public static void main(String[] args) {
		/**3、利用三元条件运算符的嵌套或选择结构来完成此题：
		学习成绩>=90分的同学用A表示，60-89分之间的用B表示，
		60分以下的用C表示。
		程序分析：(a>b)?a:b这是条件运算符的基本例子。*/
		
		
		
		Scanner input = new Scanner(System.in);
        		
		
		
		System.out.println("输入你的成绩");
		int score = input.nextInt();
		if(score >=90){
			System.out.println("a");
		}else if(score>=60){
			System.out.println("b");
		}else{
			System.out.println("c");
		}
		/**Scanner sc=new Scanner(System.in);
		System.out.println("请输入分数");
		int score=sc.nextInt();
		
		if(score>=90){System.out.println("A");}
		if((score>=60)&&(score<=89)){System.out.println("B");}
		if(score<60){System.out.println("C");}*/
	
}

}
