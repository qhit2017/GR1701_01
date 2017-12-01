package Practice_1129;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		double [] x = {66,59,29,16,43,88,99};
		Scor scor = new Scor();
		scor.info();
		Scanner sc = new Scanner(System.in);
		boolean isQuit = true;
		String a;
		while (isQuit) {
			System.out.println("请输入下一个指令并按回车执行");
			a = sc.next();
		switch (a) {
		case "Sum":
			double sum = scor.sum(x);
			System.out.println("总成绩"+sum);
			break;
			
		case "Info":
			scor.Infor(x);
			break;
			
		case "Max":
			int max = (int) scor.max(x);
			System.out.println(max);
			break;
			
		case "Min":
			int min = (int) scor.min(x);
			System.out.println(min);
			break;
			
		case "Average":
			double average = scor.average(x);
			System.out.println(average);
			break;
			
		case "Score":
			scor.sort(x);
			
			break;
			
		case "Not":
			int b = scor.numberNot60(x);
			System.out.println("不及格人数："+b);
			break;
			
        case "Exit":
			isQuit = false;
			break;
		}
	}
		System.out.println("再见！！！");
}
}
