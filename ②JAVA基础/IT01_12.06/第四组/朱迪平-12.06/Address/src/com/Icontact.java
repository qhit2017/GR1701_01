package com;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:271406@163.com
 * @date    创建时间：2017年12月6日 上午8:33:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public interface Icontact {
	 void addContact(ArrayList<Contact> arrayList,Scanner sc);
     void infoContact(ArrayList<Contact> arrayList);
     ArrayList<Contact> findBySex(ArrayList<Contact> arrayList,String sex);
     Contact findByName(ArrayList<Contact> arrayList,String name);
     Contact findByNum(ArrayList<Contact> arrayList,String telNum);
     void infoHelp();
}
