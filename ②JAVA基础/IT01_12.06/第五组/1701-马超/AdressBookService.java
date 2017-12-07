package  machao;

package com.adress;


import java.util.ArrayList;
import java.util.Scanner;


public class AdressBookService implements IAdressBook {

	@Override
	public void helpInfo() {
		System.out.println("-----通讯录管理系统-----")
		System.out.println("[1]添加一位联系人请输入数字")
		System.out.println("[2]查看所有联系人信息请输入数字")
		System.out.println("[3]根据姓名搜索请输入数字")
		System.out.println("[4]根据性别搜索请输入数字")
		System.out.println("[5]根据电话号码搜索请输入数字")
		System.out.println("[6]再次查看帮助请输入数字")
		System.out.println("[7]退出通讯录管理系统请输入数字");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		System.out.println("请输入联系人信息"
						+"\n格式:姓名,性别,电话号码     中间以逗号,隔开");
		boolean b1 = true;
		while (b1) {
			String[] s = sc.next().split(",");
			if (s.length != 3) {
				System.out.println("输入的信息或格式不正确，请核实并重新输入！");
			} else {
				arrayList.add(new Contacts(s[0], s[1], s[2]));
				System.out.println("录入成功！");
				b1 = false;
			}
		}
	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		/*1.
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());
		}
		*/
		//2.
		for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());
		}
		/*3.
		Iterator<Contacts> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Contacts contacts = (Contacts) iterator.next();
			System.out.println(contacts.toString());
		}
		*/
	}

	@Override
	public Contacts findByname(ArrayList<Contacts> arrayList, String name) {
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getName().equals(name)) {
				return arrayList.get(i);
			}
		}
		return null;
	}

	@Override
	public ArrayList<Contacts> findBysex(ArrayList<Contacts> arrayList,
			String sex) {
		ArrayList<Contacts> arrayList2 = new ArrayList<Contacts>();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getSex().equals(sex)) {
				arrayList2.add(arrayList.get(i));
			}
		}
		if (arrayList2.size()!=0) {
			return arrayList2;
		}
		System.out.println("未查找到此性别的人！");
		return null;
	}

	@Override
	public Contacts findBynum(ArrayList<Contacts> arrayList, String telnum) {
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getTelnum().equals(telnum)) {
				return arrayList.get(i);
			}
		}
		return null;
	}

}
