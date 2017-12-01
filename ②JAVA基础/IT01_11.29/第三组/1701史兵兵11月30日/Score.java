package com.zkqhit;

import java.util.Arrays;

public class Score implements One {

	public void info() {
		// TODO Auto-generated method stub
		System.out.println("------帮助------");
		System.out.println("[1]求最大值请输入Max");
		System.out.println("[2]求最小值请输入Min");
		System.out.println("[3]求平均值请输入Average");
		System.out.println("[4]从小到大排序请输入Sort");
		System.out.println("[5]求和请输入Sum");
		System.out.println("[6]不及格的请输入Number");
		System.out.println("[7]查看全部成绩请输入Examine");
		System.out.println("[8]退出系统请输入Exit");


	}

	public double max(double[] d) {
		// TODO Auto-generated method stub
		double max=d[0];
		for (int i = 0; i < d.length; i++) {
			if(d[i]>d[i+1]){
				d[i]=max;
			}
		}
		return 0;
	}

	public double min(double[] d) {
		// TODO Auto-generated method stub
		double min=d[0];
		for (int i = 0; i < d.length; i++) {
			if(d[i]<d[i+1]){
				d[i]=min;
			}
		}
		
		return 0;
	}

	public double average(double[] d) {
		// TODO Auto-generated method stub
		double Average=d[0];
		double sum=0;
		for (int i = 0; i < d.length; i++) {
			sum=sum+d[i];
			Average=sum/d.length;
		}
		return 0;
	}

	public double[] sort(double[] d) {
		// TODO Auto-generated method stub
		for (int j = 0; j < d.length; j++) {
			double temp;
			for (int i = 0; i < d.length; i++) {
				if(d[i]>d[i+1]){
					temp=d[i];
					d[i]=d[i+1];
					d[i+1]=temp;
				}
			}
		}
		return null;
	}

	public double sum(double[] d) {
		// TODO Auto-generated method stub
		double sum=d[0];
		for (int i = 0; i < d.length; i++) {
			sum=sum+d[i];
		}
		return 0;
	}

	boolean is = true;
	public int numberNot60(double[] d) {
		// TODO Auto-generated method stub
		int b=0;
		for (int i = 0; i < d.length; i++) {
			if(d[i]<60){
				b++;
			}
		}
		return 0;
	}
		void examine(double[] d) {
			System.out.println(Arrays.toString(d));
	}

}
