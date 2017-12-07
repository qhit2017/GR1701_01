package AddressBook;

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
public interface IContacts {

	//添加
	void addContacts(ArrayList<Contacts> arrayList,Scanner sc);
	//遍历
	void infoContacts(ArrayList<Contacts> arrayList);
	//查询
	ArrayList<Contacts> findBySex(ArrayList<Contacts> arrayList,String sex);
	Contacts findByName(ArrayList<Contacts> arrayList,String name);
	Contacts findByTelnum(ArrayList<Contacts> arrayList,String telnum);
}
