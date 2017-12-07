package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
ArrayList<Contacts> arrayList =new ArrayList<Contacts>();
ContactsService cService = new ContactsService();
Scanner sc = new Scanner(System.in);
cService.infohelp();
int key = 0 ;
boolean isquit = true;

while (isquit) {
	key = sc.nextInt();
	switch (key) {
	case 1:
		cService.addContacts(arrayList, sc);
		break;
	case 2:
		cService.infoContacts(arrayList);
		break;
	
		
case 3:
	String name = sc.next();
	cService.findByName(arrayList, name);
	break;

case 4:
	String sex = sc.next();
	cService.findBySex(arrayList, sex);
	break;

case 5:
	String num = sc.next();
	cService.findByNum(arrayList, num);
	break;

case 6:
	isquit = false;
	break;

	default:
		System.out.println("请输入正确的命令");
		break;
	}
}
System.out.println("再见");
	}

}
