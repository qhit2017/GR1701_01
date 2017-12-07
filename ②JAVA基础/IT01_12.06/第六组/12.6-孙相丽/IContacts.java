package com.Addressbook;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Scanner;

public interface IContacts {

	void addContacts(ArrayList<Contacts> arrayList ,Scanner sc);
	void infoContacts(ArrayList<Contacts> arrayList );
	ArrayList<Contacts> findbysex(ArrayList<Contacts> arrayList ,String sex);
	Contacts  findbyname(ArrayList<Contacts> arrayList ,String name);
	Contacts findbytelnumber(ArrayList<Contacts> arrayList ,String telnumber);
	
	
	
}
