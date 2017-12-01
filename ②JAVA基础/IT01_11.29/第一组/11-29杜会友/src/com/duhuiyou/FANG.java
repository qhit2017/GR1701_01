package com.duhuiyou;

import java.util.Arrays;

public class FANG implements Operatingsystem {

	@Override
	public void info() {
		System.out.println("------成绩管理系统------");
		System.out.println("[1]求和请输入1");
		System.out.println("[2]求最大值请输入2");
		System.out.println("[3]求最小值请输入3");
		System.out.println("[4]求最平均值请输入4");
		System.out.println("[5]排序请输入5");
		System.out.println("[6]查看成绩请输入6");
		System.out.println("[7]查看不及格请输入7");
		System.out.println("[8]退出请输入8");
	}
	/*void info();
	double sum(double[] d);
	double max(double[] d);
	double min(double[] d);
	double average(double[] d);
	double[]sort(double[] d);
	int numberNot60(double[] d);*/

	@Override
	public double sum(double[] d) {
		int sum = 0;
		for (int i = 0; i < d.length; i++) {
		sum+=d[i];
		}
		return 0;
	}

	@Override
	public double max(double[] d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double min(double[] d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double average(double[] d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double[] sort(double[] d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int numberNot60(double[] d) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	void look(double[] d){
		System.out.println(Arrays.toString(d));
		
	}

}
