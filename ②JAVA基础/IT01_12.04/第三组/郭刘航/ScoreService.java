package ExamSystem;

import java.util.ArrayList;
import java.util.Scanner;

import javax.security.auth.Subject;

/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ScoreService implements IScore {
	void helpSubInfo(){
		System.out.println("最高分查询系统");
		System.out.println("[1]总成绩最高分请输入1");
		System.out.println("[2]语文最高分请输入2");
		System.out.println("[3]数学最高分请输入3");
		System.out.println("[4]英语最高分请输入4");
		System.out.println("[5]返回主菜单请输入5");
	}

	void helpInfo(){
		System.out.println("高分评价系统");
		System.out.println("[1]录入成绩请输入1");
		System.out.println("[2]查询成绩请输入2");
		System.out.println("[3]查询最高分请输入3");
		System.out.println("[4]退出系统请输入4");
	}
	@Override
	public void addScore(ArrayList<Student> arrayList, Scanner sc) {
		//1.通过键盘接收信息
		String s = sc.next();
		//2.拆分信息
		String []a = s.split(",");
		int lenth = a.length;
		if (lenth!=5) {
			System.out.println("You have been wrong.Please try again!!");
		} else {
			//3.实例化对象
			Student student = new Student();
			//4.设置信息
			student.setName(a[0]);
			student.setID(a[1]);
			student.setcGrade(Double.parseDouble(a[2]));
			student.setmGrade(Double.parseDouble(a[3]));
			student.seteGrade(Double.parseDouble(a[4]));
			//5.增加信息
			arrayList.add(student);
		}


	}

	@Override
	public void infoScore(ArrayList<Student> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Student x = arrayList.get(i);
			String y = x.toString();
			System.out.println(y);
		}

	}

	@Override
	public double getMax(ArrayList<Student> arrayList,String subject) {
		double max = 0;
		if (subject.equals("总成绩")) {
			max = arrayList.get(0).getTolGrade();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getTolGrade()>max) {
					max = arrayList.get(i).getTolGrade();	
		       }
			}
		}
		
		if (subject.equals("语文")) {
			max = arrayList.get(0).getcGrade();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getcGrade()>max) {
					max = arrayList.get(i).getcGrade();	
		       }
			}
		}
		
		if (subject.equals("数学")) {
			max = arrayList.get(0).getmGrade();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getmGrade()>max) {
					max = arrayList.get(i).getmGrade();	
		       }
			}
		}
		
		if (subject.equals("英语")) {
			max = arrayList.get(0).geteGrade();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).geteGrade()>max) {
					max = arrayList.get(i).geteGrade();	
		       }
			}
		}
		System.out.println(max);
		return max;
	}

}
