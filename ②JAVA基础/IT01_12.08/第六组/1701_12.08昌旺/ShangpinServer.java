/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月7日 下午2:41:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package zk.qhit.com;

import java.util.ArrayList;
import java.util.Scanner;

public class ShangpinServer implements IShangpin {

	@Override
	public void help() {
		System.out.println("----超市管理系统----");
		System.out.println("1.请输入数据请按：1\n(格式如：编号,名称,价格,数量)");
		System.out.println("2.进货请输入：2\n(格式如：编号,进货数量)");
		System.out.println("3.减少销量请输入：3\n(格式如：编号，减少数量)");
		System.out.println("4.遍历请输入：4");
		System.out.println("5.退出请输入：5");

	}

	@Override
	public void addShangpin(ArrayList<Shangpin> arrayList, Scanner sc) {
		String string = sc.next();
		String[] s=string.split(",");
		if (s.length!=4) {
			System.out.println("你输入的数据不正确");
		} else {
		Shangpin shangpin = new Shangpin(s[0],s[1],Double.parseDouble(s[2]),Integer.parseInt(s[3]));
		arrayList.add(shangpin);
		System.out.println(shangpin.toString());
		}
		

	}

	@Override
	public void jinhuoShangpin(ArrayList<Shangpin> arrayList, Scanner sc) {
		String[] d = sc.next().split(",");
		boolean isq=true;
		if (d.length!=2) {
			System.out.println("你输入的数据不正确");
		}else{
		for (Shangpin shangpin : arrayList) {
			if (shangpin.getId().equals(d[0])) {
				int nubx=shangpin.getShuliang()+Integer.parseInt(d[1]);
				shangpin.setShuliang(nubx);
				System.out.println(shangpin.toString());
				isq=false;
			}
		}
		}
		if (isq) {
			System.out.println("进货失败");
		}
		}

	

	@Override
	public void chushoupin(ArrayList<Shangpin> arrayList, Scanner sc) {
		String[] d = sc.next().split(",");
		boolean isq=true;
		if (d.length!=2) {
			System.out.println("你输入的数据不正确");
		}else{
		for (Shangpin shangpin : arrayList) {
			if (shangpin.getShuliang()>Integer.parseInt(d[1])) {
				int rr=shangpin.getShuliang()-Integer.parseInt(d[1]);
				//int nubx=shangpin.getShuliang()+Integer.parseInt(d[1]);
				shangpin.setShuliang(rr);
				System.out.println(shangpin.toString());
				isq=false;
			}
		}
		}
		if (isq) {
			System.out.println("出售失败");
		}

	}

	@Override
	public void infoShangpin(ArrayList<Shangpin> arrayList) {
		for (Shangpin shangpin : arrayList) {
			System.out.println(shangpin.toString());
		}

	}

}
