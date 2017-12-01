package com.grade;

import java.util.Arrays;

/*Author：刘龑聪
  E-mail：15539919713@163.com
 */
public class Score implements IScore {

	@Override
	public void help() {
		System.out.println("-------成绩管理系统-------");
		System.out.println("[1]查看全部成绩请输入Info");
		System.out.println("[2]求和请输入Sum");
		System.out.println("[3]求最大值请输入Max");
		System.out.println("[4]求最小值请输入Min");
		System.out.println("[5]求平均值请输入Average");
		System.out.println("[6]排序请输入Sort");
		System.out.println("[7]求不及格人数请输入Not");
		System.out.println("[8]退出请输入Exit");
		System.out.println("[9]重新查看帮助请输入Help");
		System.out.println();
	}

	@Override
	public double sum(double[] d) {
		double sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		return sum;
	}

	@Override
	public double max(double[] d) {
		double max = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i]>max) {
				max = d[i];
			}
		}
		return max;
	}

	@Override
	public double min(double[] d) {
		double min = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i]<min) {
				min = d[i];
			}
		}
		return min;
	}

	@Override
	public double average(double[] d) {
		double sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		return sum/d.length;
	}

	@Override
	public double[] sort(double[] d) {
		for (int i = 0; i < d.length-1; i++) {
			for (int j = 0; j < d.length-1; j++) {
				if(d[j]<d[j+1]){
					double temp = d[j+1];
					d[j+1]=d[j];
					d[j]=temp;
				}
			}	
		}
		return d;
	}

	@Override
	public int Not60(double[] d) {
		int not = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i]<60) {
				not++;
			}
		}
		return not;
	}

	void ScoreInfo(double[] d){
		System.out.println(Arrays.toString(d));
	}
}
