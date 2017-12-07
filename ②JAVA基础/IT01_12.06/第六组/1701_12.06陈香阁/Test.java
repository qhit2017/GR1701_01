package com.it01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Contacts>arrayList=new ArrayList<Contacts>();
		Contacts contatcs = new Contacts(null, null, null);
		Scanner sc=new Scanner(System.in);
		
		contatcs .helpinfo();
		
		boolean isQuit=true;
		int key=0;
		
		while (isQuit) {
			
			key=sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("请输入信息");
				contatcs.addContatc(arrayList, sc);
				break;
			case 2:
				System.out.println("请输入查看的信息");
				contatcs.infoContatc(arrayList);
				break;
			case 3:
				System.out.println("请输入名字查找信息");
				String name = sc.next();
				contatcs.findByName(arrayList, name);
				break;
			case 4:
				System.out.println("请输入性别查找信息");
				String sex = sc.next();
			    contatcs.findByName(arrayList, sex);
				break;
			case 5:
				System.out.println("请输入号码查找信息");
				String num = sc.next();
			    contatcs.findByName(arrayList, num);
				break;
			case 6:
				
				isQuit=false;
				break;
					

			default:
				break;
			}
		}
		System.out.println("退出");

	}
}
