package HEL;

import java.util.Arrays;
import java.util.Scanner;


public class HomeWork1127_1 {

	public static void main(String[] args) {
		
		//从键盘接收10个数，并存入数组中，然后循环遍历数组中的元素
		Scanner sc = new Scanner(System.in);
		int []a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println("数组：");
		for (int i = 0; i < a.length;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}
