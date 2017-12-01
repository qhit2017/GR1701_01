package Practice_1129;

import java.util.ArrayList;

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
	boolean addEmployee(ArrayList<Employee> arrayList,Employee e);
	//删除
	void removeEmployee(ArrayList<Employee> arrayList,Employee e);
	//修改
	void setEmployee(ArrayList<Employee> arrayList,Employee e);
	//查询
	Employee findEmployee(ArrayList<Employee> arrayList,String name);
	//遍历
	void infoArrayListEmployee(ArrayList<Employee> arrayList);
}
