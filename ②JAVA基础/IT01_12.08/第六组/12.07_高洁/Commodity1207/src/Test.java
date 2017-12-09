import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		CommodityService commodityService = new CommodityService();

		ArrayList<Commodity> arrayList = new ArrayList<Commodity>();

		Scanner sc = new Scanner(System.in);

		commodityService.info();

		boolean b = true;
		while (b) {
			int a1 = sc.nextInt();
			switch (a1) {
			case 1:
				System.out.println("请输入商品信息  用,号隔开");
				commodityService.addCommodity(arrayList, sc);
				break;
			case 2:
				System.out.println("请输入商品编号和数量  用,号隔开");
				commodityService.stockCommodity(arrayList, sc);
				break;
			case 3:
				System.out.println("请输入商品编号和数量  用,号隔开");
				commodityService.marketCommodity(arrayList, sc);
				break;
			case 4:
				commodityService.infoCommodity(arrayList);
				break;
			case 5:
				b = false;
				break;

			default:
				System.out.println("输入有误");
				break;
			}
		}
		System.out.println("再见");
	}

}
