package com.employee;

import java.util.ArrayList;
import java.util.Scanner;

/*Author：刘龑聪
  E-mail：15539919713@163.com
 */
public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		EmployeeSystem es = new EmployeeSystem();
		
		es.help();
		boolean isExit = true;
		while (isExit) {
			System.out.println("请输入指令，并按Enter键！");
			String k = sc.next();
			switch (k) {
			
			case "Add":
				es.add(arrayList, sc);
				break;
				
			case "Info":
				es.info(arrayList);
				break;
				
			case "Find":
				es.find(arrayList, sc);
				break;
				
			case "Set":
				es.set(arrayList, sc);
				break;
				
			case "Del":
				es.del(arrayList, sc);
				break;
				
			case "Help":
				es.help();
				break;
				
			case "Exit":
				isExit = false;
				break;
				
			default:
				System.out.println("请输入正确的指令！");
				break;
			}
		}
		System.out.println("谢谢使用，再见！");
	}

}
