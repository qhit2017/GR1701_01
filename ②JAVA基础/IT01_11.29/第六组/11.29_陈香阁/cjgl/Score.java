package ccom.cjgl;

import java.util.Arrays;

public class Score implements Iscore {

	@Override
	public void info() {
		System.out.println("*******成绩管理帮助*******");
		System.out.println("[1]求和请输入 Sum");
		System.out.println("[2]最大值请输入Max");
		System.out.println("[3]最小值请输入Min");
		System.out.println("[4]平均值请输入Average");
		System.out.println("[5]排序请输入Sort");
		System.out.println("[6]不及格人数请输入Not");
		System.out.println("[7]查看成绩请输入Info");
		System.out.println("[8]退出请输入Exit");
	}

	@Override
	public double sum(double[] c) {
		
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum +=c[i];
		}
		return sum;
	}

	@Override
	public double max(double[] c) {
		double max = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i]>max) {
				max=c[i];
			}
		}
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double min(double[] c) {
		double min = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i]<min) {
				min= c[i];
			}
		}
		return 0;
	}

	@Override
	public double average(double[] c) {
		double sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum += c[i];
		}
		return sum/c.length;
	}

	@Override
	public double[] sort(double[] c) {
		for (int i = 0; i < c.length-1; i++) {
			for (int j = 0; j < c.length-1; j++) {
				if (c[j]>c[j+1]){
					double temp = c[j+1];
					c[j+1] = c[j];
					c[j] = temp;
				}
		}
	}
		return c;
		
	}

	@Override
	public int numberNot60(double[] c) {
		return 0;
	}

	void scoreInfo(double[] c){
		System.out.println(Arrays.toString(c));
	}
}
