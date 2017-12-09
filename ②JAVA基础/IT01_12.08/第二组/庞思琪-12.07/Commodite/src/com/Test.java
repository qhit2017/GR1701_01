package com;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年12月7日 下午3:37:33 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Test {

	public static void main(String[] args) {
		ArrayList< Commodite> arrayList=new ArrayList<Commodite>();
		IcommoditeService icommoditeService=new IcommoditeService();
		icommoditeService.helpInfo();
		Scanner sc=new Scanner(System.in);
		boolean isQuit=true;
		while (isQuit) {
			int key=sc.nextInt();
		switch (key) {
		
		case 1:
			icommoditeService.addCommodite(arrayList, sc);
			break;
		case 2:
			
			icommoditeService.stockCommodite(arrayList, sc);
			break;
		case 3:
			
			icommoditeService.sellCommodite(arrayList, sc);
			break;
		case 4:
			
			icommoditeService.InfoCommodite(arrayList);
			break;
		case 5:
			isQuit=false;
			break;

			
		default:
			break;
		}	
		}
		System.out.println("再见");

	}

}
