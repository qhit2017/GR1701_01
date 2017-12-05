package com.bean;

import java.util.ArrayList;

import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion.Setting;

public class SF implements Iscor {
	public void caidan() {
		System.out.println("主菜单界面");
		System.out.println("[1]输入成绩");
		System.out.println("[2]查询");
		System.out.println("[3]查询");
		System.out.println("[4]");
		System.out.println("[5]退出请按5");

	}

	public void zcaidan() {
		System.out.println("子菜单界面");
		System.out.println("[1]查询总分最高分请按1");
		System.out.println("[2]查询数学最高分请按2");
		System.out.println("[3]查询语文最高分请按3");
		System.out.println("[4]查询英语最高分请按4");
		System.out.println("[5]退出请按5");
	}

	@Override
	public void addF(ArrayList<F> ArrayList, F sc) {
		// 增加
		String s = sc.next();
		String[] a = s.split(",");
		F f = new F();
		f.setName(a[0]);
		f.setNumber(a[1]);
		f.setMathematical(Double.parseDouble(a[2]));
		f.setLanguage(Double.parseDouble(a[3]));
		f.setEnglishperformance(Double.parseDouble(a[4]));
		ArrayList.add(f);
	}

	@Override
	public void infoF(ArrayList<F> ArrayList) {
		// 遍历
		for (int i = 0; i < ArrayList.size(); i++) {
			F f = ArrayList.get(i);
			String string = f.toString();
			System.out.println(string);
		}

	}

	public double getF(ArrayList<F> ArrayList, Setting equals) {

		// 排序

		for (int i = 0; i < ArrayList.size(); i++) {
			double max1 = ArrayList.get(i).getTotalpoints();
			if (ArrayList.get(i).getTotalpoints() > max1) {
				max1 = ArrayList.get(i).getTotalpoints();

			}
			System.out.println(max1);
		}
		return 0;
	}

	@Override
	public double getF(ArrayList<F> ArrayList, String subject) {
		// TODO Auto-generated method stub
		return 0;
	}

}
