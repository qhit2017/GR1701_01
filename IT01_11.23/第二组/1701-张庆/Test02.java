package zhangqing;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
       //编写JAVA程序，输入一个三位数，输出该数的十位是多少。
		
		System.out.println("请输入一个三位数");
		Scanner sc=new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("该数的十位数是"+i/10%10);
	}
}
