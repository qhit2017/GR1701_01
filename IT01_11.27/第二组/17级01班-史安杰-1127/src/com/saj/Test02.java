package com.saj;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={5,9,12,45,18,30};
		
		int sum=0;
		int max=a[0];
		int min=a[0];
		
		
			for (int j = 0; j < a.length; j++) {
				sum+=a[j];
				if(a[j]>max){
					max=a[j];
					
				}if(a[j]<min){
					min=a[j];
				}	
				
			
		}
            System.out.println(sum);
			System.out.println(max);
			System.out.println(min);
			

	}

}
