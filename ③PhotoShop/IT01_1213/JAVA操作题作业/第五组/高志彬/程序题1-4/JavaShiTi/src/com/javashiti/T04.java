package com.javashiti;

import java.util.Scanner;



public class T04 {
	public static void main(String[] args) {
		float l=100;
		float s=l;
		for (int i = 0; i < 10; i++) {
			l=l/2;
			if (i==10) {
				s+=l;
			}else{
				s+=2*l;
			}
		}
		System.out.println("一共经过了"+s+"米");
		
		
		
		
		
		
		
		
		
	}
}
