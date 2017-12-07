package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

/
public interface IContacts {

	//Ìí¼Ó
	void addContacts(ArrayList<Contacts> arrayList,Scanner sc);
	//±éÀú
	void infoContacts(ArrayList<Contacts> arrayList);
	//²éÑ¯
	ArrayList<Contacts> findBySex(ArrayList<Contacts> arrayList,String sex);
	Contacts findByName(ArrayList<Contacts> arrayList,String name);
	Contacts findByTelnum(ArrayList<Contacts> arrayList,String telnum);
}
