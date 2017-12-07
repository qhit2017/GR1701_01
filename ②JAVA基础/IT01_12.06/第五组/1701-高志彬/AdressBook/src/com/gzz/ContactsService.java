package com.gzz;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月27日 下午4:24:12
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class ContactsService implements IContacts {

	void helpinfo() {
		System.out.println("----通讯录管理系统----");
		System.out.println("--1--录入通讯录");
		System.out.println("--2--显示通讯录信息");
		System.out.println("--3--姓名搜索");
		System.out.println("--4--性别搜索");
		System.out.println("--5--电话搜索");
		System.out.println("--6--退出通讯录");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {

		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("您输入的信息格式错误，请您重新输入，格式:李xx，男/女，158****5478这样的");
		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		// 1.
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
		/*
		 * for (Contacts contacts : arrayList) {
		 * System.out.println(contacts.toString()); }
		 */

	}

	@Override
	public ArrayList<Contacts> findBysex(ArrayList<Contacts> arrayList,
			String sex) {
		ArrayList<Contacts> arrayList2 = new ArrayList<Contacts>();
		for (Contacts contacts : arrayList2) {
			String string = contacts.getSex();
			if (string.equals(sex)) {
				arrayList2.add(contacts);
			} else {
				System.out.println("不符合条件");
			}
		}

		return arrayList2;

	}

	@Override
	public Contacts findByname(ArrayList<Contacts> arrayList, String name) {
		Contacts contact_1 = new Contacts();
		boolean isHas = false;
		for (Contacts contacts : arrayList) {
			String string = contacts.getName();
			if (string.equals(name)) {
				contact_1.setName(contacts.getName());
				contact_1.setSex(contacts.getName());
				contact_1.setTelNum(contacts.getTelNum());
				System.out.println(contacts.toString());
				isHas = true;
			}
		}
		if (!isHas) {
			System.out.println("查无此人");
		}
		return contact_1;

	}

	@Override
	public Contacts findBytelNum(ArrayList<Contacts> arrayList, String telNum) {
		Contacts contacts1 = new Contacts();
		boolean isHas = false;
		for (Contacts contact : arrayList) {

			String telNum2 = contact.getTelNum();
			if (telNum2.equals(telNum)) {
				System.out.println(contact);
				contacts1.equals(contact.getName());
				contacts1.equals(contact.getSex());
				contacts1.equals(contact.getTelNum());
			}
			if (!isHas) {
				System.out.println("不符合条件");
			}

		}

		return contacts1;
	}

}
