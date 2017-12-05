package liuyancong;

import java.util.ArrayList;
import java.util.Scanner;

/*Author：刘龑聪
 E-mail：15539919713@163.com
 */
public class ExamSystemService implements IExamSystem {

	@Override
	public void help1() {
		System.out
				.println("-----高考评分模拟系统-----" + "\n(1).录入考生信息请输入1"
						+ "\n(2).查看所有信息请输入2" + "\n(3).查询最高分请输入3"
						+ "\n(4).退出模拟系统请输入4\n");
	}

	@Override
	public void help2() {
		System.out.println("-----最高分查询系统-----" + "\n(1).查询总分最高分请输入1"
				+ "\n(2).查询数学最高分请输入2" + "\n(3).查询语文最高分请输入3"
				+ "\n(4).查询英语最高分请输入4" + "\n(5).退出模拟系统请输入5\n");
	}

	@Override
	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		System.out.println("请输入考生信息！" + "\n格式：姓名,编号,数学,语文,英语"
				+ "\n!!中间以    逗号, 隔开!!");
		String s = sc.next();
		String[] st = s.split(",");
		if (st.length != 5) {
			System.out.println("输入错误，请核实格式是否正确！");
		} else {
			Student student = new Student(st[0], st[1],
					Double.parseDouble(st[2]), Double.parseDouble(st[3]),
					Double.parseDouble(st[4]));
			arrayList.add(student);
			System.out.println("录入成功！");
		}

	}

	@Override
	public void infoStudent(ArrayList<Student> arrayList) {

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());
		}

	}

	@Override
	public void MaxScore(ArrayList<Student> arrayList, Scanner sc) {
		this.help2();
		boolean isQuit = true;
		while (isQuit) {
			System.out.println("请输入指令并按Enter键！");
			double max = 0;
			int k = sc.nextInt();
			switch (k) {
			case 1:
				for (int i = 0; i < arrayList.size(); i++) {
					max = arrayList.get(i).getTotleScore();
				}
				System.out.println(max);
				break;

			case 2:
				for (int i = 0; i < arrayList.size(); i++) {
					max = arrayList.get(i).getMathScore();
				}
				System.out.println(max);
				break;
			case 3:
				for (int i = 0; i < arrayList.size(); i++) {
					max = arrayList.get(i).getChineseScore();
				}
				System.out.println(max);
				break;
			case 4:
				for (int i = 0; i < arrayList.size(); i++) {
					max = arrayList.get(i).getEnglishScore();
				}
				System.out.println(max);
				break;
			case 5:
				isQuit = false;
				this.help1();
				break;
			default:
				System.out.println("请输入正确的指令");
				break;
			}
		}
	}

}
