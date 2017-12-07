package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public interface Iaddress {
	void helpInfo();
	void addContacts(ArrayList<Address> arrayList,Scanner sc);
	void ergContacts(ArrayList<Address> arrayList);
	Address nameContacts(ArrayList<Address> arrayList, String name);
	ArrayList<Address> sexContacts(ArrayList<Address> arrayList, String gender);
	Address telNumContacts(ArrayList<Address> arrayList, String telnum);

}
