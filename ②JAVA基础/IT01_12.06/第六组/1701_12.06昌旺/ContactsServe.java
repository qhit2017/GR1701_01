package com.it01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ContactsServe implements IContacts {
	void helpinfo() {
		System.out.println("~~~~~通讯管理系统~~~~~");
		System.out.println("【1】录入通讯录信息");
		System.out.println("【2】查看所有信息");
		System.out.println("【3】按名字查找通讯信息");
		System.out.println("【4】按性别查找通讯信息");
		System.out.println("【5】按号码查找通讯信息");

	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String s = sc.next();
		String[]a=s.split(",");
		
		if (a.length!=3) {
			System.out.println("你输入的信息不正确，无法输入");
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
		for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());
		}
		Iterator<Contacts> iterable = arrayList.iterator();
		while (iterable.hasNext()) {
			Contacts contacts = (Contacts) iterable.next();
			System.out.println(contacts.toString());
		}
	}

	@Override
	public ArrayList<Contacts> findBySex(ArrayList<Contacts> arrayList,String sex) {
		ArrayList<Contacts> arrayList2 = new ArrayList<Contacts>();
		for (Contacts contacts :arrayList) {
			String sex2 = contacts.getSex();
			if (sex.equals(sex2)) {
				System.out.println(contacts.toString());
				arrayList2.add(contacts);
			}else{
				System.out.println("没有此性别的联系人");
			}
		}
		return arrayList2;
	}

	@Override
	public Contacts findByName(ArrayList<Contacts> arrayList, String Name) {
		Contacts contacts_1 = new Contacts();
		boolean isHas = false; 
		for (Contacts contacts : arrayList) {
			String string = contacts.getName();
			if (string.equals(Name)) {
				contacts_1.setName(contacts.getName());
				contacts_1.setSex(contacts.getSex());
				contacts_1.setTelNum(contacts.getTelNum());
				System.out.println(contacts.toString());
				isHas = true;
			}
		}
			if(!isHas){
				System.out.println("查无此人");
		}
		return contacts_1;
	}

	@Override
	public Contacts findByNum(ArrayList<Contacts> arrayList, String telNum) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contatc = arrayList.get(i);
			String num1 = contatc.getNum();

			if (num1.equals(num1)) {
				System.out.println(contatc.toString());
			} else {
				System.out.println("您输入的号码不存在");
			}

		}

		return null;
	}

	public void helpInfo(){
		
	}
}
