package xcs;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreIservice implements ISore {
	void helpsubinfo(){
		System.out.println("最高分查询系统");
		System.out.println("[1]总成绩最高分请输入1");
		System.out.println("[2]语文成绩最高分2");
		System.out.println("[3]数学成绩最高分3");
		System.out.println("[4]英语成绩最高分4");
		System.out.println("[5]返回值请输入5");
		
		
	}
	void helpInfo(){
		System.out.println("高考评分系统");
		System.out.println("[1]录入成绩请输入1");
		System.out.println("[2]查询成绩请输入2");
		System.out.println("[3]查询最高分请输入3");
		System.out.println("[4]退出系统请输入4");
		
	}
	
	
	
	
	
	
	
	
	
	//实现类

	public void Student(ArrayList<xcs.Student> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		//增加考生信息
		String s=sc.next();
		//拆分字符串
		String [] a=s.split(",");
		//实例化或者构造一个考生
		int length=a.length;
		if (length !=5){
			System.out.println("你输入的信息不完整或不正确，无法接收");
		}else{Student student =new Student ();
		//给上面构造的考生设置信息
		student.setName(a[0]);
		student.setId(a[1]);
		student.setShuxue(Double.parseDouble(a[2]));
		student.setYuwen(Double.parseDouble(a[3]));
		student.setYingyu(Double.parseDouble(a[4]));
		//增加考信息
		arrayList.add(student);

	}
		}


	@Override
	public void info(java.util.ArrayList<Student> arrayList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayList.size(); i++) {
			Student student = arrayList.get(i);
			String string = student.toString();
			System.out.println(string);
			
		}
		
	}

	@Override
	//比较总成绩的最大值
	public double Max(java.util.ArrayList<xcs.Student> arrayList,String subject) {
		// TODO Auto-generated method stub
		double max=0;
		if (subject.equals("总成绩")) {
			max=arrayList.get(0).getSum();
			for (int i = 0; i < arrayList.size(); i++) {
				max=arrayList.get(i).getSum();
			}
			
		}
		if (subject.equals("数学")) {
			max=arrayList.get(0).getShuxue();
			for (int i = 0; i < arrayList.size(); i++) {
				max=arrayList.get(i).getShuxue();
			}
			
		}
		
		
		return max;

		
	}


	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		
	}


	public void infoStudent(ArrayList<Student> arrayList) {
		// TODO Auto-generated method stub
		
	}


	public void helpSubInfo() {
		// TODO Auto-generated method stub
		
	}


	public void getMax(ArrayList<Student> arrayList, String string) {
		// TODO Auto-generated method stub
		
	}

	
}
