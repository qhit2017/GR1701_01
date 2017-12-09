package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;

public class Commodityexample implements ICommodity {

	@Override
	public void hlpoinfo() {
		System.out.println("[1]增加");
		System.out.println("[2]进货");
		System.out.println("[3]出售");
		System.out.println("[4]库存");
		System.out.println("[5]退出");

	}

	@Override
	public void addCommodity(ArrayList<com.commodity.Commodity> arrayList,
			Scanner sc) {
		String[] a = sc.next().split(",");

		if (a.length != 4) {
			System.out.println("");
		} else {
			Commodity commodity = new Commodity(a[0], a[1],
					Double.parseDouble(a[2]), Long.parseLong(a[3]));
			System.out.println(a);
			commodity.equals(a);
		}

	}

	@Override
	public void stockCommodity(ArrayList<com.commodity.Commodity> arrayList,
			Scanner sc) {
		String[] sa = sc.next().split(",");
		boolean issucc = false;
		if (sa.length != 2) {
			System.out.println("shibai");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(sa[0])) {
					long newNumber = commodity.getNamde()
							+ Long.parseLong(sa[3]);
					commodity.setNamde(newNumber);
					System.out.println(arrayList.toString());
					issucc = true;
				}
			}

			if (!issucc) {
				System.out.println("shibai");
			}
		}
	}

	@Override
	public void sellCommodity(ArrayList<com.commodity.Commodity> arrayList,
			Scanner sc) {
		String[] sb = sc.next().split(",");
		boolean issucc = false;
		if (sb.length != 2) {
			System.out.println("shibai");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getNamde()> Long.parseLong(sb[3])) {
					long tuNumber = commodity.getNamde()
							-Long.parseLong(sb[3]);
					commodity.setNamde(tuNumber);
					System.out.println(arrayList.toString());
					issucc = true;
				}
			}

			if (!issucc) {
				System.out.println("shibai");
			}
		}
	}

	@Override
	public void Commodity(ArrayList<com.commodity.Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity.toString());
		}
	}

}
