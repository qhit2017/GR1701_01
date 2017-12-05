package com.exam;

import java.util.ArrayList;
import java.util.Scanner;

public interface IScore {
	// 录入，增加
	// 返回值 方法名 （参数列表）；
	// 完成特定功能的代码块
	void addStudent(ArrayList<Student> arraylist, Scanner sc);

	// 显示所有考生信息
	// 返回值 方法名 （参数列表）；
	// 完成特定功能的代码块
	void infoStudent(ArrayList<Student> arraylist);

	// 返回最大值
	// 返回值 方法名 （参数列表）；
	// 完成特定功能的代码块
	double getMax(ArrayList<Student> arraylist,String subject);

}
