import java.util.ArrayList;
import java.util.Scanner;


//实现类
public class EmployeeArrsyList implements IArrayListEmployee {
	
	void helpInfo(){
		System.out.println("-----雇员管理系统帮助信息-----");
		System.out.println("[1]增加雇员请输入Add");
		System.out.println("[2]删除雇员信息请输入Remove");
		System.out.println("[3]退出系统请输入Set");
		System.out.println("[4]退出系统请输入Exit");
	}
	
	@Override
	public boolean addEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		//第一步，接收一条雇员信息并拆分
		String s = sc.next();
		String[] a = s.split(",");
		
		//第二步，通过第一步输入的内容构建一个雇员对象
		Employee e = new Employee();
		e.setId(a[0]);
		e.setName(a[1]);
		e.setSalary(Double.parseDouble(a[2]));
		e.setDate(a[3]);
		e.setDepartment(a[4]);
		
		//第三步，添加雇员对象到arrayList.
		arrayList.add(e);
		
		return true;
	}

	@Override
	public void removeEmployee(ArrayList<Employee> arrayList, String name) {
		//先找
		Employee e;
		e = findEmployee(arrayList, name);
		
		//判断该员工是否在列表里，若在，则删除
		if (null == e) {
			System.out.println("查无此人，无法删除");
		} else {
			arrayList.remove(e);
		}
		 
		//删除之后遍历检查一下
		infoArrayListEmployee(arrayList);
		
	}

	@Override
	public void setEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		
		Employee e;
		//接收信息
		String s = sc.next();
		//拆分一个字符串数组
		String[] a = s.split(",");
		double salary = Double.parseDouble(a[3]);
		String name = a[0];
		e = this.findEmployee(arrayList, name);
		
		if (null==e) {
			System.out.println("查无此人，无法修改");
		} else {
			e.setSalary(salary);
			String department = a[5];
			e.setDepartment(department );
		}
		infoArrayListEmployee(arrayList);
	}

	@Override
	public Employee findEmployee(ArrayList<Employee> arrayList, String name) {
		Employee e;
		//1、循环遍历
		for (int i = 0; i < arrayList.size(); i++) {
			
			e = arrayList.get(i);
			String eName = e.getName();
			//判断名字是否一致，若一致，就找到了该对象，返回该对象
			if (eName.equals(name)) {
				return e;
			}
			
		}
		System.out.println("查无此人！！！");
		return null;
	}

	@Override
	public void infoArrayListEmployee(ArrayList<Employee> arrayList) {
		//遍历，查找所有
		for (int i = 0; i < arrayList.size(); i++) {
			Employee e = arrayList.get(i);
			String s = e.toString();
			System.out.println(s);
		}
	}

}
