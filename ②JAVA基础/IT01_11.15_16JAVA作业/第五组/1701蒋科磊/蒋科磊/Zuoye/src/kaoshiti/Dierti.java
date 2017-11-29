package kaoshiti;

import java.util.Scanner;

public class Dierti {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("请输入一个小数：");
		float a=Sc.nextFloat();
		System.out.println("请再输入一个小数：");
		float b=Sc.nextFloat();
		if(a>b){
			System.out.println("较大的值为："+a);
		}
		else if(a<b){
			System.out.println("较大的值为："+b);
		}
				}
}
