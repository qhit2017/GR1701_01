package jtc;

import java.util.Scanner;


public class ChouKao_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("请输入一个不大于10000的整数：");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x <= 10000&&x >= 0){
			for(int i = 1;;i++){
				x = x/10;
				if(x <= 0){
					System.out.println("该数是一个"+i+"位数。");
					break;
				}
			}
		}else{
			System.out.println("请输入一个不大于10000的整数");
		}
	}

}
