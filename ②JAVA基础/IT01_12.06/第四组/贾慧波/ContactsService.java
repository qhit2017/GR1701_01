package AddressBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;



public class ContactsService implements IContacts {

	void help(){
		System.out.println("---通讯录管理系统---");
		System.out.println("1 录入通信信息请输入add");
		System.out.println("2 显示通信录信息请输入info");
		System.out.println("3 姓名搜索请输入name");
		System.out.println("4 性别搜索请输入sex");
		System.out.println("5 电话搜索请输入tell");
		System.out.println("6 退出系统请输入exit");
	}
	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		
		if (a.length != 3) {
			System.out.println("You are wrong");
		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts);
		}
	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		/*
		//*1
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
		//2
		for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());
		}
		*/
		//3
		Iterator<Contacts> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Contacts contacts = (Contacts) iterator.next();
			System.out.println(contacts.toString());
		}
	}

	@Override
	public ArrayList<Contacts> findBySex(ArrayList<Contacts> arrayList,String sex) {
		ArrayList<Contacts> arrayList2 =new ArrayList<Contacts>();
		for (Contacts contacts : arrayList2) {
			String sex2 = contacts.getSex();
			if (sex.equals(sex2)) {
				arrayList2.add(contacts);
				System.out.println(contacts.toString());
			} else {
				System.out.println("查无此人！！！！");
			}
		}
		return arrayList2;
	}

	@Override
	public Contacts findByName(ArrayList<Contacts> arrayList, String name) {
		boolean isFind=false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getName();
			if (name.equals(string)) {
				System.out.println(contacts.toString());
				isFind=true;
			}
		}if (!isFind) {
			System.out.println("你查找的对象不在！");
		}
		return null;	
	}

	@Override
	public Contacts findByTelnum(ArrayList<Contacts> arrayList, String telnum) {
		boolean isFind=false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String string = contacts.getTelnum();
			if (telnum.equals(string)) {
				System.out.println(contacts.toString());	
				isFind=true;
		}
	}if (!isFind) {
		System.out.println("你查找的对象不在！");
				System.out.println("你查找的对象不在！");
		}	
		return null;
	}

}
