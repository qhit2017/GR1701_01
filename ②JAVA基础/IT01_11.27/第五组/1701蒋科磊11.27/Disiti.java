package jkl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Disiti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a=new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第"+(i+1)+"个数");
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length-1; i++) {
			int temp;
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]>a[j+1]){
					temp=a[j];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}
}
