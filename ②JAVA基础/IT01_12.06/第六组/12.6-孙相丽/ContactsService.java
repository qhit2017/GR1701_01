package com.Addressbook;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ContactsService implements IContacts {

	void help() {
		System.out.println("---通讯录---");
		System.out.println("录入一个人通讯录入信息请输入Add");
		System.out.println("显示通讯录信息请输入info");
		System.out.println("通过姓名查找一个人的通讯录信息findbyname");
		System.out.println("通过性别查找一个人的通讯录信息findbysex");
		System.out.println("通过电话查找一个人的通讯录信息findbytelnumber");
		System.out.println("退初系统请输入Quit");
		System.out.println("请输入您需要的指令");

	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length!= 3) {
			System.out.println("您输入的信息不完整，无法录入");
		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		// 1.遍历
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
		// 2.增强for循环
		for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());
		}
		// 3.迭代器,用来遍历集合的
		Iterator<Contacts> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Contacts contacts = (Contacts) iterator.next();
			System.out.println(contacts.toString());
		}
	}

	@Override
	public ArrayList<Contacts> findbysex(ArrayList<Contacts> arrayList,
			String sex) {
		for (Contacts contacts : arrayList) {
			if (contacts.getSex().equals(sex)) {
				System.out.println(contacts.toString());

			}
		}

		return null;
	}

	@Override
	public Contacts findbyname(ArrayList<Contacts> arrayList, String name) {
		for (Contacts contacts : arrayList) {
			if (contacts.getName().equals(name)) {
				System.out.println(contacts.toString());
			}
		}

		return null;

	}

	@Override
	public Contacts findbytelnumber(ArrayList<Contacts> arrayList,
			String telnumber) {
		for (Contacts contacts : arrayList) {
			if (contacts.getTelNumber().equals(telnumber)) {
				System.out.println(contacts.toString());
			}
		}
		return null;
	}

}
