package com.Grade;

import java.util.Arrays;

public class Scort implements ISorce {

	@Override
	public void info() {
		System.out.println("-----成绩系统的帮助信息-----");
		System.out.println("[1]求和请输入sum");
		System.out.println("[2]最大值请输入max");
		System.out.println("[3]最小值请输入min");
		System.out.println("[4]平均分请输入average");
		System.out.println("[5]查看不及格成绩请输入flunk");
		System.out.println("[6]排序请输入sort");
		System.out.println("[7]查看全部成绩请输入info");
		System.out.println("[8]退出系统请输入Exit");
	}

	@Override
	public double max(double[] d) {
		double t = 0;
		for (int i = 0; i < d.length - 1; i++) {

			if (d[i] < d[i + 1]) {
				d[i] = d[i + 1];
				t = d[i];
			}
		}
		return t;
	}

	@Override
	public double min(double[] d) {
		double t = 0;

		for (int i = 0; i < d.length - 1; i++) {

			if (d[i] > d[i + 1]) {
				d[i] = d[i + 1];
				t = d[i];
			}
		}
		return t;
	}

	@Override
	public double sum(double[] d) {
		int sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		return sum;
	}

	@Override
	public double average(double[] d) {
		double sum = 0;
		double t = 0;
		for (int i = 0; i < d.length; i++) {
			sum = sum + d[i];
			t = sum / d.length;
		}
		return t;
	}

	void scortinfo(double[] d) {
		System.out.println(Arrays.toString(d));
	}

	@Override
	public int flunk(double[] d) {
		int count = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i] < 60) {
				count++;
			}
		}
		return count;
	}

	@Override
	public double[] sort(double[] d) {
		int c = 0;
		for (int i = 0; i < d.length - 1; i++) {
			for (int j = 0; j < d.length - 1; j++) {
				if (d[j] > d[j + 1]) {
					c = (int) d[j];
					d[j] = d[j + 1];
					d[j + 1] = c;

				}
			}
			System.out.println(Arrays.toString(d));
		}

		
		return d;
	}
}
