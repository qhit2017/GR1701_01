package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ContactService implements Icontact {

	@Override
	public void addContact(ArrayList<Contact> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("重输");
		} else {
			Contact contact = new Contact(a[0], a[1], a[2]);
			arrayList.add(contact);
			System.out.println(contact.toString());
		}
	}

	@Override
	public void infoContact(ArrayList<Contact> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contact contact = arrayList.get(i);
			System.out.println(contact.toString());
		}
		//
		/*for (Contact contact : arrayList) {
			System.out.println(contact.toString());
		}
		arrayList.iterator();
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Contact contact = (Contact) iterator.next();
			System.out.println(contact.toString());
		}
		Iterator<Contact> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Contact contact = (Contact) iterator.next();
			System.out.println(contact.toString());
		}
		*/
	}

	@Override
	public ArrayList<Contact> findBySex(ArrayList<Contact> arrayList, String sex) {
		ArrayList<Contact> arrayList2=new ArrayList<Contact>();
		boolean a = true;
		for (Contact contact : arrayList2) {
			String string = contact.getSex();
			if (string.equals(sex)) {
				arrayList2.add(contact);
				a= false;
			}
		}
		 if(a) {
				System.out.println("不符合");
			}
		return arrayList2;
	}

	@Override
	public Contact findByName(ArrayList<Contact> arrayList, String name) {
		Contact contact1=new Contact();

		for (Contact contact : arrayList) {
			String string = contact.getName();
			if (string.equals(name)) {
				//System.out.println(contact);
				return contact;
			}
			}
		return null;
	}

	@Override
	public Contact findByNum(ArrayList<Contact> arrayList, String telNum) {
		Contact contact1=new Contact();
		
		for (Contact contact : arrayList) {
			String string = contact.getTelNum();
			if (string.equals(telNum)) {
				return contact;
			} {
				System.out.println("不符合");
			}
		}
		return null;
	}

	@Override
	public void infoHelp() {
		System.out.println("----帮助-----");
		System.out.println("录入通信录信息按1");
		System.out.println("显示通信录信息按2");
		System.out.println("姓名搜索按3");
		System.out.println("性别搜索按4");
		System.out.println("电话搜索按5");
		System.out.println("退出按6");
		
	}

}
