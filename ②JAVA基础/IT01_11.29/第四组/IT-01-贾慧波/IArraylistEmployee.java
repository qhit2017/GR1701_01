package arraylisttest;

import java.util.ArrayList;


public interface IArraylistEmployee {

	//增
	Employee addEmployee(ArrayList<Employee> employee,Employee e);
	//删
	void removeEmployee(ArrayList<Employee> employee,Employee e);
	//改
	void setEmployee(ArrayList<Employee> employee,Employee e);
	//查
	Employee findEmployee(ArrayList<Employee> employee,String name);
	//遍历
	void ArrayListEmployee(ArrayList<Employee> employee);
	
}
