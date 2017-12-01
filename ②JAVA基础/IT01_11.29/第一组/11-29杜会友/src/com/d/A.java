package com.d;

import java.util.ArrayList;
import java.util.Arrays;

public interface A {
	//增加
	boolean addEmployee(ArrayList<Employee>arrayList,Employee e);
		//删除
	void removeEmployee(ArrayList<Employee>arrayList,Employee e);
		//修改
	void setEmployee(ArrayList<Employee>arrayList,Employee e);
		//查询
	Employee sindEmployee(ArrayList<Employee>arrayList,Employee e);
}
