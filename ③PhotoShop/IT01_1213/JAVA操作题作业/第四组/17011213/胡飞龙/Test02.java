package hufeilong;

import java.util.Scanner;


public class Test02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����һ����λ��");
		int k=sc.nextInt();
		if (k<1000&&k>100) {
			
				System.out.println("���������ʮλ����"+k/10%10);	
		}
		sc.close();
	}
}
