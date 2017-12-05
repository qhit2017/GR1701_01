package whh;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:2421922506@QQ.com
 * @date    创建时间：2017年12月4日 上午8:53:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IScore {
	//增加
	void addStudy(ArrayList<Study>arrayList,Scanner sc);
	void infoStudy(ArrayList<Study>arrayList);
	double maxstudy(ArrayList<Study>arrayList,String subject);

}
