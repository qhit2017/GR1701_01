package com.yc;

import java.util.ArrayList;
import java.util.Scanner;



public interface IArrayInterface {
	//帮助
	void helpEmployee ();
	
	//增加
	void  addEmployee (ArrayList<Employee> arraylist,Scanner  sc);
	
	//移除
	void removeEmployee (ArrayList<Employee> arraylist,String name);
	
	//修改
	
	void setEmployee  (ArrayList<Employee> arraylist,Scanner sc);
	
	//查找
	
	Employee findEmployee(ArrayList<Employee> arraylist,String name); 

}
