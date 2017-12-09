package com.saj;

import java.util.ArrayList;
import java.util.Scanner;

public class CommoditysService implements ICommoditys {

	@Override
	public void helpinfo() {
		// TODO Auto-generated method stub
		System.out.println("-----进销存系统-----");
		System.out.println("新增商品，请输入1");
		System.out.println("进货，请输入2");
		System.out.println("销售，请输入3");
		System.out.println("查看库存，请输入4");
		System.out.println("退出功能，请输入5");

	}

	@Override
	public void addCommoditys(ArrayList<Commoditys> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String string = sc.next();
		String[] a = string.split(",");
		if (a.length != 4) {
			System.out.println("您输入的格式不正确，请重新输入");
		} else {
			Commoditys Commoditys = new Commoditys(a[0], a[1],
					Double.parseDouble(a[2]), Long.parseLong(a[3]));
			arrayList.add(Commoditys);
			System.out.println(Commoditys.toString());

		}

	}

	@Override
	public void stockcCommoditys(ArrayList<Commoditys> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String[] a = sc.next().split(",");
		boolean iss = false;
		if (a.length != 2) {
			System.out.print("您输入的格式不正确，没有找到");
		} else {
			for (Commoditys commoditys : arrayList) {
				if (commoditys.getId().equals(a[0])) {
					long newcommoditys = commoditys.getNumber()
							+ Long.parseLong(a[1]);
					commoditys.setNumber(newcommoditys);
					System.out.println(commoditys.toString());
					iss = true;

				}
			}

		}
		if (!iss) {
			System.out.println("不能进货");
		}

	}

	@Override
	public void sellCommoditys(ArrayList<Commoditys> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String[] a = sc.next().split(",");
		boolean iss = false;
		if (a.length != 2) {
			System.out.println("您输入的格式不正确，没有找到");
		} else {
			for (Commoditys commoditys : arrayList) {
				if (commoditys.getId().equals(a[0])) {
					if (commoditys.getNumber() > Long.parseLong(a[1])) {
						long newcommoditys = commoditys.getNumber()
								- Long.parseLong(a[1]);
						commoditys.setNumber(newcommoditys);
						System.out.println(commoditys.toString());
						iss = true;
					}

				}
			}

		}
		if (!iss) {
			System.out.println("销售不成功");
		}

	}

	@Override
	public void findcommoditys(ArrayList<Commoditys> arrayList) {
		// TODO Auto-generated method stub
		for (Commoditys commoditys : arrayList) {

			System.out.println(commoditys.toString());
		}

	}

}
