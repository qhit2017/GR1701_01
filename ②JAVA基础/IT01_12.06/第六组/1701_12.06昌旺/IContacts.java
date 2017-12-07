package com.it01;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContacts {

	void addContacts (ArrayList<Contacts>arrayList,Scanner sc);
	void infoContacts(ArrayList<Contacts>arrayList);
	ArrayList<Contacts> findBySex(ArrayList<Contacts>arrayList,String sex);
	Contacts findByName(ArrayList<Contacts>arrayList,String Name);
	Contacts findByNum(ArrayList<Contacts>arrayList,String telNum);
}
