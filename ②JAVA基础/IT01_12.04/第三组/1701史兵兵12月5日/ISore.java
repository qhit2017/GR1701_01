package xcs;

import java.util.ArrayList;
import java.util.Scanner;

public interface ISore {
	//接口
	//录入，增加
	//返回值，方法名（参数列表）；
	//完成特定功能的代码块
	void Student(ArrayList<Student>arrayList,Scanner sc);
	//录入，增加
		//返回值，方法名（参数列表）；
		//完成特定功能的代码块
	void info(ArrayList<Student>arrayList);
	double Max(ArrayList<Student>arrayList,String subject);
	

}
