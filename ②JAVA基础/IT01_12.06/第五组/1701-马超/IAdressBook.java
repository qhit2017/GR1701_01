package machao;

package com.adress;

import java.util.ArrayList;
import java.util.Scanner;


public interface IAdressBook {

	void helpInfo();
	void addContacts(ArrayList<Contacts> arrayList,Scanner sc);

	void infoContacts(ArrayList<Contacts> arrayList);

	Contacts findByname(ArrayList<Contacts> arrayList,String name);

	ArrayList<Contacts> findBysex(ArrayList<Contacts> arrayList,String sex);

	Contacts findBynum(ArrayList<Contacts> arrayList,String telnum);
	
}
