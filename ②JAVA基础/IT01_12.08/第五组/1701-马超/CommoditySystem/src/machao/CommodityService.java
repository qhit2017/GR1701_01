package machao;

import java.util.ArrayList;
import java.util.Scanner;

public class CommodityService implements ICommodity {

	@Override
	public void helpInfo() {
		System.out.println("-----欢迎使用进销存系统-----");
		System.out.println("[1]新增货品请输入1");
		System.out.println("[2]进货记录请输入2");
		System.out.println("[3]销售记录请输入3");
		System.out.println("[4]查看库存请输入4");
		System.out.println("[5]退出系统请输入5");
		
	}

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String string = sc.next();
		String[] s = string.split(",");
		if (s.length != 5) {
			System.out.println("你输入的信息有误,无法录入");
		} else {
			Commodity commodity = new Commodity(s[0], s[1],
					Double.parseDouble(s[2]), Long.parseLong(s[3]));

		}

	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean isSucc = false;
		if (a.length != 2) {
			System.out.println("您输入的信息有误,无法进货!");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(a[0])) {
					long newNumber = commodity.getNumber()
							+ Long.parseLong(a[1]);
					commodity.setNumber(newNumber);
					System.out.println(commodity.toString());
					isSucc = true;
				}
			}
			if (!isSucc) {
				System.out.println("进货失败!");

			}
		}
	}

	@Override
	public void sellCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean isSucc = false;
		if (a.length != 2) {
			System.out.println("您输入的信息有误,无法销售!");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(a[0])) {
					if (commodity.getNumber() > Long.parseLong(a[1])) {
						long newNumber = commodity.getNumber()
								- Long.parseLong(a[1]);
						commodity.setNumber(newNumber);
						System.out.println(commodity.toString());
						isSucc = true;
					}
				}
				if (!isSucc) {
					System.out.println("销售失败!");
				}
			}

		}

	}

	@Override
	public void infoCommodity(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity.toString());
		}

	}

}
