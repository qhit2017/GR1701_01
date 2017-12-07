import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;


public class PhoneSerrice implements IPhone {

	@Override
	public void info() {
		System.out.println("————通讯录系统————");
		System.out.println("新建联系人请输入：1");
		System.out.println("查看所有联系人请输入：2");
		System.out.println("通过性别查找联系人请输入：3");
		System.out.println("通过姓名查找联系人请输入：4");
		System.out.println("通过号码查找联系人请输入：5");
		System.out.println("退出请输入：6");

	}

	@Override
	public void addPhone(ArrayList<Phone> arrayList, Scanner sc) {
		System.out.println("请输入      用,号隔开");
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length == 3) {
			Phone phone = new Phone(a[0], a[1], a[2]);
			arrayList.add(phone);
			System.out.println(phone.toString());
			System.out.println("添加成功");

		} else {
			System.out.println("输入有误");
		}

	}

	@Override
	public void infoPhone(ArrayList<Phone> arrayList) {

		for (Phone phone : arrayList) {

			System.out.println(phone.toString());

		}

	}

	@Override
	public ArrayList<Phone> findsex(ArrayList<Phone> arrayList) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Phone> arrayList2 = new ArrayList<Phone>();
		System.out.println("请输入性别");
		boolean b = true;
		String sex = sc.next();
		for (Phone phone : arrayList) {
			String sex2 = phone.getSex();
			if (sex.equals(sex2)) {
				arrayList2.add(phone);
				System.out.println(phone.toString());

				b = false;

			}
		}

		if (b == true) {

			System.out.println("没找到");

		} else {
			System.out.println("为您找到");
		}

		return arrayList2;
	}

	@Override
	public Phone findname(ArrayList<Phone> arrayList) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Phone> arrayList2 = new ArrayList<Phone>();
		System.out.println("请输入姓名：");
		String name = sc.next();
		boolean b = true;
		for (Phone phone : arrayList) {
			String name2 = phone.getName();
			if (name.equals(name2)) {
				arrayList2.add(phone);
				System.out.println(arrayList2.toString());
				System.out.println("为您找到");
				b = false;
				break;
			}

		}
		if (b) {

			System.out.println("没找到");

		}

		return null;

	}

	@Override
	public Phone findphoneNumber(ArrayList<Phone> arrayList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入电话号码");
		String p = sc.next();
		boolean b = true;
		for (int i = 0; i < arrayList.size(); i++) {
			String phoneNumber = arrayList.get(i).getPhoneNumber();
			if (p.equals(phoneNumber)) {
				System.out.println(arrayList.get(i).toString());
				System.out.println("为您找到");
				b = false;
				break;
			}

		}
		if (b) {

			System.out.println("没找到");

		}

		return null;
	}

}
