package com.grade;

import java.util.Arrays;



public class Score implements Isorce {

	@Override
	public void info() {
		System.out.println("----帮助信息----");
		System.out.println("[1]求和请输入Sum");
		System.out.println("[2]求最大值请输入Max");
		System.out.println("[3]求最小值请输入Min");
		System.out.println("[4]排序请输入Sort");
		System.out.println("[5]平均值请输入Average");
		System.out.println("[6]总数请输入Info");
		System.out.println("[7]不及格人数请输入Not");
		System.out.println("[8]退出请输入Exit");
		
		
		
		
		
		
	}

	@Override
	public double sum(double[] d) {
		double sum=0;
		for (int i = 0; i < d.length; i++) {
			sum+=d[i];
		}
		return sum;
	}

	@Override
	public double max(double[] d) {
		double max=98;
		for (int i = 0; i < d.length; i++) {
			if (d[i]>max) {
				max=d[i];
			}
		}
		return max;
	}

	@Override
	public double min(double[] d) {
		double min=98;
		for (int i = 0;i< d.length; i++) {
			
		
		if (d[i]<min) {
			min=d[i];
		}}
		
		return min;
	}

	@Override
	public double[] sort(double[] d) {
		double temp;
		for (int j = 0; j < d.length-1; j++) {
			
		
		for (int i = 0; i < d.length-1; i++) {
			if (d[i]>d[i+1]) {
				temp=d[i];
				d[i]=d[i+1];
				d[i+1]=temp;
				
			}
		}}
		return d;
	}

	@Override
	public double average(double[] d) {
		double sum=0;
		for (int i = 0; i < d.length; i++) {
			sum+=i;
		}System.out.println(sum/d.length);
		return 0;
	}

	@Override
	public int numberNot60(double[] d) {
		int count=0;
		for (int i = 0; i < d.length; i++) {
			if (d[i]<60) {
				count++;
				
			}System.out.println("不及格人数为"+count);
		}
		
		
		return count;
	}
	void scoreInfo(double[]d){
		System.out.println(Arrays.toString(d));
	}

}
