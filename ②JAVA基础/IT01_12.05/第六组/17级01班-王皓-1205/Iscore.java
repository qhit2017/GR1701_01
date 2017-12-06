package com.wh;

import java.util.ArrayList;
import java.util.Scanner;

public class Iscore implements Interfaces {
	
	void helpsubinfo(){
		System.out.println("------最高分评分系统------");
		System.out.println("总成绩最高分，请输入1");
		System.out.println("数学成绩最高分，请输入2");
		System.out.println("英语成绩最高分，请输入3");
		System.out.println("语文成绩最高分，请输入4");
		System.out.println("返回主菜单，请输入5");
	}
	void helpinfo(){
		System.out.println("-----高考评分系统-----");
		System.out.println("录入成绩，请输入1");
		System.out.println("查询成绩，请输入2");
		System.out.println("查询最高分，请输入3");
		System.out.println("退出系统，请输入4");
	}

	@Override
	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String s = sc.next();
		String[] a = s.split(",");
		int legth = a.length;
		if (legth != 5) {
			System.out.println("你输入的信息不正确或是不完整，请重新输入");
		} else {
			Student student = new Student();
			student.setName(a[0]);
			student.setId(a[1]);
			student.setMathscore(Double.parseDouble(a[2]));
			student.setEnglishscore(Double.parseDouble(a[3]));
			student.setLanguagescore(Double.parseDouble(a[4]));

			arrayList.add(student);
			System.out.println(student.toString());

		}
	}

	@Override
	public void infoStudent(ArrayList<Student> arrayList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayList.size(); i++) {
			Student student = arrayList.get(i);
			String string = student.toString();
			System.out.println(string);

		}

	}

	@Override
	public double getMax(ArrayList<Student> arrayList, String subject) {
		// TODO Auto-generated method stub
		double max = 0;
		if (subject.equals("总成绩")) {
			max = arrayList.get(0).getAlwaysscore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getAlwaysscore() > max) {
					max = arrayList.get(i).getAlwaysscore();
				}
			}
		}

		if (subject.equals("语文")) {
			max = arrayList.get(0).getLanguagescore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getLanguagescore() > max) {
					max = arrayList.get(i).getLanguagescore();
				}
			}
		}

		if (subject.equals("数学")) {
			max = arrayList.get(0).getMathscore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMathscore() > max) {
					max = arrayList.get(i).getMathscore();
				}
			}
		}

		if (subject.equals("英语")) {
			max = arrayList.get(0).getEnglishscore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglishscore() > max) {
					max = arrayList.get(i).getEnglishscore();
				}
			}
		}
		System.out.println(max);
		return max;
	}

}
