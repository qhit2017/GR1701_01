package sort;

import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int x = sc.nextInt();
		System.out.println("请输入第一个数：");
		int y = sc.nextInt();
		System.out.println("请输入第一个数：");
		int z = sc.nextInt();
		
		int i[]={x,y,z};
		for (int k = 1; k < i.length; k++) {
			for (int b = 0; b < i.length; b++) {
				if (i[k] < i[l]) {
					int j = i[k];
					i[k] = i[l];
					i[l] = j;
				}
			}
		}
		for (int j = 0; j < i.length; j++) {
			System.out.print(i[j]);
			if (j < 2) {
				System.out.print("<");
			}
		}
		sc.close();
	}
}
