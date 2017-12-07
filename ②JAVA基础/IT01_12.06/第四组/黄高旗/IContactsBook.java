package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;


public interface IContactsBook {
	void addContacts(ArrayList<Contacts> arrayList, Scanner sc);

	void infoContacts(ArrayList<Contacts> arrayList);

	void findByName(ArrayList<Contacts> arrayList, String name);

	void findBySex(ArrayList<Contacts> arrayList, String sex);

	void findByNum(ArrayList<Contacts> arrayList, String num);
}
