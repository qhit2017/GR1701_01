import java.util.ArrayList;
import java.util.Scanner;

/**
 * 作者：高洁 E-mail:740997177@qq.com 电话:17630520503
 * 
 * 创建时间：2017年12月5日 下午7:13:47
 */
public class ScoreEmployee implements IEmployee {

	@Override
	public void info() {
		System.out.println("————雇员成绩系统————");
		System.out.println("增加雇员信息请输入：1");
		System.out.println("删除雇员信息请输入：2");
		System.out.println("修改雇员信息请输入：3");
		System.out.println("查找雇员信息请输入：4");
		System.out.println("显示雇员信息请输入：5");
		System.out.println("退出请输入：6");

	}

	@Override
	public void zhenEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		System.out.println("请输入雇员信息");
		System.out.println("用,号隔开");
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length == 5) {
			Employee employee = new Employee(a[0], a[1],
					Double.parseDouble(a[2]), a[3], a[4]);

			arrayList.add(employee);

			System.out.println(employee.toString());
			System.out.println("添加成功");

		} else {
			System.out.println("输入有误");
		}

	}

	@Override
	public void shanEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		String namer = sc.next();

		for (int i = 0; i < arrayList.size(); i++) {
			Employee employee2 = arrayList.get(i);
			if (employee2.getName().equals(namer)) {
				arrayList.remove(i);
				System.out.println("删除成功");
				break;
			}

		}

	}

	@Override
	public void gaiEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		String name = sc.next();
		for (Employee employee : arrayList) {
			String name2 = employee.getName();
			if (name.equals(name2)) {

			}
		}

	}

	@Override
	public void chaEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		String name = sc.next();
		ArrayList<Employee> arrayList2 = new ArrayList<Employee>();
		for (Employee employee : arrayList) {
			String name2 = employee.getName();
			if (name.equals(name2)) {
				arrayList2.add(employee);
				System.out.println(arrayList2.toString());
				System.out.println("以为您找到");
			} else {
				System.out.println("输入错误");
			}
		}

	}

	@Override
	public void xiansiEmployee(ArrayList<Employee> arrayList) {
		for (Employee employee : arrayList) {
			System.out.println(employee.toString());
		}

	}

}
