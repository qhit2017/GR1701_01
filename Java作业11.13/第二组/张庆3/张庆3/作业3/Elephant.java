package zhangqing;

import java.util.Scanner;

public class Elephant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a = sc.nextInt();
	
		if(a>=90){
			System.out.println("A");
		}else if(a>=60){
			System.out.println("B");
		
		}else {
			System.out.println("c");
		}
	}
	}


