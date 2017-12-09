package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;


public class CommodityService implements ICommodity {
	
	public void helpInfo() {
		System.out.println("----------商品进销存系统-----------");
		System.out.println("[1].新增商品,录入商品信息,请输入Add");
		
		System.out.println("[2].进货,输入商品编号和数量,请输入Stock");
		
		System.out.println("[3].销售,输入商品编号和数量,请输入Sell");
		
		System.out.println("[4].显示所有商品信息(包含商品编号、名称、价格、数量),请输入Info");
		
		System.out.println("[5].退出系统，请输入Exit");
	}

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		
		String string = sc.next();
		String[] a = string.split(",");
		if (a.length!=4) {
			System.out.println("您输入的信息有误");
		} else {
			Commodity commodity = new Commodity(a[0], a[1], 
					Double.parseDouble(a[2]), Long.parseLong(a[3]));
			arrayList.add(commodity);
			System.out.println(commodity.toString());
		}
	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean isSucc=false;
		if (a.length!=2) {
			System.out.println("输入的信息不完整，无法进货");
		}else{
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(a[0])) {
					long newNumber=commodity.getNumber()+Long.parseLong(a[1]);
					System.out.println(newNumber);	
					System.out.println(commodity.toString());
					isSucc=true;
				}							
			}									
		}
		if (!isSucc) {
			System.out.println("进货失败");
		}
	}

	@Override
	public void sellCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean isSucc=false;
		if (a.length!=2) {
			System.out.println("输入的信息不完整，无法销售");
		}else{
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(a[0])) {
					if (commodity.getNumber()>Long.parseLong(a[1])) {
						long newNumber=commodity.getNumber()-Long.parseLong(a[1]);
						System.out.println(newNumber);	
						System.out.println(commodity.toString());
						isSucc=true;
					}					
				}							
			}									
		}
		if (!isSucc) {
			System.out.println("进货失败");
		}
	}

	@Override
	public void infoCommodity(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity);
		}
	}

}
