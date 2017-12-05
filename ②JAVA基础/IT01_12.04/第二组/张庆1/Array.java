package zhangqing;

import java.util.ArrayList;
import java.util.Scanner;

public class Array implements Iarry {
	void Help(){
		System.out.println("-----HELP-----");
		System.out.println("（1）查最高分请输入1");
		System.out.println("（2）查数学最高分请输入2");
		System.out.println("（3）查语文最高分请输入3");
		System.out.println("（4）查英语最高分请输入4");
		System.out.println("（5）退出子菜单请输入5");
	}
	void help(){
		System.out.println("-----HELP-----");
		System.out.println("(1)查询个人信息请输入1");
		System.out.println("(2)打印所有信息请输入2");
		System.out.println("(3)进入子菜单请输入3");
		System.out.println("(4)退出请输入4");
	}

	@Override
	public void addStudend(ArrayList<Student> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		int length = a.length;
		if (a.length != 5) {
			System.out.println("你输入的信息不完整，请输入完整信息");
		} else {
			Student student = new Student();
			student.setName(a[0]);
			student.setId(a[1]);
			student.setMath(Double.parseDouble(a[2]));
			student.setChinese(Double.parseDouble(a[3]));
			student.setEnglish(Double.parseDouble(a[4]));

			arrayList.add(student);
			System.out.println(student.toString());
		}
	}

	@Override
	public void allStudent(ArrayList<Student> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Student student = arrayList.get(i);
			String string = student.toString();
			System.out.println(string);
		}

	}

	@Override
	public double getmax(ArrayList<Student> arrayList, String subject) {
		double max = 0;
		if (subject.equals("总成绩")) {
			max=arrayList.get(0).getSum();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getSum() > max) {
					max = arrayList.get(i).getSum();
				}
			}

		}if (subject.equals("数学")){
			max=arrayList.get(0).getMath();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMath() > max) {
					max = arrayList.get(i).getMath();
				}
			}
		
	}
		if (subject.equals("语文")){
			max=arrayList.get(0).getChinese();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getChinese() > max) {
					max = arrayList.get(i).getChinese();
				}
			}
		
	}
		if (subject.equals("英语")){
			max=arrayList.get(0).getEnglish();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglish() > max) {
					max = arrayList.get(i).getEnglish();
				}
			}
		
	}
		System.out.println(max);
		return max;

}}
