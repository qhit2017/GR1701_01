package Practice1130;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class IEmployeeTest implements IEmployee {
	
	public void info() {
		System.out.println("----雇员管理系统帮助信息-----");
		System.out.println("[1]增加雇员请输入Add");
		System.out.println("[2]删除雇员请输入Remove");
		System.out.println("[3]查找雇员请输入Set");
		System.out.println("[4]修改雇员请输入Find");
		System.out.println("[5]退出请输入Quit");
	}

	@Override
	public void addEmployee(ArrayList<Employee> arrayList, Scanner sc) {String s = sc.next();
	String[] a = s.split(",");
	int length = a.length;
	if (length != 5) {
		System.out.println("你输入的信息不完整");
	} else {
		Employee employee = new Employee();
		employee.setId(a[0]);
		employee.setName(a[1]);
		employee.setSalary(Double.parseDouble(a[2]));
		employee.setDate(a[3]);

		employee.setDepartment(a[4]);
		arrayList.add(employee);
		System.out.println(employee.toString());
	}

}
	@Override
	public void removeEmployee(ArrayList<Employee> arrayList, String name) {
		Employee o;
		o = this.findEmployee(arrayList, name);
		
		if (null == o) {
			System.out.println("查无此人！！！！");
		} else {
			arrayList.remove(o);
		}

	}

	@Override
	public void setEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		Employee temp;
		String a = sc.next();
		String[] arr = a.split(",");
		temp = this.findEmployee(arrayList, arr[0]);
		
		if(null==temp){
			System.out.println("你要修改的对象不存在");
		}else{
			temp.setId(arr[1]);
			temp.setSalary((Double.parseDouble(arr[3])));
			temp.setDepartment(arr[5]);
			
			
		}
		this.infoArrayListEmployee(arrayList);
		
		

	}

	@Override
	public Employee findEmployee(ArrayList<Employee> arrayList, String name) {
		Employee o = null;
		for (int i = 0; i < arrayList.size(); i++) {
			o = arrayList.get(i);
			String oName = o.getName();
			
			if (oName.equals(oName)) {
				return o;
			}
		}
		return o;
	}

	@Override
	public void infoArrayListEmployee(ArrayList<Employee> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Employee e = arrayList.get(i);
			String q =e.toString();
			System.out.println(q);
		}

	}

}
