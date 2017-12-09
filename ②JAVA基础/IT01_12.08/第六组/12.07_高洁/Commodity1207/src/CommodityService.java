import java.util.ArrayList;
import java.util.Scanner;

public class CommodityService implements ICommodity {

	@Override
	public void info() {
		System.out.println("————商品系统————");
		System.out.println("录入商品信息请输入：1");
		System.out.println("进货请输入：2");
		System.out.println("销售请输入：3");
		System.out.println("参看库存请输入：4");
		System.out.println("退出请输入：5");

	}

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String string = sc.next();

		String[] a = string.split(",");
		if (a.length != 4) {
			System.out.println("输入错误");
		} else {
			Commodity commodity = new Commodity(a[0], a[1],
					Double.parseDouble(a[2]), Integer.parseInt(a[3]));
			arrayList.add(commodity);
			System.out.println(commodity.toString());
		}

	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] strings = sc.next().split(",");
		boolean b = true;
		if (strings.length != 2) {
			System.out.println("输入有误");
		} else {
			for (Commodity commodity : arrayList) {

				if (commodity.getId().equals(strings[0])) {
					System.out.println("1");
					int quantity = commodity.getQuantity()
							+ Integer.parseInt(strings[1]);
					commodity.setQuantity(quantity);
					System.out.println(commodity.toString());
					b = false;
				}
			}
			if (b == true) {
				System.out.println("进货失败");
			}
		}

	}

	@Override
	public void marketCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] strings = sc.next().split(",");
		boolean b = true;
		if (strings.length != 2) {
			System.out.println("输入有误");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(strings[0])) {

					if (commodity.getQuantity() >= Integer.parseInt(strings[1])) {
						int quantity = commodity.getQuantity()
								- Integer.parseInt(strings[1]);
						commodity.setQuantity(quantity);
						System.out.println(commodity.toString());
						b = false;
					}

				}
			}
			if (b == true) {
				System.out.println("销售失败");
			}
		}
	}

	@Override
	public void infoCommodity(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity.toString());
		}

	}

}
