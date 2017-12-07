package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressService implements Iaddress {

	@Override
	public void helpInfo() {
		System.out.println("\t通讯录");
		System.out.println("[1]录入请按1");
		System.out.println("[2]显示所有请按2");
		System.out.println("[3]姓名搜索请按3");
		System.out.println("[4]性别搜索请按4");
		System.out.println("[5]电话搜索请按5");
		System.out.println("[6]退出请按6");

	}

	@Override
	public void addContacts(ArrayList<Address> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("你输入的不完整");

		} else {
			Address contacts = new Address(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}

	}

	@Override
	public void ergContacts(ArrayList<Address> arrayList) {
		/*for (int i = 0; i < arrayList.size(); i++) {
			Address contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}*/
		for (Address contacts : arrayList) {
			System.out.println(contacts.toString());
		}
		/*Iterator<Address> iterator = arrayList.iterator();
		for (Iterator<Address> iterator2 = arrayList.iterator(); iterator2
				.hasNext();) {
			Address contacts = (Address) iterator2.next();

		}*/
		System.out.println(arrayList.toString());
	}

	@Override
	public Address nameContacts(ArrayList<Address> arrayList, String name) {
		for (Address contacts : arrayList) {
			if (contacts.getName().equals(name)) {
				System.out.println(contacts.toString());
			}
		}
		
	
		return null;
	}

	@Override
	public ArrayList<Address> sexContacts(ArrayList<Address> arrayList,
			String gender) {
		for (Address contacts : arrayList) {
			if (contacts.getGender().equals(gender)) {
				System.out.println(contacts.toString());
			}
		}
		
		return null;
	}

	@Override
	public Address telNumContacts(ArrayList<Address> arrayList, String telnum) {
		for (Address contacts : arrayList) {
			if (contacts.getTelnum().equals(telnum)) {
				System.out.println(contacts.toString());
			}
		}
		return null;
	}

}
