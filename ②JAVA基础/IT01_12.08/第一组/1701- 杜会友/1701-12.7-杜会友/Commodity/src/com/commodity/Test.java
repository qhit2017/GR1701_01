package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Commodityexample ds=new Commodityexample();
		
		ds.hlpoinfo();
		
		boolean isqand=true;
		while (isqand) {
			int key=sc.nextInt();
			ArrayList<Commodity> arrayList = null;
			switch (key) {
			case 1:
				System.out.println("输入格式，编号，名字，价格，数量");
				ds.addCommodity(arrayList, sc);
				break;

			case 2:
				ds.stockCommodity(arrayList, sc);
				break;
			case 3:
				ds.sellCommodity(arrayList, sc);
				break;
			case 4:
				ds.Commodity(arrayList);
				
				break;
			case 5:
				isqand=false;
				break;

			default:
				System.out.println("错误");
				break;
			}

		}System.out.println("再见");

	}

}
