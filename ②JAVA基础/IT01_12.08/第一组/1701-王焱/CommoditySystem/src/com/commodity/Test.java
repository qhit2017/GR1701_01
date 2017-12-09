package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月27日 下午4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		
		ArrayList<Commodity> arrayList =new ArrayList<Commodity>();
		
		CommodityService service =new CommodityService();
		
		Scanner sc = new Scanner(System.in);
		
		service.helpInfo();		
		boolean isQuit = true;
		String s ;
		while (isQuit) {
			s = sc.next();
			switch (s) {
			case "Add":
				System.out.println("录入商品信息包含商品编号、名称、价格、初始数量");
				service.addCommodity(arrayList, sc);
				break;
			case "Stock":
				service.stockCommodity(arrayList, sc);
				break;
			case "Sell":
				service.sellCommodity(arrayList, sc);
				break;
			case "Info":
				service.infoCommodity(arrayList);				
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
