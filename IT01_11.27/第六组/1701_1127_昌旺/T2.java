package com.zk.qhit01;

public class T2 {

	public static void main(String[] args) {
		int[] a={5,9,12,45,18,30};
		int sum=0;
		int max=a[0];
		int min=a[0];
		for (int j = 0; j < a.length; j++) {
			sum+=a[j];
			if(a[j]>max){
				max=a[j];
			}
			if (a[j]<min) {
				min=a[j];
			}
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);

	}

}
