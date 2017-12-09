package whh;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:2421922506@QQ.com
 * @date    创建时间：2017年12月7日 下午3:43:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Text {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Commodity> arrayList = new ArrayList<Commodity>();
		CommodityService commodityService = new CommodityService();
		commodityService.helpInfo();
		int s = 0;
		boolean isquit = true;
		while (isquit) {
			 s = sc.nextInt();
			 switch (s) {
			case 1:
				System.out.println("请输入需要增加的商品的编号,姓名,价格,数量,并用','隔开");
				commodityService.addCommodity(arrayList, sc);
				
				break;
			case 2:
				System.out.println("请输入需要进货的商品");
				commodityService.findCommodity(arrayList, sc);
				break;
			case 3:
				System.out.println("请输入需要销售的商品");
				commodityService.sellCommodity(arrayList, sc);
				break;
			case 4:
				commodityService.lookCommodity(arrayList);
				break;
			case 5:
				isquit = false;
				break;

			default:
				break;
			}
		}System.out.println("拜拜");
	}

}
