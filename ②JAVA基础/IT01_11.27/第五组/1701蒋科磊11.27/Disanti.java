package jkl;

import java.util.Scanner;

public class Disanti {

	public static void main(String[] args) {
		//从键盘输入10个数，输出后五个数
		Scanner sc = new Scanner(System.in);
		int [] a=new int [10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第"+(i+1)+"个数");
			a[i]=sc.nextInt();
		}
		for (int i = 5; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
