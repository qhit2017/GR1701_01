package whh;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:2421922506@QQ.com
 * @date    创建时间：2017年12月6日 上午8:32:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IContacts {
	void helpInfo();
	void addContacts(ArrayList<Contacts> arrayList,Scanner sc);
	void ergContacts(ArrayList<Contacts> arrayList);
	Contacts nameContacts(ArrayList<Contacts> arrayList, String name);
	ArrayList<Contacts> sexContacts(ArrayList<Contacts> arrayList, String gender);
	Contacts telNumContacts(ArrayList<Contacts> arrayList, String telNum);

}
