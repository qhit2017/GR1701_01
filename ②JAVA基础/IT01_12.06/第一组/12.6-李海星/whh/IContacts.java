package whh;

import java.util.ArrayList;
import java.util.Scanner;


public interface IContacts {
	void helpInfo();
	void addContacts(ArrayList<Contacts> arrayList,Scanner sc);
	void ergContacts(ArrayList<Contacts> arrayList);
	Contacts nameContacts(ArrayList<Contacts> arrayList, String name);
	ArrayList<Contacts> sexContacts(ArrayList<Contacts> arrayList, String gender);
	Contacts telNumContacts(ArrayList<Contacts> arrayList, String telNum);

}
