package com.zhangtongtong.qhit;

import java.util.Arrays;

/**
 * 作者：张彤彤 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月29日 下午2:22:51
 */
public class Score implements IGrade {

	@Override
	public void info() {
		System.out.println("——————学生成绩帮助系统——————");
		System.out.println("[1]、求和请输入：Sum");
		System.out.println("[2]、求最大值请输入：MAN");
		System.out.println("[3]、求最小值请输入：MIN");
		System.out.println("[4]、求平均分请输入：Average");
		System.out.println("[5]、排序请输入：sort");
		System.out.println("[6]、查看不及格人数请输入：Number60");
		System.out.println("[7]、查看分数请输入：Info");
		System.out.println("[8]、退出请输入：ESC");

	}

	@Override
	public double Sum(double[] d) {
		double sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		return sum;
	}

	@Override
	public double MAN(double[] d) {
		double MAN = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i] > MAN) {
				MAN = d[i];
			}
		}

		return MAN;
	}

	@Override
	public double MIN(double[] d) {
		double MIN = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i] < MIN) {
				MIN = d[i];
			}
		}

		return MIN;
	}

	@Override
	public double Average(double[] d) {
		double Average = 0;

		double sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		Average = sum / d.length;

		return Average;
	}

	@Override
	public void sort(double[] d) {
		double b = 0;
		for (int i = 0; i < d.length - 1; i++) {
			for (int j = 0; j < d.length - 1; j++) {
				if (d[j] > d[j + 1]) {
					b = d[j];
					d[j] = d[j + 1];
					d[j + 1] = b;
				}
			}
		}
		System.out.println(Arrays.toString(d));

	}

	@Override
	public int Number60(double[] d) {
		int sum = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i] < 60) {
				sum += 1;
			}
		}
		return sum;
	}

	@Override
	public void Info(double[] d) {
		System.out.println(Arrays.toString(d));

	}

}
