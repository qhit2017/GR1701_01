package com.Grade;

import java.util.Arrays;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月29日 上午8:27:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Score implements IScore {

	@Override
	public void info() {
		System.out.println("-----成绩管理系统-----");
		System.out.println("(1).求和请输入Sum：");
		System.out.println("(2).求最大值请输入Max：");
		System.out.println("(3).求最小值请输入Min：");
		System.out.println("(4).求平均值请输入Avarage：");		
		System.out.println("(5).求不及格人数请输入Not");
		System.out.println("(6).查看全部成绩请输入Info：");	
		System.out.println("(7).排序请输入Sort：");
		System.out.println("(8).退出系统请输入Exit：");		
	}
	//求和
	@Override
	public double sum(double[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
			
		}		
		
		return sum;
	}
//最大值
	@Override
	public double max(double[] a) {
		double max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}		
		return max;
	}
//最小值
	@Override
	public double min(double[] a) {
		double min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}		
		return min;
	}
//平均值
	@Override
	public double avarage(double[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		int avarage =0;
		avarage = sum/a.length;		
		return avarage;
	}
//排序
	@Override
	public double[] sort(double[] a) {
		boolean isSort=false;
		for (int i = 0; i < a.length-1; i++) {
			int temp;
			isSort=true;
			for (int j = 0; j < a.length-1; j++) {
				if (a[i]>a[i+1]) {
					temp=(int) a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					isSort=false;
				}
				if (isSort) {
					break;
				}				
			}			
		}
		System.out.println(Arrays.toString(a));
		return a;

	}

	@Override
	public int NumberOffailures(double[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]<60) {
				count++;
			}
		}
		return 0;
	}
	
	//查看全部成绩
	void scoreInfo(double[] a){
		System.out.println(Arrays.toString(a));
		
	}

}
