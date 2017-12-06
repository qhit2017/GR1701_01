package com.machao;

import java.util.ArrayList;
import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		
		ArrayList<Employee> arraylist = new ArrayList<Employee>();
		
		Scanner sc = new Scanner(System.in);
		
		ArrayListEmployee  t = new ArrayListEmployee();
		
		boolean isQuat = true;
		String s;
		t.helpEmployee();
       
		
		while (isEquat) {
			s = sc.next();
			
			
			
			switch (s) {
			case "find":
				System.out.println("请输入您要查找的雇员姓名：");
				String eName = sc.next();
				System.out.print("您要查找的雇员信息为：");
				String s1 = t.findEmployee(arraylist, eName).toString();
				System.out.println(s1);
				break;
			case "add":
				System.out.println("请输入您要填加的雇员信息");
				
				 t.addEmployee(arraylist, sc);
				break;
			case "remove":
				System.out.println("请输入您要删除的雇员姓名");
				String m = sc.next();
				t.removeEmployee(arraylist, m);
				break;
			case "set":
				System.out.println("请输入您要修改的雇员姓名:");
				System.out.println("修改格式如下，每个信息用,号隔开：(name, id,name, price, date, department )");
				t.setEmployee(arraylist, sc);
				
				break;


			case "Quit":
				isQuat = false;
			
				break;

			



			default:
				break;
			}
			
		}
		System.out.println("感谢使用,再见");
	}
}