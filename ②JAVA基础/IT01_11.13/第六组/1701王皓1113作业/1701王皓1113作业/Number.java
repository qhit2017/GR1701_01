package WangHao;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("请输入成绩数");
		int study = sc.nextInt();
		boolean a = false;
		a = (study >= 90) ? true : false;
		System.out.println("a的值是:" + a);
		if (a) {
			System.out.println("表示为:A");
		} else if (a = (study >= 60) ? true : false) {
			System.out.println("表示为:B");
		} else if (a = (study < 60) ? true : false) {
			System.out.println("表示为:C");
		}

	}

}
