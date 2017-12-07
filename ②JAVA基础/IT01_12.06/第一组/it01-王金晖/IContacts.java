package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContacts {

	void help();

	void addContacts(ArrayList<Contacts> arrayList, Scanner sc);

	void infoContacts(ArrayList<Contacts> arrayList);

	ArrayList<Contacts> findBysex(ArrayList<Contacts> arrayList, String sex);

	Contacts findByname(ArrayList<Contacts> arrayList, String name);

	Contacts findByNum(ArrayList<Contacts> arrayList, String telnum);

}
