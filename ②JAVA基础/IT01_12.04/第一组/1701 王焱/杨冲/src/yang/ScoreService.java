package com;

import java.util.ArrayList;
import java.util.Scanner;

import javax.security.auth.Subject;

public class ScoreService implements Score {
	void subHelp(){
	System.out.println(",,子菜单帮助,,");	
	System.out.println("总分1");
	System.out.println("数学2");
	System.out.println("语文3");
	System.out.println("英语4");
	System.out.println("回主菜单5");
	}
	void help(){
		System.out.println("帮助");
		System.out.println("录入成绩按1");
		System.out.println("显示按2");
		System.out.println("最高分按3");
		System.out.println("退出按4");
	}

	@Override
	public void addStudent(ArrayList<Student> arraylist, Scanner sc) {
		String s=sc.next();
		String[]a=s.split(",");
		
	Student student=new Student();
	int length=a.length;
	if (a.length!=5) {
		System.out.println("不合要求,重输");
	}else{
	student.setName(a[0]);
    student.setId(a[1]);
    student.setChinase(Double.parseDouble(a[2]));
    student.setMath(Double.parseDouble(a[3]));
    student.setEnglish(Double.parseDouble(a[4]));
    arraylist.add(student);}
	}

	@Override
	public void info(ArrayList<Student> arraylist) {
		for (int i = 0; i <arraylist.size(); i++) {
			Student student = arraylist.get(i);
	             String string = student.toString();
	             System.out.println(string);
		}

	}

	@Override
	public double getMax(ArrayList<Student> arraylist, String subject) {
	double max=0;
	if (subject.equals("总分")) {
		
	
	max=arraylist.get(0).getTotal();
	for (int i = 0; i <arraylist.size(); i++) {
		
		if (arraylist.get(i).getTotal()>max) {
			max=arraylist.get(i).getTotal();
			
		}
	}
	}if (subject.equals("数学")) {
		
	
	max=arraylist.get(0).getMath();
	for (int i = 0; i <arraylist.size(); i++) {
		
		if (arraylist.get(i).getMath()>max) {
			max=arraylist.get(i).getMath();
			
		}
	}
	}if (subject.equals("语文")) {
		
	
	max=arraylist.get(0).getChinase();
	for (int i = 0; i <arraylist.size(); i++) {
		
		if (arraylist.get(i).getChinase()>max) {
			max=arraylist.get(i).getChinase();
			
		}
	}
	}if (subject.equals("英语")) {
		
	
	max=arraylist.get(0).getEnglish();
	for (int i = 0; i <arraylist.size(); i++) {
		
		if (arraylist.get(i).getEnglish()>max) {
			max=arraylist.get(i).getEnglish();
			
		}
	}
	}System.out.println(max);
	
	return max;
	}

}
