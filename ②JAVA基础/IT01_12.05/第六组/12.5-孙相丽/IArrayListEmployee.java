package com.sxl;

import java.util.ArrayList;
import java.util.Scanner;

public interface IArrayListEmployee {
 
   void infoArrayListEmployee(ArrayList<Employee>arraylist);
   void addEmployee(ArrayList<Employee>arrayList,Scanner sc);
   void removeEmployee(ArrayList<Employee>arrayList,String name);
   void setEmployee(ArrayList<Employee>arrayList,String name);
   void findEmployee(ArrayList<Employee>arrayList,Scanner sc);
	
}
