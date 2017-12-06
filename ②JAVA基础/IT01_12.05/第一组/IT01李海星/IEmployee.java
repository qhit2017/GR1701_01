package Practice130;

import java.util.ArrayList;
import java.util.Scanner;


public interface IEmployee {

	//增加
	void addEmployee(ArrayList<Employee> arrayList,Scanner sc);
	//删除
	void removeEmployee(ArrayList<Employee> arrayList,String name);
	//修改
	void setEmployee(ArrayList<Employee> arrayList,Scanner sc);
	//查询
	Employee findEmployee(ArrayList<Employee> arrayList,String name);
	//遍历
	void infoArrayListEmployee(ArrayList<Employee> arrayList);
}
