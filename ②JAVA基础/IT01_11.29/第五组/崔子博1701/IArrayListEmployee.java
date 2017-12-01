import java.util.ArrayList;


public interface IArrayListEmployee {
	//增加
	boolean addEmployee(ArrayList<Employee>arraylist,Employee e);
	//删除
	void removeEmployee(ArrayList<Employee>arrayList,Employee e);
	//修改
	void setEmployee(ArrayList<Employee>arrayList,Employee e);
	//查询
	Employee findEmployee(ArrayList<Employee>arrayList,String name);
    //遍历
	void infoArraylistEmployee(ArrayList<Employee>arrayList);
	
	

}
