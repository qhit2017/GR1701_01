package jkl;

import java.util.Scanner;

public class Diyiti {

	//从键盘接收十个数，并存入数组中，然后循环遍历数组中的元素
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]a=new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第"+(i+1)+"个数");
			a[i]=sc.nextInt();
			
		}
		for (int j = 0; j < a.length; j++) {
			
			System.out.println(a[j]);
		}
	}
}
