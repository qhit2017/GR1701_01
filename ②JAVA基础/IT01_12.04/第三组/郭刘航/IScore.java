package ExamSystem;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IScore {

	//录入
	void addScore(ArrayList<Student> arrayList,Scanner sc);
	
	//遍历
	void infoScore(ArrayList<Student> arrayList);
	
	//查询
	double getMax(ArrayList<Student> arrayList,String subject);
}
