package zhangqing;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Array student = new Array();
		Scanner sc = new Scanner(System.in);
		boolean issmall = true;
		boolean is = false;
		student.help();
		int a = 0;

		while (issmall) {
			System.out.println("请按提示输入你所想查询的信息，进行下一步请按回车键");
			a = sc.nextInt();

			switch (a) {
			case 1:
				System.out.println("请输入姓名，id，数学成绩，语文成绩，英语成绩");
				student.addStudend(arrayList, sc);
				break;
			case 2:
				student.allStudent(arrayList);
				break;
			case 3:
				is = true;
				System.out.println("你已进入子菜单");
				student.Help();
				while (is) {

					a = sc.nextInt();
					switch (a) {
					case 1:
						student.getmax(arrayList, "总成绩");

						break;
					case 2:
						student.getmax(arrayList, "数学");
						break;
					case 3:
						student.getmax(arrayList, "语文");
						break;
					case 4:
						student.getmax(arrayList, "英语");
						break;
					case 5:
						is = false;
						break;

					default:
						System.out.println("请输入正确指令");
						
						break;
					}
				}
				System.out.println("你已退出子菜单,进入主菜单");
				student.help();
				break;
			case 4:
				issmall = false;
				break;

			default:
				System.out.println("请输入正确指令");
				break;
			}
		}
		System.out.println("see  you  late");

	}

}
