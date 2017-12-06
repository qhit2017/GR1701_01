package whh;

import java.util.ArrayList;
import java.util.Scanner;


public interface IArray {
	//增加
	void addArray(ArrayList<Employee> arrayList,Scanner sc);
	//删除
	void romoveArray(ArrayList<Employee> arrayList,String name);
	//修改
	void setArray(ArrayList<Employee> arrayList,Scanner sc);
	//查找
	Employee findArray(ArrayList<Employee> arrayList,String name);
}
