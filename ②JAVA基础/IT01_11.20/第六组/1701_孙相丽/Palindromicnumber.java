package com.zk.qhit;

import java.util.Scanner;

public class Palindromicnumber {

	public static void main(String[] args) {
		// 4、一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
		Scanner sc = new Scanner(System.in);
		long i=sc.nextLong();
		int unit = (int)(i % 10);
			int myriabit = (int)(i / 10000);
			int decade = (int)(i/10%10);
			int kilobit = (int)((i%10000)/1000);
			if ((unit == myriabit) && decade == kilobit) {
				System.out.println(i + "回文数");
			}else{
				System.out.println(i+"不是回文数");
			}
		sc.close();
	}

	}


