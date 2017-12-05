package com.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreService implements IScore {
	void helpsubInfo(){
		System.out.println("最高分查询系统");
		System.out.println("[1]总成绩最高分请输入1");
		System.out.println("[2]语文成绩最高分请输入2");
		System.out.println("[3]数学成绩最高分请输入3");
		System.out.println("[4]英语成绩最高分请输入4");
		System.out.println("[5]返回主菜单请按5");
	}
	void helpInfo(){
		System.out.println("高考评分系统");
		System.out.println("[1]录入成绩请输入1");
		System.out.println("[2]查询成绩请输入2");
		System.out.println("[3]查询最高分请输入3");
		System.out.println("[4]退出系统请按4");
		
	}

	@Override
	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		String s=sc.next();
		String[]a=s.split(",");
		int length=a.length;
		if (length!=5) {
			System.out.println("您输入的信息有误或不完整，请重新输入");
		} else {

		Student student =new Student();
		student.setName(a[0]);
		student.setId(a[1]);
		student.setMathScore(Double.parseDouble(a[2]));
		student.setCheseScore(Double.parseDouble(a[3]));
		student.setEnglishScore(Double.parseDouble(a[4]));

		arrayList.add(student);
		}
	}

	@Override
	public void infoStudent(ArrayList<Student> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Student student = arrayList.get(i);
			String string = student.toString();
		}

	}

	@Override
	public double getMax(ArrayList<Student> arrayList,String subject) {
		double max=0;
		if(subject.equals("总成绩")){
			max=arrayList.get(0).getSumScore();
			for (int i = 1; i < arrayList.size(); i++) {
				if(arrayList.get(i).getSumScore()>max){
					max=arrayList.get(i).getSumScore();
				}
			}
		}
		if(subject.equals("语文")){
			max=arrayList.get(0).getCheseScore();
			for (int i = 1; i < arrayList.size(); i++) {
				if(arrayList.get(i).getCheseScore()>max){
					max=arrayList.get(i).getCheseScore();
				}
			}
		}
		
		return max;
	}

	public void helpSubInfo() {
		// TODO Auto-generated method stub
		
	}

}
