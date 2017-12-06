package whh;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayService implements IArray {
	public void info() {
		System.out.println("----雇员管理系统帮助信息-----");
		System.out.println("[1]增加雇员请输入Add");
		System.out.println("[2]删除雇员请输入Remove");
		System.out.println("[3]查找雇员请输入Set");
		System.out.println("[4]修改雇员请输入Find");
		System.out.println("[5]退出请输入Exit");
	}

	// 增加
	@Override
	public void addArray(ArrayList<Employee> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		int length = a.length;
		if (length != 5) {
			System.out.println("你输入的信息不完整");
		} else {
			Employee employee = new Employee();
			employee.setId(a[0]);
			employee.setName(a[1]);
			employee.setPrice(Double.parseDouble(a[2]));
			employee.setDate(a[3]);

			employee.setDepartment(a[4]);
			arrayList.add(employee);
			System.out.println(employee.toString());
		}

	}

	// 遍历
	public void infoArrayEmp(ArrayList<Employee> arrayList) {
		String s;
		for (int i = 0; i < arrayList.size(); i++) {
			s = arrayList.get(i).toString();
			System.out.println(s);
		}
	}

	// 删除
	@Override
	public void romoveArray(ArrayList<Employee> arrayList, String name) {
		Employee a;
		a = this.findArray(arrayList, name);
		if (null == a) {
			System.out.println("你要删除的对象不存在");
		} else {
			arrayList.remove(a);
		}
		this.infoArrayEmp(arrayList);
	}

	// 修改
	@Override
	public void setArray(ArrayList<Employee> arrayList, Scanner sc) {
		Employee temp;
		String a = sc.next();
		String[] arr = a.split(",");
		temp = this.findArray(arrayList, arr[0]);
		
		if(null==temp){
			System.out.println("你要修改的对象不存在");
		}else{
			temp.setId(arr[1]);
			temp.setPrice(Double.parseDouble(arr[3]));
			temp.setDepartment(arr[5]);
			
			
		}
		this.infoArrayEmp(arrayList);
	}

	// 查找
	@Override
	public Employee findArray(ArrayList<Employee> arrayList, String name) {
		Employee e = null;
		for (int i = 0; i < arrayList.size(); i++) {
			
			e = arrayList.get(i);
			 String name2 = e.getName();
			
			if (name2.equals(name)) {
				System.out.println(e.toString());
				
				return e ;
			}
		}
		
		return e;

	}
}
