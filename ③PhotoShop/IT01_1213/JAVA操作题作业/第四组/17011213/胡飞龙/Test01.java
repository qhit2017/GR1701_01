package hufeilong;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ��С��");
		double h=sc.nextDouble();
		System.out.println("������ڶ���С��");
		double j=sc.nextDouble();
		if (h==j) {
			System.out.println("����С�����");
		}else {
			System.out.println("����С�������");
		}
		sc.close();
	}
}
