package liuyancong;

import java.util.ArrayList;
import java.util.Scanner;

/*Author：刘龑聪
  E-mail：15539919713@163.com
 */
public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ExamSystemService e = new ExamSystemService();
		ArrayList<Student> arrayList = new ArrayList<Student>();
		
		boolean isExit = true;
		e.help1();
		while (isExit) {

			System.out.println("请输入指令并按Enter键！");
			
			int k = sc.nextInt();
			switch (k) {

			case 1:
				e.addStudent(arrayList, sc);
				break;

			case 2:
				e.infoStudent(arrayList);
				break;
				
			case 3:
				e.MaxScore(arrayList, sc);
				break;
				
			case 4:
				isExit = false;
				break;
				
			default:
				System.out.println("请输入正确的指令");
				break;
			}
		}
		System.out.println("谢谢使用，再见！");
	}
}
