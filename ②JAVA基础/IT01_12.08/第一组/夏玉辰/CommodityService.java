package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;

public class CommodityService implements ICommodity {

	@Override
	public void help() {
		System.out.println("----进销售商品系统");
		System.out.println("1  新增商品输入  1");
		System.out.println("2  进货输入          2");
		System.out.println("3  销货输入          3");
		System.out.println("4  查看库存输入  4");
		System.out.println("5  退出系统输入  5");
		
	}

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		if (a.length != 4) {
			System.out.println("您输入的信息不完整,无法录入");
		} else {
			Commodity commodity = new Commodity(a[0], a[1],
					Double.parseDouble(a[2]), Long.parseUnsignedLong(a[3]));
			arrayList.add(commodity);
			System.out.println(commodity.toString());
		}

	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean is = false;
		if (a.length != 2) {
			System.out.println("信息错误  进货失败");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(a[0])) {
					long newnumber = commodity.getNumber()
							+ Long.parseLong(a[1]);
					commodity.setNumber(newnumber);
					System.out.println(commodity.toString());
					is = true;
				}
			}
		}
		if (!is) {
			System.out.println("进货失败");
		}
	}

	@Override
	public void sellCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean is = false;
		if (a.length != 2) {
			System.out.println("信息错误  进货失败");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(a[0])) {
					if (commodity.getNumber() > Long.parseLong(a[1])) {
						long newnumber = commodity.getNumber()
								- Long.parseLong(a[1]);
						commodity.setNumber(newnumber);
						System.out.println(commodity.toString());
						is = true;
					}
				}
			}
		}
		if (!is) {
			System.out.println("进货失败");
		}

	}

	@Override
	public void infoCommodity(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity.toString());
		}

	}

}
