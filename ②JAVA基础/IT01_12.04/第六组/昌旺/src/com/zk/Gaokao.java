/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月4日 下午8:18:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package com.zk;

import java.util.ArrayList;
import java.util.Scanner;

public interface Gaokao {
	void addkaoshi(ArrayList<Kaoshi>arrayList,Scanner sc);
	void inforkaoshi(ArrayList<Kaoshi>arrayList);
	void maxkaoshi(ArrayList<Kaoshi>arrayList,String subject);
	

}
