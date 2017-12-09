package shangpin;

import java.util.ArrayList;
import java.util.Scanner;

public class ShangPinScore implements IShangPin {

	//private static final Object shangpin = null;

	@Override
	public void helpInfo() {
		// TODO Auto-generated method stub

		System.out.println("帮助");
		System.out.println("【1】增加");
		System.out.println("【2】进货");
		System.out.println("【3】销售");
		System.out.println("【4】查询");
		System.out.println("【5】退出系统");
		

	}

	@Override
	public void addShangPin(ArrayList<ShangPin> arrayList, Scanner sc) {
		// TODO Auto-generated method stubs
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 4) {
			System.out.println("你输入的不正确，无法收录");

		} else {
			ShangPin shangPin = new ShangPin(a[0], a[1], Long.parseLong(a[2]),
					Long.parseLong(a[3]));
			arrayList.add(shangPin);
			System.out.println(shangPin.toString());

		}

	}

	@Override
	public void stockShangPin(ArrayList<ShangPin> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String[] a = sc.next().split(",");
		boolean isSuscc = false;
		if (a.length != 2) {
			System.out.println("你输入的不正确，无法收录");

		} else {
			for (ShangPin shangpin : arrayList) {
				if (shangpin.getId().equals(a[0])) {
					long shuliang = shangpin.getShuliang();
					long newShuLiang = shuliang + Long.parseLong(a[1]);
					shangpin.setShuliang(newShuLiang);
					System.out.println(shangpin.toString());
					isSuscc = true;

				}

			}

		}
		if (!isSuscc) {
			System.out.println("进货失败");

		}

	}

	@Override
	public void sellShangPin(ArrayList<ShangPin> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String[] a = sc.next().split(",");
		boolean isSuscc = false;
		if (a.length != 2) {
			System.out.println("你输入的不正确，无法收录");

		} else {
			for (ShangPin shangpin : arrayList) {
				if (shangpin.getShuliang() > Long.parseLong(a[1])) {
					long newShuLiang = shangpin.getShuliang()
							- Long.parseLong(a[1]);
					shangpin.setShuliang(newShuLiang);
					System.out.println(shangpin.toString());
					isSuscc = true;


				}
			}
		}
		if ( ! isSuscc) {
			System.out.println("销售失败");
			
			
		}

	}

	@Override
	public void infoShangPin(ArrayList<ShangPin> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		for (ShangPin shangPin : arrayList) {
			System.out.println(shangPin.toString());
		}

	}

	public static void main(String[] args) {
		System.out.println("请添加商品信息（格式为：001，xx，0000，xxxx）");
	}

}
