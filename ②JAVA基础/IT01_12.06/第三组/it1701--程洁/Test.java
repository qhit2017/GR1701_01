package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args ) {
		ArrayList<Contact> arrayList=new ArrayList<Contact>();
		ContactService contactService=new ContactService();
		contactService.infoHelp();
		Scanner sc=new Scanner(System.in);
		boolean isQuit=true;
		while (isQuit) {
			int key=sc.nextInt();
			switch (key) {
			case 1:
				contactService.addContact(arrayList, sc);
				
				break;
			case 2:
				contactService.infoContact(arrayList);
				break;
			case 3:
				 String name = sc.next();
				 if (contactService.findByName(arrayList,name)==null) {
					 System.out.println("不符合");
				} else {
					System.out.println(contactService.findByName(arrayList,name).toString());
				}
				
				break;
			case 4:
				 String sex = sc.next();
				contactService.findBySex(arrayList, sex);
				break;
			case 5:
				 String num = sc.next();
				System.out.println(contactService.findByNum(arrayList, num));
				break;
			case 6:
				isQuit=false;
				break;

			default:
				break;
			}
		}
System.out.println("再见");
	}

}
