package com.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSystem implements IEmployeeSystem {

	@Override
	public void help() {
		System.out.println("-----雇员管理系统-----"
						+"\n<1>添加雇员信息请输入Add"
						+"\n<2>查找一位雇员信息请输入Find"
						+"\n<3>查看全部雇员信息请输入Info"
						+"\n<4>修改雇员信息请输入Set"
						+"\n<5>删除雇员信息请输入Del"
						+"\n<6>再次查看帮助信息请输入Help"
						+"\n<7>退出系统请输入Exit");
	}

	@Override
	public void add(ArrayList<Employee> arrayList, Scanner sc) {
		System.out.println("请输入要添加的雇员信息"
						+"\n格式：编号,姓名,薪水,入职日期,部门"
						+"\n注：中间以   逗号, 隔开");
		boolean l = true;
		while (l) {
			String[] s = sc.next().split(",");
			if (s.length!=5) {
				System.out.println("无法添加，请核实信息及格式重新输入！");
			}else {
				arrayList.add(new Employee(s[0], s[1], Double.parseDouble(s[2]), s[3], s[4]));
				System.out.println("添加成功！");
				l = false;
			}
		}
	}

	@Override
	public void find(ArrayList<Employee> arrayList, Scanner sc) {
		System.out.println("请输入姓名！");
		String name = sc.next();
		boolean s = false;
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getName().equals(name)) {
				System.out.println(arrayList.get(i).toString());
				break;
			}else {
				s = true;
			}
		}
		if (s) {
			System.out.println("查无此人！");
		}
	}
	
	@Override
	public void info(ArrayList<Employee> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());
		}
	}
	
	@Override
	public void set(ArrayList<Employee> arrayList, Scanner sc) {
		System.out.println("请输入姓名！");
		String name = sc.next();
		boolean s = false;
		int i;
		for (i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getName().equals(name)) {
				break;
			}else {
				s = true;
			}
		}
		if (s) {
			System.out.println("查无此人！");
		}else {
			System.out.println("请输入要修改为的雇员信息"
					+"\n格式：编号,姓名,薪水,入职日期,部门"
					+"\n注：中间以   逗号, 隔开");
			boolean b = true;
			while (b) {
				String[] a = sc.next().split(",");
				if (a.length!=5) {
					System.out.println("修改失败，请核实信息及格式重新输入！");
				}else {
					arrayList.set(i, new Employee(a[0], a[1], Double.parseDouble(a[2]), a[3], a[4]));
					System.out.println("修改成功！");
					b = false;
				}
			}
		}
	}
	
	@Override
	public void del(ArrayList<Employee> arrayList, Scanner sc) {
		System.out.println("请输入姓名！");
		String name = sc.next();
		boolean s = false;
		int i;
		for (i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getName().equals(name)) {
				arrayList.remove(i);
				System.out.println("删除成功！");
				break;
			}else {
				s = true;
			}
		}
		if (s) {
			System.out.println("查无此人！");
		}
	}

}
