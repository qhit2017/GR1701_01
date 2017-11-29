package grade;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {

		//学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入同学的成绩");
		int grade = sc.nextInt();

		System.out.println(grade >= 90 ? "A" : grade >= 60 ? "B" : "C");

		sc.close();
	}
}
