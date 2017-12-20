package hufeilong;

import java.util.Scanner;


public class Test04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈë³É¼¨");
		int h=sc.nextInt();
		if (h>=90) {
			System.out.println("A");
		}else if (h<89&&h>60) {
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		sc.close();
	}
}
