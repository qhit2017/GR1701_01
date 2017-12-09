package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;

/*Author：刘龑聪
  E-mail：15539919713@163.com
 */
public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Commodity> arrayList = new ArrayList<Commodity>();
		CommodityService cs = new CommodityService();
		
		cs.helpInfo();
		boolean isExit = true;
		while (isExit) {
			System.out.println("请输入指令并按Enter键!");
			String k = sc.next();
			switch (k) {
			
			case "1":
				cs.add(arrayList, sc);
				break;
				
			case "2":
				cs.stock(arrayList, sc);
				break;
				
			case "3":
				cs.sell(arrayList, sc);
				break;
				
			case "4":
				cs.info(arrayList);
				break;
				
			case "5":
				cs.helpInfo();
				break;
				
			case "6":
				isExit = false;
				break;
	
			default:
				System.out.println("请输入正确的指令!");
				break;
			}
		}
		System.out.println("谢谢使用,再见!");
	}

}