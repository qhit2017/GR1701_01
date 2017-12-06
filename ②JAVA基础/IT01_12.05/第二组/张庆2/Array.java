package zhangqing;

import java.util.ArrayList;
import java.util.Scanner;

public class Array implements Iarray {
	void help(){
		System.out.println("-----HELP-----");
		System.out.println("(1)添加员工信息请输入add");
		System.out.println("（2）打印所有信息请输入all");
		System.out.println("(3)删除员工信息请输入remove");
		System.out.println("(4)修改员工信息请输入set");
		System.out.println("(5)寻找员工信息请输入find");
		System.out.println("(6)退出系统请输入exit");
		
	}

	@Override
	public void addstemp(ArrayList<Emploee> arrayList, Scanner sc) {
		String s=sc.next();
		String []a=s.split(",");
		Emploee n=new Emploee();
		n.setName(a[0]);
		n.setID(a[1]);
		n.setSalary(Double.parseDouble(a[2]));
		n.setDate(a[3]);
		n.setDepartment(a[4]);
		arrayList.add(n);
		System.out.println(n.toString());

	}

	@Override
	public void removestemp(ArrayList<Emploee> arrayList, String name) {
		

	}

	@Override
	public void setstemp(ArrayList<Emploee> arrayList, Emploee name) {
		// TODO Auto-generated method stub

	}

	@Override
	public Emploee findstemp(ArrayList<Emploee> arrayList, String name) {
		Emploee n=new Emploee();
		for (int i = 0; i < arrayList.size(); i++) {
			n=arrayList.get(i);
			String nname=n.getName();
			if(nname.equals(name)){
				return n;
			}
		}
		return n;

	}

	@Override
	public void allEmploee(ArrayList<Emploee> arrayList) {
		for (Emploee emploee : arrayList) {
			System.out.println(emploee.toString());
		}
	}

	@Override
	public void findstemp(ArrayList<Emploee> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		
	}

}
