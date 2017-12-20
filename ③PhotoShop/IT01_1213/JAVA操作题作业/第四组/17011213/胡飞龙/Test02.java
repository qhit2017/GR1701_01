package hufeilong;

import java.util.Scanner;


public class Test02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个三位数");
		int k=sc.nextInt();
		if (k<1000&&k>100) {
			
				System.out.println("输入该数的十位数："+k/10%10);	
		}
		sc.close();
	}
}
