package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;

/*Author：刘龑聪
 E-mail：15539919713@163.com
 */
public class CommodityService implements ICommoditySystem {

	@Override
	public void helpInfo() {
		System.out.println("-----商品进销存管理系统-----" + "\n    <1>新增商品请输入1"
				+ "\n    <2>进货记录请输入2" + "\n    <3>销售记录请输入3" + "\n    <4>查看库存请输入4"
				+ "\n    <5>查看帮助请输入5" + "\n    <6>退出系统请输入6");
	}

	@Override
	public void add(ArrayList<Commodity> arrayList, Scanner sc) {
		System.out.println("请输入要新建的商品信息!" + "\n格式:编号,名称,价格,数量   中间以逗号   , 隔开!");
		boolean b = true;
		while (b) {
			String[] s = sc.next().split(",");
			if (s.length != 4) {
				System.out.println("新建失败,请核实信息及格式是否正确,并重新输入!");
			} else {
				arrayList.add(new Commodity(s[0], s[1], Double
						.parseDouble(s[2]), Long.parseLong(s[3])));
				System.out.println("新建成功!");
				b = false;
			}
		}
	}

	@Override
	public void stock(ArrayList<Commodity> arrayList, Scanner sc) {
		System.out.println("请输入进货信息!" + "\n格式:编号,进货数量   中间以逗号   , 隔开!");
		String[] s = sc.next().split(",");
		boolean b = true;
		if (s.length != 2) {
			System.out.println("进货失败,请核实信息及格式是否正确!");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(s[0])) {
					commodity.setNum(commodity.getNum() + Long.parseLong(s[1]));
					System.out.println("进货成功!");
					b = false;
				}
			}
			if (b) {
				System.out.println("未找到该编号的商品,进货失败!");
			}
		}
	}

	@Override
	public void sell(ArrayList<Commodity> arrayList, Scanner sc) {
		System.out.println("请输入售货信息!" + "\n格式:编号,售货数量   中间以逗号   , 隔开!");
		String[] s = sc.next().split(",");
		boolean b = true;
		if (s.length != 2) {
			System.out.println("销售失败,请核实信息及格式是否正确!");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(s[0])) {
					if (commodity.getNum() >= Long.parseLong(s[1])) {
						commodity.setNum(commodity.getNum()
								- Long.parseLong(s[1]));
						System.out.println("进货成功!");
						b = false;
					}
				}
			}
			if (b) {
				System.out.println("销售失败!");
			}
		}
	}

	@Override
	public void info(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity.toString());
		}
	}

}
