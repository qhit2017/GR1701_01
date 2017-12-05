package com.examination;

import java.util.ArrayList;
import java.util.Scanner;

public interface IScore {

	//录入
	void addStudent(ArrayList<Student> arrayList, Scanner sc);
	
	//显示所有考生信息
	void infoStudent(ArrayList<Student> arrayList);
	
	//最大值
	double max(ArrayList<Student> arrayList,String subject);
}
