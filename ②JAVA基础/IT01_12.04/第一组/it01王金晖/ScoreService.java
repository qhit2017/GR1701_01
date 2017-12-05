package com.examination;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreService implements IScore {

	void help() {
     System.out.println("高考成绩管理系统");
     System.out.println("[1] 录入成绩输入  1");
     System.out.println("[2] 显示成绩输入  2");
     System.out.println("[3] 查询成绩输入  3");
     System.out.println("[4] 退出系统输入  4");
	}

	@Override
	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		int t = a.length;
		if (t != 5) {
			System.out.println("你输入的考生信息不完整或者错误 , 无法进行录入操作");
		} else {
			Student s = new Student();
			s.setName(a[0]);
			s.setId(a[1]);
			s.setMathscore(Double.parseDouble(a[2]));
			s.setChinesescore(Double.parseDouble(a[3]));
			s.setEnglishscore(Double.parseDouble(a[4]));
			arrayList.add(s);
		}

	}
	
	void helpSub(){
		System.out.println("成绩查询");
		System.out.println("[1] 最高分输入           1");
		System.out.println("[2] 数学最高分输入    2");
		System.out.println("[3] 语文最高分输入    3");
		System.out.println("[4] 英语最高分输入    4");
		System.out.println("[5] 返回主菜单输入    5");
	}
	@Override
	public void infoStudent(ArrayList<Student> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());
		}
		/*
		 * for (int i = 0; i < arrayList.size(); i++) { Student s =
		 * arrayList.get(i); String string = s.toString();
		 * System.out.println(string); }
		 */
	}

	@Override
	public double max(ArrayList<Student> arrayList, String subject) {
		double max=0;
		return max(arrayList, subject, max);
	}

	private double max(ArrayList<Student> arrayList, String subject, double max) {
		if (null == subject) {
			return max;
		} else {

		}
		if (subject.equals("总成绩")) {
			max = arrayList.get(0).getTotalscore();
			for (int i = 1; i < arrayList.size(); i++) {
				double a = arrayList.get(i).getTotalscore();
				if (a > max) {
					max = a;
				}
			}

		}
		if (subject.equals("数学")) {
			max = arrayList.get(0).getMathscore();
			for (int i = 1; i < arrayList.size(); i++) {
				double a = arrayList.get(i).getMathscore();
				if (a > max) {
					max = a;
				}
			}
		}
		if (subject.equals("语文")) {
			max = arrayList.get(0).getChinesescore();
			for (int i = 1; i < arrayList.size(); i++) {
				double a = arrayList.get(i).getChinesescore();
				if (a > max) {
					max = a;
				}
			}
		}
		if (subject.equals("英语")) {
			max = arrayList.get(0).getEnglishscore();
			for (int i = 1; i < arrayList.size(); i++) {
				double a = arrayList.get(i).getEnglishscore();
				if (a > max) {
					max = a;
				}
			}
		}
		return max;
	}
}
