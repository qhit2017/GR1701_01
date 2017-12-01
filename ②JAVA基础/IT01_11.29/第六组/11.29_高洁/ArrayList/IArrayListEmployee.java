package com.gaojie.qhit01;

import java.util.ArrayList;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年11月29日 下午3:50:46
 */
public interface IArrayListEmployee {

	//增加
	boolean addEmployee(ArrayList<Employee>arrayList,Employee e);
	//删除
	void removeEmployee(ArrayList<Employee>arrayList,Employee e);
	//修改
	boolean setEmployee(ArrayList<Employee>arrayList,Employee e);
	//查询
	boolean findEmployee(ArrayList<Employee>arrayList,Employee e);
	//遍历
	boolean infoArrayListEmployee(ArrayList<Employee>arrayList);
	
	
}
