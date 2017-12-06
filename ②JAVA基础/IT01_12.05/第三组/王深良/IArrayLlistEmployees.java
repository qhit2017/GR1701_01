import java.util.ArrayList;
import java.util.Scanner;


public interface IArrayLlistEmployees {
	
	//增加
	boolean addEmployee(ArrayList<Employees> arrayList,Scanner sc);
	//删除
	void removeEmployee(ArrayList<Employees> arrayList,String name);
	//修改
	void setEmployee(ArrayList<Employees> arrayList,Scanner sc);
	//查询
	Employees findEmployee(ArrayList<Employees> arrayList,String name);	
	//遍历
	void infoEmployee(ArrayList<Employees> arrayList);
	
	
	
	
	
	
	
	
}
