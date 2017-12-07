package com.Addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService contactsService = new ContactsService();
		contactsService.help();
		Scanner sc = new Scanner(System.in);
		String key;
		boolean isQuit = true;
		while (isQuit) {
			key = sc.nextLine();
			switch (key) {

			case "Add":
				System.out.println("请输入你要加人的名字，性别，电话号码");
				contactsService.addContacts(arrayList, sc);
				break;
			case "info":
				System.out.println("所有通讯录信息如下：");
				contactsService.infoContacts(arrayList);
				break;
			case "findbyname":
				System.out.println("");
				String name = sc.next();
				contactsService.findbyname(arrayList, name);

				break;
			case "findbysex":
				String sex = sc.next();
				contactsService.findbysex(arrayList, sex);
				break;
			case "findbytelnumber":
				String telnumber = sc.next();
				contactsService.findbytelnumber(arrayList, telnumber);
				break;
			case "Quit":
				isQuit = false;
				break;
			default:
				break;
			}

		}
		System.out.println("再見");
	}
}
