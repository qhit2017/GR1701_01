package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月27日 下午4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface ICommodity {
	
	void helpInfo();
	
	void addCommodity(ArrayList<Commodity> arrayList, Scanner sc);

	void stockCommodity(ArrayList<Commodity> arrayList, Scanner sc); 
	
	void sellCommodity(ArrayList<Commodity> arrayList, Scanner sc);
	
	void infoCommodity(ArrayList<Commodity> arrayList);
	
	
	
}
