import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月29日 上午11:30:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
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
