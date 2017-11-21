package com.gaojie.qhit01;

public class Test10 {
	public static void main(String[] args) {
		System.out.println("九九乘法表 do while循环表示如下");
		
		int i = 1;

		do {
			int g = 1;
			
				do {
					System.out.print(i + "*" + g + "=" + i * g + "  ");
					g++;
				} while (g <= i);

			System.out.println();
			i++;
			} while (i <= 9);

	}

}
