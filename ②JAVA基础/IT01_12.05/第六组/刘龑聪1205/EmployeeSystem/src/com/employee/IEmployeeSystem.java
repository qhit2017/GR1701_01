package com.employee;

import java.util.ArrayList;
import java.util.Scanner;

/*Author：刘龑聪
  E-mail：15539919713@163.com
 */
public interface IEmployeeSystem {

	//帮助
	void help();
	//增
	void add(ArrayList<Employee> arrayList,Scanner sc);
	//删
	void del(ArrayList<Employee> arrayList,Scanner sc);
	//改
	void set(ArrayList<Employee> arrayList,Scanner sc);
	//查
	void find(ArrayList<Employee> arrayList,Scanner sc);
	//遍历
	void info(ArrayList<Employee> arrayList);
	
}
