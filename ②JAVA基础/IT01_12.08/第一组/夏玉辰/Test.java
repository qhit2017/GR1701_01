package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Commodity> arrayList = new ArrayList<Commodity>();
		CommodityService commodityService = new CommodityService();
		int key;
		boolean isquit = true;
		commodityService.help();
		while (isquit) {
			System.out.println("请输入指令,回车键执行");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("格式：编号,商品名称,价格,库存");
				
				commodityService.addCommodity(arrayList, sc);
				break;
			case 2:
				System.out.println("格式：编号,进货数量");
				commodityService.stockCommodity(arrayList, sc);
				break;
			case 3:
				System.out.println("格式：编号,销货数量");
				commodityService.sellCommodity(arrayList, sc);
				break;
			case 4:
				commodityService.infoCommodity(arrayList);
				break;
			case 5:
				isquit = false;
				break;

			default:
				System.out.println("指令错误, 重新输入");
				break;
			}
		}
		System.out.println("欢迎下次使用");
	}
	
}
