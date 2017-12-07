package com.;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:271406@163.com
 * @date    创建时间：2017年11月28日 上午10:18:02 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

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
