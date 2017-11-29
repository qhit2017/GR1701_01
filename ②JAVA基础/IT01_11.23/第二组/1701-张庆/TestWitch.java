package zhangqing;

import java.util.Scanner;

public class TestWitch {

	public static void main(String[] args) {
		
		System.out.println("请输入1~7的整数!");
		Scanner sc = new Scanner(System.in);
		int i= sc.nextInt();
		
		switch (i) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("请输入正确的数字！");
			break;
		}
	}


	}

