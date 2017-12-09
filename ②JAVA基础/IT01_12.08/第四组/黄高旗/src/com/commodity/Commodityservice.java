package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.function.IntConsumer;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

/**
 * @author 作者: xuyunmeng
 * @date 创建时间：2017年12月7日 下午2:42:23
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Commodityservice implements ICommodity {

	@Override
	public void helpinfo() {

		System.out.println("----------商品进销存系统-----------");
		System.out.println("[1].新增商品,录入商品信息,请输入Add");
		System.out.println("[2].进货,输入商品编号和数量,请输入Stock");
		System.out.println("[3].销售,输入商品编号和数量,请输入Sell");
		System.out.println("[4].显示所有商品信息(包含商品编号、名称、价格、数量),请输入Info");
		System.out.println("[5].退出系统，请输入Exit");
	}

	

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 4) {
			System.out.println();
		} else {
			Commodity commodity = new Commodity(a[0], a[2],
					Double.parseDouble(a[3]), Long.parseLong(a[4]));
				arrayList.add(commodity);
			System.out.println(commodity.toString());
		}

	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		// String[] a = s.split(",");

		for (Commodity commodity : arrayList) {

			if (commodity.getId().equals(a[0])) {
				long nubmer = commodity.getNubmer();
				long newnumber = commodity.getNubmer() + Long.parseLong(a[1]);
				System.out.println(newnumber);	
				System.out.println(commodity.toString());		

			}
		}
		

	}

	@Override
	public void sellCommodity(ArrayList<Commodity> arrayList, Scanner sc) {

		String[] a = sc.next().split(",");
		for (Commodity commodity : arrayList) {

			if (commodity.getId().equals(a[0])) {
				long nubmer = commodity.getNubmer();
				long newnumber = commodity.getNubmer() - Long.parseLong(a[1]);
				System.out.println(newnumber);		
				System.out.println(commodity.toString());
			}
		}

	}
	

	@Override
	public void infoCommodity(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(arrayList.toString());
		}

	}

}
