package com.gzz;


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
public interface IContacts {
	//录入
	void addContacts(ArrayList<Contacts> arrayList,Scanner sc);
	//
	void infoContacts(ArrayList<Contacts> arrayList);
	//搜索
	ArrayList<Contacts> findBysex(ArrayList<Contacts> arrayList,String sex);
	
	Contacts findByname(ArrayList<Contacts> arrayList,String name);

	Contacts findBytelNum(ArrayList<Contacts> arrayList,String telNum);
	
	

}
