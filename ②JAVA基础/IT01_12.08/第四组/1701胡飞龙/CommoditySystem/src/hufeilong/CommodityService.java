package hufeilong;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CommodityService implements ICommodity {

	@Override
	public void helpInfo() {
		System.out.println("--销存系统--");
		System.out.println("[1]新增商品请输入1");
		System.out.println("[2]进货请输入2");
		System.out.println("[3]销售请输入3");
		System.out.println("[4]参看库存请输入4");
		System.out.println("[5]退出功能请输入5");	
		
	}

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length!=5) {
			System.out.println("你输入的数据不完整,请重新录入");
		} else {
			Commodity commodity = new Commodity(a[0], a[1], Double.parseDouble(a[2]), Long.parseLong(a[3]));
			arrayList.add(commodity);
			System.out.println(commodity.toString());
		}
		
	}

	@Override
	public void findCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		
		String[] s = sc.next().split(",");
		boolean isSucc = false;
		if (s.length!=2) {
			System.out.println("你输入的信息不正确,请重新录入");
		} else {
			for (Commodity commodity : arrayList) {
			if (commodity.getId().equals(s[0])){
			long newNumber  =	commodity.getNumber() + Long.parseLong(s[1]);
			commodity.setNumber(newNumber);
			System.out.println(commodity.toString());
			isSucc = true;
			}
		}

		}if (!isSucc) {
			System.out.println("无法进货");
			
		}
		
	}

	@Override
	public void sellCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] s = sc.next().split(",");
		boolean isSucc = false;
		if (s.length!=2) {
			System.out.println("你输入的信息不正确,请重新录入");
		} else {
			for (Commodity commodity : arrayList) {
			if (commodity.getId().equals(s[0])){
				if (commodity.getNumber() > Long.parseLong(s[1])) {
					
					long newnumber = commodity.getNumber() - Long.parseLong(s[1]);
					commodity.setNumber(newnumber);
					System.out.println(commodity.toString());
					isSucc = true;
				}
				
			
			}
		}

		}if (!isSucc) {
			System.out.println("无法销售");
			
		}
		
		
	}

	@Override
	public void lookCommodity(ArrayList<Commodity> arrayList) {
		Iterator<Commodity> iterator = arrayList.iterator();
		for (Iterator iterator2 = arrayList.iterator(); iterator2.hasNext();) {
			Commodity commodity = (Commodity) iterator2.next();
			System.out.println(commodity.toString());
		}
		
	}

}
