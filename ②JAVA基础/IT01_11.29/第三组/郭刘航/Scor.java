package Practice_1129;

import java.util.Arrays;

/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Scor implements IScor {

	private double x;

	@Override
	public void info() {
		System.out.println("-----成绩管理系统-----");
		System.out.println("[1]求和请输入Sum");
		System.out.println("[2]求最大值请输入Max");
		System.out.println("[3]求最小值请输入Min");
		System.out.println("[4]求平均值请输入Average");
		System.out.println("[5]排序请输入Score");
		System.out.println("[6]求不及格人数请输入Not");
		System.out.println("[7]查看成绩请输入Info");
		System.out.println("[8]退出请输入Exit");

	}

	@Override
	public double sum(double[] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum+=x[i];	
		}
		return sum;
	}

	@Override
	public double max(double[] x) {
		int max = (int) x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i]>max) {
				max = (int) x[i];
			}
		}
		return max;
	}

	@Override
	public double min(double[] x) {
		int min = (int) x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i]<min) {
				min = (int) x[i];
			}
		}
		return min;
	}

	@Override
	public double average(double[] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum+=x[i];	
		}
		int average = 0;
		average = sum/x.length;
		return average;
	}

	@Override
	public void sort(double[] x) {
		for (int i = 0; i < x.length-1; i++) {
			for (int j = 0; j < x.length-1; j++) {
				if(x[j]<x[j+1]){
					double temp = x[j+1];
					x[j+1]=x[j];
					x[j]=temp;
				}
			}	
		}System.out.println(Arrays.toString(x));
		
	}

	@Override
	public int numberNot60(double[] x) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i]<60) {
				count++;
			}
		}
		return count;
	}

	void Infor(double [] x){
		System.out.println(Arrays.toString(x));
	}
}
