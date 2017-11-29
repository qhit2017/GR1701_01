package com;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int []a=new int[10];
	for (int k = 0; k < a.length; k++) {
		a[k]=sc.nextInt();
	}
	int temp;
	for (int j = 0; j < a.length-1; j++) {
		
	
	for (int i = 0; i < a.length-1; i++) {
		
		if (a[i]<a[i+1]) {
			temp=a[i+1];
			a[i+1]=a[i];
			a[i]=temp;
			
		}
		
	}}
	System.out.println(Arrays.toString(a));
	
	
	
	
	
}

}
