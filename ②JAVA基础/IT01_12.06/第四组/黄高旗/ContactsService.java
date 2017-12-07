package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;


public class ContactsService implements IContactsBook {

	private Object name;

	public void infohelp(){
		System.out.println("通讯录系统");
		System.out.println("1	录入通讯录信息");
		System.out.println("2	显示所有通讯录信息");
		System.out.println("3	姓名搜索");
		System.out.println("4	性别搜索");
		System.out.println("5	电话搜索");
		System.out.println("6	退出功能");

	}
	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String s = sc.next();

		String[] a = s.split(",");

		if (a.length != 3) {
			System.out.println("你输入的格式有误，无法录入");
		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);

			arrayList.add(contacts);

			System.out.println(contacts.toString());
		}
	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}

	}

	@Override
	public void findByName(ArrayList<Contacts> arrayList, String name) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getName();
			if (name.equals(string)) {
				System.out.println(contacts.toString());
				isfind = true;
			} 
			
		}
		if (!isfind) {
			System.out.println("你输入的对象不存在");
		}
	}

	public void findBySex(ArrayList<Contacts> arrayList, String sex) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getSex();
			if (sex.equals(string)) {
				System.out.println(contacts.toString());
				isfind = true;
			} 
		}
		if (!isfind) {
			System.out.println("你输入的对象不存在");
			}
	}

	public void findByNum(ArrayList<Contacts> arrayList, String num) {
		boolean isfind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getTelnum();
			if (num.equals(string)) {
				System.out.println(contacts.toString());
				isfind = true;
			} 
		}
		if (!isfind) {
			System.out.println("你输入的对象不存在");
		}
	}
}
