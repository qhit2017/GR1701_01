package com.machao;

import java.util.ArrayList;
import java.util.Scanner;


public interface IArrayInterface {
	
	void helpEmployee ();
	
	
	void  addEmployee (ArrayList<Employee> arraylist,Scanner  sc);
	
	
	void removeEmployee (ArrayList<Employee> arraylist,String name);
	
	
	
	void setEmployee  (ArrayList<Employee> arraylist,Scanner sc);
	
	
	
	Employee findEmployee(ArrayList<Employee> arraylist,String name); 

}
