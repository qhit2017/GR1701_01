/**
 * 
 */
package com.sxl;

import java.util.Arrays;

/**
 * @author Administrator
 *
 */
public class Score implements IScores {

	

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sxl.ISore#info()
	 */
	public void help() {
		System.out.println("帮助");
		System.out.println("求和请输入sum");
		System.out.println("求最大值请输入Max");
		System.out.println("求最小值请输入Min");
		System.out.println("求平均值值请输入Average");
		System.out.println("降序排列请输入Sort");
		System.out.println("列出不及格人数请输入Not");
		System.out.println("退出请输入Exit");
		System.out.println("列出成绩请输入Info");
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sxl.ISore#sum(double[])
	 */
	@Override
	public double sum(double[] d) {
		int sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];

		}
		// TODO Auto-generated method stub
		return sum;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sxl.ISore#max(double[])
	 */
	@Override
	public double max(double[] d) {
		// TODO Auto-generated method stub
		double max = d[0];
		for (int i = 0; i < d.length; i++) {
			if (max < d[i]) {
				max = d[i];
			}

		}
		return max;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sxl.ISore#min(double[])
	 */
	@Override
	public double min(double[] d) {
		// TODO Auto-generated method stub
		double min = d[0];
		for (int i = 0; i < d.length; i++) {
			if (min > d[i]) {
				min = d[i];
			}

		}
		return min;
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sxl.ISore#average(double[])
	 */
	@Override
	public double average(double[] d) {
		// TODO Auto-generated method stub
		return sum(d)/d.length;
		
	}
		

	

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sxl.ISore#numberNot60(double[])
	 */
	@Override
	public int numberNot60(double[] d) {
		int count = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i] < 60) {
				count++;
			}
		}
		// TODO Auto-generated method stub
		return count;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sxl.ISore#sort(double[])
	 */
	@Override
	public double[] sort(double[] d) {
		// TODO Auto-generated method stub
		double temp;
		for (int i = 0; i < d.length-1; i++) {
			for (int j = 0; j < d.length-1; j++) {
				if (d[j] > d[j + 1]) {
					temp = d[j];
					d[j] = d[j + 1];
					d[j + 1] = temp;
				}
			}
		}
		System.out.println("从大到小顺序：" + Arrays.toString(d));
		return d;
	}

	@Override
	public void info(double[] d) {
		// TODO Auto-generated method stub
	System.out.println(Arrays.toString(d));

	}
}
