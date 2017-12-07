package com.jkl;

import java.util.ArrayList;
import java.util.Scanner;


public interface IContacts {

	void infoContacts(ArrayList<Contacts>arrayList);
	ArrayList<Contacts>findBysex(ArrayList<Contacts>arrayList,String sex);
	Contacts findByname(ArrayList<Contacts>arrayList,String name);
	Contacts findBynum(ArrayList<Contacts>arrayList,String telnum);
	void addContacts(ArrayList<Contacts> arrayList, Scanner sc);
	
	
}
