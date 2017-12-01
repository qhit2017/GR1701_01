package com.saj;

import java.util.ArrayList;

public interface ArrayListTestL {
	
	//增加
	boolean addArrayEmployee(ArrayList<Employee> arrayList,Employee e);
	//修改
	void setArrayEmployee(ArrayList<Employee> arrayList,Employee e);
    //删除
	void removeArrayEmployee(ArrayList<Employee> arrayList,Employee e);
    //查找
	Employee findArrayEmployee(ArrayList<Employee> arrayList,String name);
	//遍历
	void infoArrayListEmployee(ArrayList<Employee> arrayList);
	
}
