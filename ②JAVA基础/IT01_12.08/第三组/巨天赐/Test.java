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
public class Test {

	public static void main(String[] args) {
		ArrayList<Commodity> arrayList = new ArrayList<Commodity>();
		CommodityService commodity = new CommodityService();
		Scanner sc = new Scanner(System.in);
		boolean isQuit = true;
		commodity.helpInfo();
		while (isQuit) {
			String key = null;
			switch (key) {
			case "Add":
				commodity.addCommodity(arrayList, sc);
				break;

			case "Stock":
				commodity.stockCommodity(arrayList, sc);
				break;

			case "Sell":
				commodity.sellCommodity(arrayList, sc);
				break;

			case "Info":
				commodity.infoCommodity(arrayList);
				break;

			case "Quit":
				isQuit = false;
				break;
				
			default:
				break;
			}
		}
	}

}
