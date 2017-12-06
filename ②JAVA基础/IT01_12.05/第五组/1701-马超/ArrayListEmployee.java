package com.machao;

import java.util.ArrayList;
import java.util.Scanner;



public class ArrayListEmployee implements IArrayInterface {
	

	
	@Override
	public void helpEmployee() {
		System.out.println("-----雇员管理系统------");
		System.out.println("查找雇员信息请输入：find");
		System.out.println("添加雇员信息请输入：add");
		System.out.println("要删除雇员信息请输入：remove");
		System.out.println("如需修改雇员信息请输入：set");
		System.out.println("退出请输入:Quit");
		}

	
	@Override
	public void addEmployee(ArrayList<Employee> arraylist,  Scanner sc ) {
		String s = sc.next();
		String arrs[] = s.split(",");
		Employee e =new Employee(arrs[0], arrs[1], Double.parseDouble(arrs[2]) , arrs[3], arrs[4]);
		arraylist.add(e);
		this.infoArraylistEmployee(arraylist);
		
		
	}

	
	@Override
	public void removeEmployee(ArrayList<Employee> arraylist,String name) {
		
		Employee m ;
	  m = this.findEmployee(arraylist, name);
		
		if (m==null) {
			System.out.println("你所要删除的信息未找到！");
		} else {
			arraylist.remove(m);

		}
		
		this.infoArraylistEmployee(arraylist);
		
	
	@Override
	public void setEmployee(ArrayList<Employee> arraylist, Scanner sc) {
		Employee temp ;
		String s = sc.next();
		String[] arrs = s.split(",");
		temp =this.findEmployee(arraylist,arrs[0]);
		
		if (temp ==null ) {
			System.out.println("你输入的信息不完整,无法查找!");
			
		} else {
			temp.setId(arrs[1]);
			temp.setPrice(Double.parseDouble(arrs[3]));
			temp.setDepartment(arrs[5]);

		}
		this.infoArraylistEmployee(arraylist);
	}

	
	@Override
	public Employee findEmployee(ArrayList<Employee> arraylist,String name) {
		Employee a = null;
		
		for (int i = 0; i <arraylist.size(); i++) {
			//boolean isEqual = false; 
			a = arraylist.get(i);
			String aName =a.getName();
			//isEqual =aName.equals(name);
			if (aName.equals(name)) {
				return a;
			}
			
		}
		this.infoArraylistEmployee(arraylist);
		return a;
		
		
	}
	
	
	public void infoArraylistEmployee(ArrayList<Employee> arraylist){
		for (int i = 0; i <arraylist.size(); i++) {
			System.out.println(arraylist.get(i).toString());
		}
		
	}

	

}
