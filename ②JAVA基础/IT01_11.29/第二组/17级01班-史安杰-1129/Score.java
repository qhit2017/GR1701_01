package com.saj;

import java.util.Arrays;

public class Score implements Isore {

	@Override
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

	@Override
	public double max(double[] d) {
		// TODO Auto-generated method stub
		double max = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i] > max) {
				max = d[i];

			}
		}

		return max;
	}

	@Override
	public double min(double[] d) {
		// TODO Auto-generated method stub
		double min = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i] < min) {
				min = d[i];

			}
		}

		return min;
	}

	@Override
	public double average(double[] d) {
		// TODO Auto-generated method stub
		double sum = 0;
		double average = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
			average = sum / d.length;

		}

		return average;
	}

	@Override
	public double[] sort(double[] d) {
		// TODO Auto-generated method stub
		
	
	for (double j = 0; j < d.length-1; j++) {
      double temp;
	for (int i = 0; i < d.length-1; i++) {
		if(d[i]<d[i+1]){
			temp=d[i];
			d[i]=d[i+1];
			d[i+1]=temp;
		}
		}	
		
	}
		return d;
	}

	@Override
	public double sum(double[] d) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		return sum;
	}

	@Override
	public int numberNot60(double[] d) {
		// TODO Auto-generated method stub
		int b = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i] < 60) {
				b++;

			}

		}
		return b;
	}

	void examine(double[] d) {
		System.out.println(Arrays.toString(d));

	}

}
