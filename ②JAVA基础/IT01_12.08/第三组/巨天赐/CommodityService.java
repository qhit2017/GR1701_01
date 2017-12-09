package Commodity;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class CommodityService implements ICommodity {

	@Override
	public void helpInfo() {
		System.out.println("-----商品销售系统-----");
		System.out.println("【1】新增商品请输入Add");
 	   	System.out.println("【2】进货请输入Stock");
 	   	System.out.println("【3】销售请输入Sell");
 	   	System.out.println("【4】参看库存请输入Info");
 	   	System.out.println("【5】退出功能请输入Quit");
	}

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String string = sc.next();
		String[] a = string.split(",");
		
		if (a.length != 4) {
			System.out.println("You have been wrong！！！！");
		} else {
			Commodity commodity = new Commodity(a[0], a[1], Double.parseDouble(a[2]), Long.parseLong(a[3]));
			arrayList.add(commodity);
			System.out.println(commodity.toString());
		}
	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean isSuc = false;
		if (a.length != 2) {
			System.out.println("You have been wrong!!!!");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(a[0])) {
					long newNumber = commodity.getNumber()+Long.parseLong(a[1]);
					commodity.setNumber(newNumber);
					System.out.println(commodity.toString());
					isSuc = true;
				}
			}
		}
		if (!isSuc) {
			System.out.println("进货失败！！！！");
		}
	}

	@Override
	public void sellCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean isSuc = false;
		if (a.length != 2) {
			System.out.println("You have been wrong!!!!");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(a[0])) {
					if (commodity.getNumber()>Long.parseLong(a[1])) {
						long newNumber = commodity.getNumber()-Long.parseLong(a[1]);
						commodity.setNumber(newNumber);
						System.out.println(commodity.toString());
						isSuc = true;
					}
				}
			}
		}
		if (!isSuc) {
			System.out.println("销售失败！！！！");
		}
	}

	@Override
	public void infoCommodity(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity.toString());
		}
	}

}
