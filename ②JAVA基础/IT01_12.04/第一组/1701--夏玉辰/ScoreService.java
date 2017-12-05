package com.examinatiom;

import java.util.ArrayList;
import java.util.Scanner;


public class ScoreService implements IScore {

	
	void helpSubInfo(){
		System.out.println("最高分查询系统");
		System.out.println("[1]总成绩最高分请输入1");
		System.out.println("[2]语文成绩最高分2");
		System.out.println("[3]数学成绩最高分3");
		System.out.println("[4]英语成绩最高分4");
		System.out.println("[5]返回主请输入5");
	}
	void helpInfo(){
		System.out.println("高考评分系统");
		System.out.println("[1]录入成绩请输入1");
		System.out.println("[2]查询成绩请输入2");
		System.out.println("[3]查询最高分请输入3");
		System.out.println("[4]退出系统请输入4");
	}
	@Override
	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		
		String s = sc.next();
		
	
		String[] a = s.split(",");
		int length = a.length;
		if (length!=5) {
			System.out.println("你输入的信息不完整或不正确，无法接收");
		} else {
			
			Student student = new Student();
			
		
			student.setName(a[0]);
			student.setId(a[1]);
			student.setMathScore(Double.parseDouble(a[2]));
			student.setChineseScore(Double.parseDouble(a[3]));
			student.setEnglishScore(Double.parseDouble(a[4]));
			
			
			arrayList.add(student);

			System.out.println(student.toString());
		}
		

	}

	
	@Override
	public void infoStudent(ArrayList<Student> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Student student = arrayList.get(i);
			String string = student.toString();
			System.out.println(string);
		}
	}

	@Override
	public double getMax(ArrayList<Student> arrayList,String subject) {
		
		double max = 0;
	
		if (subject.equals("总成绩")) {
			max = arrayList.get(0).getTotleScore();
			
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getTotleScore()>max) {
					max = arrayList.get(i).getTotleScore();
				}
			}
		}

		if (subject.equals("数学")) {
			max = arrayList.get(0).getMathScore();
			for (int i = 0; i < arrayList.size(); i++) {
				if(arrayList.get(i).getMathScore()>max){
					max = arrayList.get(i).getMathScore();
				}
			}	
		}
		if (subject.equals("英语")) {
			max = arrayList.get(0).getEnglishScore();
			for (int i = 0; i < arrayList.size(); i++) {
				if(arrayList.get(i).getEnglishScore()>max){
					max = arrayList.get(i).getEnglishScore();
				}
			}	
		}
		if (subject.equals("语文")) {
			max = arrayList.get(0).getChineseScore();
			for (int i = 0; i < arrayList.size(); i++) {
				if(arrayList.get(i).getChineseScore()>max){
					max = arrayList.get(i).getChineseScore();
				}
			}	
		}
		System.out.println(max);
		return max;
	}

}
