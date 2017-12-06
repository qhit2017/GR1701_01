package whh;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:2421922506@QQ.com
 * @date    创建时间：2017年12月5日 下午8:31:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
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
