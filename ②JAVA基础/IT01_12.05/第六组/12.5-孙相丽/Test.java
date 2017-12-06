package com.sxl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Employee>arrayList=new ArrayList<Employee>();
		ArrayListEmployee Employee=new ArrayListEmployee();
		boolean isQuit=true;
		String key ;
		Scanner sc =new Scanner(System.in);
		Employee.helpinfo();
		while (isQuit) {
			key=sc.next();
			switch (key) {
			case "Add":
				
				break;
	        case "Remove":
				
				break;
				
	        case "Set":
				
				break;	
            case "Find":
				
				break;
				
	        case "Quit":
				isQuit=false;
				break;	
				
				
				
			default:
				break;
			}
		}
          System.out.println("再见了，我的朋友");
          sc.close();
	}

}
