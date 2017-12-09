package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者: xuyunmeng
 * @date    创建时间：2017年12月7日 下午8:48:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
	ArrayList<Commodity> arrayList =new ArrayList<Commodity>();
		Commodityservice commodityservice = new Commodityservice();
		Scanner sc = new Scanner(System.in);	
		commodityservice.helpinfo();	
		boolean isQuit = true;
		String s ;
		while (isQuit) {
			s = sc.next();
			switch (s) {
			case "Add":
				System.out.println("录入商品信息包含商品编号、名称、价格、初始数量");
				commodityservice.addCommodity(arrayList, sc);
				break;
			case "Stock":
				commodityservice.stockCommodity(arrayList, sc);
				break;
			case "Sell":
				commodityservice.sellCommodity(arrayList, sc);
				break;
			case "Info":
				commodityservice.infoCommodity(arrayList);				
				break;
			case "Exit":
				isQuit = false;
				break;														
			default:
				break;
			}
			
		}
		System.out.println("退出系统");

		
	}
}
