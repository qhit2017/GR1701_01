package zhangqing;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
	//编写JAVA程序，通过控制台输入一个整数N（N不大于10000），
	//判断该数字是几位数，并输出结果。
		System.out.println("请输入一个整数不大于10000的整数");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i <=10000&&i >=0){
			for (int a=1;;a++){
				i=i/10;
				if(i<=0){
					System.out.println("该数是一个"+i+"位数!");
					break;		
				}
			}
		} else {
			System.out.println("请输入一个正确的数！");
		}
	}
}