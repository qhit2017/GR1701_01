package kaoshiti;

import java.util.Scanner;

public class Kaoshiti {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int score=sc.nextInt();
		if(score>0){
			System.out.println("此数字是一个正数");
		}
		else if(score<0){
			System.out.println("此数字是一个负数");
		}
		else{
			System.out.println("请输入正确的数字");
		}
	}
}
