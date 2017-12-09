package com.saj;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Commoditys> arrayList = new ArrayList<Commoditys>();
		CommoditysService a = new CommoditysService();
		Scanner sc = new Scanner(System.in);
		a.helpinfo();
		boolean isa = true;
		int key;
		while (isa) {
			System.out.println("请输入下一条语令，并按回车键");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("格式：编号，商品名称，价格，库存");
				a.addCommoditys(arrayList, sc);
				break;

			case 2:
				System.out.println("格式：编号，进货数量");
				a.stockcCommoditys(arrayList, sc);
				break;

			case 3:
				System.out.println("格式：编号，销货数量");
				a.sellCommoditys(arrayList, sc);
				break;

			case 4:
				a.findcommoditys(arrayList);
				break;
			case 5:
				isa = false;
				break;
			default:
				System.out.println("指令错误，请重新输入");
				break;
			}
		}
		System.out.println("再见欢迎下次使用");
	}

}
