package com.bean;

import java.util.Scanner;

public class CDtest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SF sf=new SF();
		sf.caidan();
		boolean condition = true;
		while (condition) {

			int key = sc.nextInt();
			
			switch (key) {
			case 1:

				break;

			case 2:

				break;

			case 3:
				SF sa=new SF();
				sa.zcaidan();
				while (condition) {
					switch (key) {
					case 1:
						sa.
						break;

					case 2:

						break;

					case 3:

						break;

					case 4:

						break;

					default:
						System.out.println("输入有误");
						break;
					}
				}
				break;

			case 4:

				break;

			case 5:
				condition = false;
				break;

			default:
				System.out.println("输入有误");
				break;
			}
		}
		System.out.println("已退出");

	}

}
