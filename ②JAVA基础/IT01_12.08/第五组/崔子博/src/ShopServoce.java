import java.util.ArrayList;
import java.util.Scanner;

public class ShopServoce implements Ishop {

	@Override
	public void helpinfo() {
		// TODO Auto-generated method stub
		System.out.println("-----进销存系统-----");
		System.out.println("新增商品，请输入1");
		System.out.println("进货，请输入2");
		System.out.println("销售，请输入3");
		System.out.println("查看库存，请输入4");
		System.out.println("退出功能，请输入5");


	}

	@Override
	public void addShop(ArrayList<Shop> arrayList, Scanner sc) {
		// TODO Auto-generated method stub

		String s = sc.nextLine();
		String[] a = s.split(s);
		if (a.length !=3) {
			System.out.println("你输入的信息不正确，请重新输入");
		} else {
			Shop shop = new Shop(a[0], a[1], Double.parseDouble(a[2]),
					Long.parseLong(a[3]));
			arrayList.add(shop);
			System.out.println(shop.toString());

		}

	}

	@Override
	public void stockshop(ArrayList<Shop> arrayList, Scanner sc) {
		// TODO Auto-generated method stub

		String[] a = sc.nextLine().split(",");
		boolean is = false;
		if (a.length != 2) {
			System.out.println("你输入的信息不正确，请重新输入");
		} else {
			for (Shop shop : arrayList) {
				if (shop.getId().equals(a[0])) {
					long number = shop.getNumber();
					long newnumber = number + Long.parseLong(a[1]);
					shop.setNumber(newnumber);
					System.out.println(shop.toString());
					is = true;
				}
			}
		}
		if (!is) {
			System.out.println("进货失败");
		}
	}

	@Override
	public void sellshop(ArrayList<Shop> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String[] a = sc.nextLine().split(",");
		boolean is = false;
		if (a.length != 2) {
			System.out.println("售货失败，请重新输入");
		} else {
			for (Shop shop : arrayList) {
				if (shop.getId().equals(a[0])) {
					if (shop.getNumber() > Long.parseLong(a[1])) {
						long newnumber = shop.getNumber()
								- Long.parseLong(a[1]);
						shop.setNumber(newnumber);

						System.out.println(shop.toString());
						is = true;
					}
				}
			}

		}
		if (!is) {
			System.out.println("销售失败");
		}

	}

	@Override
	public void infoshop(ArrayList<Shop> arrayList) {
		// TODO Auto-generated method stub

		for (Shop shop : arrayList) {
			System.out.println(shop.toString());
		}

	}

}
