package com.Commodity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CommodityServivce implements ICommodity {

	@Override
	public void helpinfo() {
		System.out.println("---商品管理系统---");
		System.out.println("新增商品请输入Add");
		System.out.println("进货请输入Sock");
		System.out.println("销售请输入Sell");
		System.out.println("退出系统请输入Quit");
		System.out.println("查询商品请输入info");
	}

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String s = sc.next();
		String[]  a = s.split(",");
		if (a.length!=4) {
			System.out.println("您输入的信息不完整，无法录入");
		}else{
			Commodity commodity = new Commodity(a[0],a[1],a[2],a[3]);
			arrayList.add(commodity);
			System.out.println(commodity.toString());
		}
	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		System.out.println("请输入您要进货的商品编号");
		String s = sc.next();
		boolean isid  = false;
		for (int i = 0; i < arrayList.size(); i++) {
			String e = arrayList.get(i).getNumber();
			if (s.equals(e)) {
				System.out.println("请输入您要进货的数量");
				int k = sc.nextInt();
				System.out.println(arrayList.get(i).toString());
				isid = true;
			}
			}
		if (!isid) {
			System.out.println("进货失败");
		}
		
	}

		 
		 
	
	@Override
	public void sellCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		 String[] a= sc.next().split(",");

		 if (a.length !=2) {
			System.out.println("");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity .getId().equals(a[0])) {
					String newnumber = commodity.getNumber();
					commodity.getNumber();
					System.out.println(commodity.toString());
					
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
