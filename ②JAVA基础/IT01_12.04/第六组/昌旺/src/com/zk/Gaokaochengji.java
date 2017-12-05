/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月4日 下午8:22:24 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package com.zk;

import java.util.ArrayList;
import java.util.Scanner;

public class Gaokaochengji implements Gaokao {
	void help1(){
		System.out.println("----主菜单----");
		System.out.println("[1]录入成绩1");
		System.out.println("[2]打印成绩2");
		System.out.println("[3]高分成绩3");
		System.out.println("[4]退出4");
	}
	void help2(){
		System.out.println("----子菜单----");
		System.out.println("[1]总分最高1");
		System.out.println("[2]语文最高2");
		System.out.println("[3]数学最高3");
		System.out.println("[4]英语最高4");
		System.out.println("[5]退出子5");
	}

	@Override
	public void addkaoshi(ArrayList<Kaoshi> arrayList, Scanner sc) {
		String s=sc.next();
		String[] a=s.split(",");
		Kaoshi ks = new Kaoshi();
		ks.setName(a[0]);
		ks.setId(a[1]);
		ks.setYu(Double.parseDouble(a[2]));
		ks.setShu(Double.parseDouble(a[3]));
		ks.setWai(Double.parseDouble(a[4]));
		arrayList.add(ks);
		inforkaoshi(arrayList);

	}

	@Override
	public void inforkaoshi(ArrayList<Kaoshi> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Kaoshi ks = arrayList.get(i);
			String st=ks.toString();
			System.out.println(st);
		}

	}

	@Override
	public void maxkaoshi(ArrayList<Kaoshi> arrayList,String subject) {
		double max=0;
		Kaoshi kaoshi = null;
		if (subject.equals("总分")) {
		for (int i = 0; i < arrayList.size(); i++) {
			max=arrayList.get(0).getZong();
			if (arrayList.get(i).getZong()>max) {
				max=arrayList.get(i).getZong();
				
			}
		}
		System.out.println(max);
		}
		if(subject.equals("语文")){
			for (int i = 0; i < arrayList.size(); i++) {
				max=arrayList.get(0).getYu();
				if (arrayList.get(i).getYu()>max) {
					max=arrayList.get(0).getYu();
				}
			}
			System.out.println(max);
		}
		if(subject.equals("数学")){
			for (int i = 0; i < arrayList.size(); i++) {
				max=arrayList.get(0).getShu();
				if (arrayList.get(i).getShu()>max) {
					max=arrayList.get(0).getShu();
				}
			}
			System.out.println(max);
		}
		if(subject.equals("外语")){
			for (int i = 0; i < arrayList.size(); i++) {
				max=arrayList.get(0).getWai();
				if (arrayList.get(i).getWai()>max) {
					max=arrayList.get(0).getWai();
				}
			}
			System.out.println(max);
		}
		
	}

}
