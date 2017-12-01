package arraylisttest;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistEmpliyee extends Employee implements IArraylistEmployee {

	Scanner sc = new Scanner(System.in);
	@Override
	public Employee addEmployee(ArrayList<Employee> employee, Employee e) {

		System.out.println("请输入员工编号：");
		e.setId(sc.next());
		System.out.println("请输入员工姓名：");
		e.setName(sc.next());
		System.out.println("请输入员工薪水：");
		e.setSalary(sc.nextDouble());
		System.out.println("请输入入职日期：");
		e.setDate(sc.next());
		System.out.println("请输入现任部门：");
		e.setdepartment(sc.next());
		
		return e;

	}

	@Override
	public void removeEmployee(ArrayList<Employee> employee, Employee e) {


	}

	@Override
	public void setEmployee(ArrayList<Employee> employee, Employee e) {


	}

	@Override
	public Employee findEmployee(ArrayList<Employee> employee, String name) {

		return null;
	}

	@Override
	public void ArrayListEmployee(ArrayList<Employee> employee) {
		for (int i = 0; i < employee.size(); i++) {
			
			System.out.println(employee.toString());
		}
			System.out.println();
	}

}
