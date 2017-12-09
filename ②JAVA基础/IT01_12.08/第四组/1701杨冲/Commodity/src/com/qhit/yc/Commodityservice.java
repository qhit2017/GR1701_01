package com.qhit.yc;

import java.util.ArrayList;
import java.util.Scanner;

public class Commodityservice implements ICommodity {

	@Override
	public void helpInfo() {
		System.out.println("---商品管理系统---");
		System.out.println("添加按1");
		System.out.println("进货按2");
		System.out.println("销售按3");
		System.out.println("库存按4");
		System.out.println("退出按5");

	}

	@Override
	public void addCommodity(ArrayList<Commodity> arrList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length!=4) {
			System.out.println("你输入的值有误，请重新输入");
		} else {
			Commodity commodity=new Commodity(a[0], a[1], Double.parseDouble(a[2]), Long.parseLong(a[3]));
          arrList.add(commodity);
          System.out.println(commodity.toString());
		}

	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean issucc=false;
		if (a.length!=2) {
			System.out.println("你输入的值有误，请重新输入");
		} else {
			for (Commodity commodity : arrList) {
				if (commodity.getId().equals(a[0])) {
		   long newNumber=commodity.getNumber()+Long.parseLong(a[1]);
		   commodity.setNumber(newNumber);
		   System.out.println(commodity.toString());
				issucc=true;	
				}
			}

		}if(!issucc){
			System.out.println("错误");
		}

	}

	@Override
	public void sellCommodity(ArrayList<Commodity> arrList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean issucc=false;
		if (a.length!=2) {
			System.out.println("你输入的值有误，请重新输入");
		} else {
			for (Commodity commodity : arrList) {
				if (commodity.getId().equals(a[0])) {
					if (commodity.getNumber()>Long.parseLong(a[1])) {
						long newNumber=commodity.getNumber()-Long.parseLong(a[1]);
						   commodity.setNumber(newNumber);
						   System.out.println(commodity.toString());
								issucc=true;
					}
		   	
				}
			}
			if(!issucc){
				System.out.println("错误");
			}
		}


	}

	@Override
	public void InfoCommodity(ArrayList<Commodity> arrList) {
		for (Commodity commodity : arrList) {
			System.out.println(commodity.toString());
		}

	}

}
