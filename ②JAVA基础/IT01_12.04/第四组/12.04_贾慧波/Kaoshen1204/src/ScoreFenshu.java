import java.util.ArrayList;
import java.util.Scanner;

public class ScoreFenshu implements IFenshu {

	@Override
	public void in() {
		System.out.println("————高考成绩系统————");
		System.out.println("[1]、录入成绩请输入1");
		System.out.println("[2]、查询所有成绩信息请输入2");
		System.out.println("[3]、查询最高分请输入3");
		System.out.println("[4]、退出请输入4");

	}

	public void info() {
		System.out.println("————最高分系统————");
		System.out.println("[1]、查询总分最高分请输入1");
		System.out.println("[2]、查询语文最高分请输入2");
		System.out.println("[3]、查询数学最高分请输入3");
		System.out.println("[4]、查询英语最高分请输入4");
		System.out.println("[5]、返回上一层请输入5");

	}

	@Override
	public void addFenshu(ArrayList<Kaoshen> arrayList, Scanner sc) {

		System.out.println("请输入学生成绩信息用逗号隔开,格式为：姓名，编号，语文成绩，数学成绩，英语成绩");

		String s = sc.next();

		String[] a = s.split("，");

		if (a.length != 5) {
			System.out.println("你输入的信息不对");

		} else {

			Kaoshen kaoshen = new Kaoshen(a[0], a[1], Double.parseDouble(a[2]),
					Double.parseDouble(a[3]), Double.parseDouble(a[4]));

			arrayList.add(kaoshen);
			System.out.println(kaoshen.toString());
			System.out.println("添加成功");
		}

	}

	@Override
	public void infoFenshu(ArrayList<Kaoshen> arrayList) {

		for (int i = 0; i < arrayList.size(); i++) {

			Kaoshen kaoshen = arrayList.get(i);

			String string = kaoshen.toString();

			System.out.println(string);

		}

	}

	@Override
	public double setMAXFenshu(ArrayList<Kaoshen> arrayList, String sc) {
		Kaoshen kaoshen = null;

		double max = 0;
		// 总分最大值
		String scc = sc;
		switch (scc) {

		case "总成绩":

			max = arrayList.get(0).getTotalPoints();

			for (int i = 1; i < arrayList.size(); i++) {

				if (arrayList.get(i).getTotalPoints() > max) {

					max = arrayList.get(i).getTotalPoints();

				}

			}
			for (int i = 0; i < arrayList.size(); i++) {
				if (max == arrayList.get(i).getTotalPoints()) {
					kaoshen = arrayList.get(i);

				}

			}
			System.out.println(kaoshen);
			System.out.println(max);
			System.out.println("总成绩");

			break;
		case "语文":

			max = arrayList.get(0).getLanguagee();
			for (int i = 1; i < arrayList.size(); i++) {

				if (arrayList.get(i).getLanguagee() > max) {

					max = arrayList.get(i).getLanguagee();
				}

			}
			for (int i = 0; i < arrayList.size(); i++) {
				if (max == arrayList.get(i).getLanguagee()) {
					kaoshen = arrayList.get(i);

				}

			}
			System.out.println(kaoshen);
			System.out.println(max);
			System.out.println("语文成绩");

			break;
		case "数学":

			max = arrayList.get(0).getMathematics();
			for (int i = 1; i < arrayList.size(); i++) {

				if (arrayList.get(i).getMathematics() > max) {

					max = arrayList.get(i).getMathematics();
				}

			}
			for (int i = 0; i < arrayList.size(); i++) {

				if (max == arrayList.get(i).getMathematics()) {
					kaoshen = arrayList.get(i);

				}

			}
			System.out.println(kaoshen);
			System.out.println(max);
			System.out.println("数学成绩");

			break;
		case "英语":

			max = arrayList.get(0).getEnglish();
			for (int i = 1; i < arrayList.size(); i++) {

				if (arrayList.get(i).getEnglish() > max) {

					max = arrayList.get(i).getEnglish();
				}

			}
			for (int i = 0; i < arrayList.size(); i++) {
				if (max == arrayList.get(i).getEnglish()) {
					kaoshen = arrayList.get(i);

				}

			}
			System.out.println(kaoshen);
			System.out.println(max);
			System.out.println("英语成绩");

			break;

		default:

			System.out.println("输入有误");

			break;
		}

		return max;
	}

}
