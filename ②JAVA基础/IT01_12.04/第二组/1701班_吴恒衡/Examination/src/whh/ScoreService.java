package whh;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:2421922506@QQ.com
 * @date    创建时间：2017年12月4日 上午9:01:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ScoreService implements IScore {
	public void info(){
		System.out.println("--成绩管理系统--");
		System.out.println("[1]录入考试信息请输出1");
		System.out.println("[2]显示考生信息请输出2");
		System.out.println("[3]查询最高分请输出3");
		System.out.println("[4]退出");
		
	}
	public void help(){
		System.out.println("---帮助---");
		System.out.println("[1]查询总成绩请输出1");
		System.out.println("[2]查询语文最高分请输出2");
		System.out.println("[3]查询数学最高分请输出3");
		System.out.println("[4]查询英语最高分请输出4");
		System.out.println("[5]返回主菜单请输出5");
	}

	@Override
	public void addStudy(ArrayList<Study> arrayList, Scanner sc) {
		 String s = sc.next();
		String []a = s.split(",");
		int length = a.length;
		if (length!=5) {
			System.out.println("你输入的信息不完整");
		} else {
			Study study = new Study( );
			study.setName(a[0]);
			study.setID(a[1]);
			study.setLanguageScore(Double.parseDouble(a[2]));
			study.setMathematicsScore(Double.parseDouble(a[3]));
			study.setEnglishScore(Double.parseDouble(a[4]));
			arrayList.add(study);
			this.infoStudy(arrayList);
		}
		
	}

	@Override
	public void infoStudy(ArrayList<Study> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Study study = arrayList.get(i);
			String string = study.toString();
			System.out.println(string);
		}
		
	}

	@Override
	public double maxstudy(ArrayList<Study> arrayList,String subject) {
		
		double max = 0;
		if (subject.equals("总成绩")) {
			 max = arrayList.get(0).getTotalScore();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getTotalScore()>max) {
					max = arrayList.get(i).getTotalScore();
				}
				
			}
		}
		if (subject.equals("语文")) {
			 max = arrayList.get(0).getLanguageScore();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getLanguageScore()>max) {
					max = arrayList.get(i).getLanguageScore();
				}
				
			}
		}
		if (subject.equals("数学")) {
			 max = arrayList.get(0).getMathematicsScore();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMathematicsScore()>max) {
					max = arrayList.get(i).getMathematicsScore();
				}
				
			}
		}
		if (subject.equals("英语")) {
			 max = arrayList.get(0).getEnglishScore();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglishScore()>max) {
					max = arrayList.get(i).getEnglishScore();
				}
				
			}
		}
		
		return max;
	}

}