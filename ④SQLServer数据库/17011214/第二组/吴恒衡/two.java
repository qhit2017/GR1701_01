package whh;

import java.util.Scanner;

public class two {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ��5λ��");
		int a=sc.nextInt();
		for (int i = 10000; i <= a; i++) {
			if(i%10==6&&i%3==0)
				System.out.println(i);
		}
		
	}

}
