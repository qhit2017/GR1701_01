package machao;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreService implements Iscore {

	public void helpinfo(){
			System.out.println("-----欢迎使用高考分数管理模拟系统-----");
			System.out.println("[1]录入考试信息请输入1");
			System.out.println("[2]显示所有信息请输入2");
			System.out.println("[3]进入最高分查询系统请输入3");
			System.out.println("[4]退出系统请输入4");
		}
		public void helpsubinfo(){
			System.out.println("-----欢迎使用最高分分数查询系统-----");
			System.out.println("[1]打印总分最高分");
			System.out.println("[2]打印语文最高分");
			System.out.println("[3]打印数学最高分");
			System.out.println("[4]打印英语最高分");
			System.out.println("[5]返回至上一层请输入5");
		}
		public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
			String s = sc.next();

			String[] a = s.split(",");
			if (a.length != 5) {
				System.out.println("您输入的有误，请重新输入！");
			} else {
				Student student = new Student();
				student.setName(a[0]);
				student.setId(a[1]);
				student.setChineseScore(Double.parseDouble(a[2]));
				student.setMathScore(Double.parseDouble(a[3]));
				student.setEnglishScore(Double.parseDouble(a[4]));
				arrayList.add(student);

			}

		}
		
	

	@Override
	public void infostudent(ArrayList<Student> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Student student = arrayList.get(i);
			String string = student.toString();
			System.out.println(string);
		}

	}

		
	

	@Override
	public double getMax(ArrayList<Student> arrayList, String Subject) {
		double Max = 0;
		if (Subject.equals("总成绩")) {
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getTotleScore() > Max) {
					Max = arrayList.get(i).getTotleScore();
				}
			}
			if (Subject.equals("语文成绩")) {
			}
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getChineseScore() > Max) {
					Max = arrayList.get(i).getChineseScore();
				}
			}
			if (Subject.equals("数学成绩")) {
			}
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMathScore() > Max) {
					Max = arrayList.get(i).getMathScore();
				}
			}
			if (Subject.equals("语文成绩")) {
			}
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglishScore() > Max) {
					Max = arrayList.get(i).getEnglishScore();
				}
			}
		}

		return Max;
		
	}

}
