package Practice1130;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
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
