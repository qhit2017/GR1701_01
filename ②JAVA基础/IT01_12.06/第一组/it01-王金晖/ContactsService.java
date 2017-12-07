package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsService implements IContacts {

 

	@Override
	public void help() {
		System.out.println("---通信录存储查询系统");
		System.out.println("[1] 录入信息请输入  add");
		System.out.println("[2] 显示信息请输入  info");
		System.out.println("[3] 性别查找请输入  sex");
		System.out.println("[4] 姓名查找请输入  name");
		System.out.println("[5] 电话查找请输入  num");
		System.out.println("[6] 退出系统输入      quit");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String[] s = sc.next().split(",");

		if (s.length != 3) {
			System.out.println("您输入的信息不完整或不正确,无法录入");
		} else {
			Contacts contacts = new Contacts(s[0], s[1], s[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}
	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		
		
		
		for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());
		}

	}

	@Override
	public ArrayList<Contacts> findBysex(ArrayList<Contacts> arrayList,
			String sex) {
		//新建一个集合类
		ArrayList<Contacts> arrayList2 = new ArrayList<Contacts>();
		
		boolean is = false;
		for (Contacts contacts : arrayList) {
			//从contacts获得一个性别
			String sex2 = contacts.getSex();
			if (sex2.equals(sex)) {
				is = true;						
				//通过.add的形式把找到的信息存到新的集合类里
				arrayList.add(contacts);
				System.out.println(contacts.toString());
			}
		}if (!is) {
			System.out.println("您输入的性别不存在");
		}
		return arrayList2;
	}

	@Override
	public Contacts findByname(ArrayList<Contacts> arrayList, String name) {
		Contacts contacts2 = new Contacts();
		boolean  is = false;
		for (Contacts contacts : arrayList) {
			String name2 = contacts.getName();
			if (name2.equals(name)) {
				System.out.println(contacts.toString());
				is = true;
			}
		}if (!is) {
			System.out.println("您查找的姓名不存在  ");
		}
		return contacts2;
	}

	@Override
	public Contacts findByNum(ArrayList<Contacts> arrayList, String telnum) {
		Contacts contacts2 = new Contacts();
		boolean is = false;
		for (Contacts contacts : arrayList) {
			 String telnum2 = contacts.getTelnum();
			 if (telnum2.equals(telnum)) {
				System.out.println(contacts.toString());
				contacts2=contacts;
				is = true;
			}
			 
		}if (!is) {
			System.out.println("您查找的电话不存在 ");
		}
		return contacts2;
	}

}
