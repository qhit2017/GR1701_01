package machao;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Commodity>arrayList =new ArrayList<Commodity>();
		CommodityService s =new CommodityService();
		
		s.helpInfo();
		boolean isQuit = true;
		while (isQuit) {
			System.out.println("请输入指令并按回车键!");
			String a =sc.next();
			
			int key=0;
			switch (key) {
			case 1:
				System.out.println("格式：编号，商品名称，价格，库存");
				s.addCommodity(arrayList, sc);
				break;

			case 2:
				System.out.println("格式：编号，进货数量");
			    s.stockCommodity(arrayList, sc);
				break;

			case 3:
				System.out.println("格式：编号，销货数量");
				s.sellCommodity(arrayList, sc);
				break;

			case 4:
				System.out.println("格式：编号，销货数量");
				s.infoCommodity(arrayList);
				break;
			case 5:
				isQuit= false;
				break;
			default:
				System.out.println("您输入的有误,请重新输入!");
				break;
			}
		}
		System.out.println("退出系统,欢迎下次使用");
	}	
}
