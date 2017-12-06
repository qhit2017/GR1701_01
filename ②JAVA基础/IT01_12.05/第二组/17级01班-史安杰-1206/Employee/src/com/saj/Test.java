package com.saj;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   ArrayList<Employee>arrayList=new ArrayList<Employee>();
	    Iraa emp=new Iraa();
		emp.help();
		Scanner sc=new Scanner(System.in);
		
		boolean isquit=true;
		
		while (isquit) {
			String key = sc.next();
			String name = sc.next();
		switch (key) {
			
			case "add" :
				emp.addEmployee(arrayList, sc);
				break;
            case "re":
            	
				emp.removeEmployee(arrayList, name);
				break;
           case "set":
				emp.setEmployee(arrayList, sc);
				break;
				
           case "find":
        	   
				emp.findEmployee(arrayList, name);
				break;
				
           case "exit":
				isquit = false;
				break;
			default:
				break;
			}
			
		}
      System.out.println("∞›∞›¡À");
	}

	
}
