package com.exam;

import java.lang.reflect.Array;
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
	public void addStudent(ArrayList<Student> arraylist, Scanner sc) {
		// 增加一个考生信息
		// 1.从键盘接收一个字符串
		String s = sc.next();
		// 2. 拆分字符串得到Student的成员变量信息
		String[] a = s.split(",");
		int length = a.length;
		if (length != 5) {
			System.out.println("您输入的考生信息不完整，无法接收");
		} else {
			// 3. 实例化或者构造一个考生
			Student student = new Student();
			// 4.给上面的构造的考生设置信息
			student.setName(a[0]);
			student.setId(a[1]);
			student.setChineseScore(Double.parseDouble(a[2]));
			student.setMathScore(Double.parseDouble(a[3]));
			student.setEnglishScore(Double.parseDouble(a[4]));
			// 5. 增加考生信息
			arraylist.add(student);
			//6、输出录入的信息
			System.out.println(student.toString());
            
		}
	}

	// 形式参数
	@Override
	public void infoStudent(ArrayList<Student> arraylist) {

		// 遍历
		//刷新纪录
		for (int i = 0; i < arraylist.size(); i++) {
			// 通过下标获得一个学生
			Student student = arraylist.get(i);
			String string = student.toString();
			System.out.println(string);
		}

	}

	@Override
	public double getMax(ArrayList<Student> arraylist, String subject) {
		double max = 0;
		if (subject.equals("总成绩")) {
			max = arraylist.get(0).getTotleScore();
			for (int i = 0; i < arraylist.size(); i++) {
				if (arraylist.get(i).getTotleScore() > max) {
					max = arraylist.get(i).getTotleScore();
				}

			}
		}
		if (subject.equals("数学")) {
			max = arraylist.get(0).getMathScore();
			for (int i = 0; i < arraylist.size(); i++) {
				if (arraylist.get(i).getMathScore() > max) {
					max = arraylist.get(i).getMathScore();
				}

			}
		}
		if (subject.equals("语文")) {
			max = arraylist.get(0).getChineseScore();
			for (int i = 0; i < arraylist.size(); i++) {
				if (arraylist.get(i).getChineseScore() > max) {
					max = arraylist.get(i).getChineseScore();
				}

			}
		}
		if (subject.equals("英语")) {
			max = arraylist.get(0).getEnglishScore();
			for (int i = 0; i < arraylist.size(); i++) {
				if (arraylist.get(i).getEnglishScore() > max) {
					max = arraylist.get(i).getEnglishScore();
				}

			}
		}
		System.out.println(max);
		return max;
	}

}
