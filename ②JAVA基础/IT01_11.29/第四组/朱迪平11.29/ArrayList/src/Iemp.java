import java.util.ArrayList;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月29日 上午11:30:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public interface Iemp {
boolean addEmployee(ArrayList<Employee> arrayList,Employee e);
void  removeEmployee(ArrayList<Employee> arrayList,Employee e);
void setEmoloyee(ArrayList<Employee> arrayList,Employee e);
Employee findEmployee(ArrayList<Employee> arrayList,String name);	
void infoArrayLiseEmployee(ArrayList<Employee> arrayList);

}
