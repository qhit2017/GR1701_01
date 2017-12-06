import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月30日 下午2:36:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Employee implements IArrayLlistEmployees {
	
	public void help() {
		System.out.println("-----雇员管理系统-----");
		System.out.println("(1).添加雇员信息请输入Add：");
		System.out.println("(2).删除雇员信息请输入Remove：");
		System.out.println("(3).修改雇员信息请输入Set：");
		System.out.println("(4).查找雇员信息请输入Find：");		
		System.out.println("(5).查看全部信息请输入Info：");	
		System.out.println("(6).退出系统请输入Exit：");		
	}
	
	public boolean addEmployee(ArrayList<Employees> arrayList, Scanner sc) {
		String s=sc.next();
		String []a = s.split(",");
		
		Employees e =new Employees();
		e.setId(a[0]);
		e.setName(a[1]);
		e.setSalary(Double.parseDouble(a[2]));
		e.setDate(a[3]);
		e.setDepartment(a[4]);
		
		arrayList.add(e);

		return false;
	}

	@Override
	public void removeEmployee(ArrayList<Employees> arrayList,String name) {
		Employees e;
		e= this.findEmployee(arrayList, name);
		
		if (null==e) {
			System.out.println("查无此人，无法删除。");
		}else{
			arrayList.remove(e);
		}

	}

	@Override
	public void setEmployee(ArrayList<Employees> arrayList,Scanner sc) {
		String s=sc.next();
		String []a=s.split(",");
		
		String name=a[0];
		
		Employees e=this.findEmployee(arrayList, name);
		if (null==e) {
			System.out.println("查无此人，无法需改。");
		} else {
			double salary = 0;
			e.setSalary(salary);
		}		
	}

	@Override
	public Employees findEmployee(ArrayList<Employees> arrayList, String name) {
		Employees e ;
		for (int i = 0; i < arrayList.size(); i++) {
			e=arrayList.get(i);
			String eName = e.getName();
			if (eName.equals(name)) {
				return e;
			}
		}
		return null;
	}

	@Override
	public void infoEmployee(ArrayList<Employees> arrayList) {
		for (int i = 0; i <arrayList.size() ; i++) {
			Employees e =arrayList.get(i);
			String s=e.toString();
			System.out.println(s);
		}

	}

}
