package com;

import java.util.ArrayList;
import java.util.Scanner;

public interface Icontact {
	 void addContact(ArrayList<Contact> arrayList,Scanner sc);
     void infoContact(ArrayList<Contact> arrayList);
     ArrayList<Contact> findBySex(ArrayList<Contact> arrayList,String sex);
     Contact findByName(ArrayList<Contact> arrayList,String name);
     Contact findByNum(ArrayList<Contact> arrayList,String telNum);
     void infoHelp();
}
