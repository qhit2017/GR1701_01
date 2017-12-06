package com.saj;

import java.util.ArrayList;
import java.util.Scanner;

public class Iraa implements Interfaces {

	void help() {
		System.out.println("------雇员管理系统-----");
		System.out.println("增加，请输入add");
		System.out.println("删除，请输入re");
		System.out.println("修改，请输入set");
		System.out.println("查找，请输入find");
		System.out.println("遍历，请输入info");
		System.out.println("退出系统，请输入exit");

	}

	@Override
	public void addEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String s = sc.next();

		String[] a = s.split(",");
		Employee e = new Employee();
		e.setName(a[0]);
		e.setId(a[1]);
		e.setSalary(Double.parseDouble(a[3]));
		e.setDate(a[4]);
		e.setDepartment(a[5]);
		arrayList.add(e);
		this.infoArraylistEmployee(arrayList);

	}

	@Override
	public void removeEmployee(ArrayList<Employee> arrayList, String name) {
		Employee temp;

		temp = this.findEmployee(arrayList, name);
		if (temp == null) {
			System.out.println("您要删除的对象不存在");
		} else {
			arrayList.remove(temp);
		}
		this.infoArraylistEmployee(arrayList);
	}

	@Override
	public void setEmployee(ArrayList<Employee> arrayList, Scanner sc) {

		Employee e;
		String name = "";
		e = this.findEmployee(arrayList, name);
		if (null == e) {
			System.out.println("您修改的对象不存在，请重新输入");
		} else {
			int i = arrayList.indexOf(e);
			arrayList.set(i, e);
		}
		this.infoArraylistEmployee(arrayList);
	}

	@Override
	public Employee findEmployee(ArrayList<Employee> arrayList, String name) {
		// TODO Auto-generated method stub
		Employee e = null;
		for (int i = 0; i < arrayList.size(); i++) {
			e = arrayList.get(i);
			String eNme = e.getName();
			if (eNme.equals(0)) {
				System.out.println("您查找的对象不存在，请重新输入");

			} else {
				System.out.println(e.toString());
			}
			this.infoArraylistEmployee(arrayList);
		}
		return null;

	}

	@Override
	public void infoArraylistEmployee(ArrayList<Employee> arrayList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayList.size(); i++) {
			Employee emp = arrayList.get(i);
			String s = emp.toString();
			System.out.println(s);

		}

	}

}
