package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;

public class CommodityService implements ICommodity {

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(s);
		if (s.length()!=4) {
			System.out.println("您输入的信息不完整");
		} else {
			Commodity commodity =new Commodity(a[0], a[1], Double.parseDouble(a[2]), Long.parseLong(a[3]));
			arrayList.add(commodity);
			System.out.println(commodity.toString());
		}
		
		
	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean is = false;
		if (a.length!=2) {
			System.out.println("您输入的信息不完整");
		} else{
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(a[0])) {
					long number=commodity.getNumber();
					long newnumber=commodity.getNumber()+Long.parseLong(a[1]);
					commodity.setNumber(newnumber);
					System.out.println(commodity.toString());
					is = true;
				}
			}
		}
		if (!is){
			System.out.println("进货失败");
		}
	}

	@Override
	public void sellCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean is = false;
		if (a.length!=2) {
			System.out.println("您输入的信息不完整");
		} else{
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(a[0])) {
					long number=commodity.getNumber();
					long newnumber=commodity.getNumber()+Long.parseLong(a[1]);
					commodity.setNumber(newnumber);
					System.out.println(commodity.toString());
					is = true;
				}
			}
		}
		
	}

	@Override
	public void infoCommodity(ArrayList<Commodity> arrayList) {
		// TODO Auto-generated method stub

	}


}
