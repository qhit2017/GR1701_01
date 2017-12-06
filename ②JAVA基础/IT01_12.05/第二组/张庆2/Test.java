package zhangqing;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Emploee> arrayList = new ArrayList<Emploee>();
		Array emploee = new Array();
		emploee.help();
		boolean issmall = true;
		while (issmall) {
			System.out.println("请按照提示查询你所想查找的信息，进行下一步请按回车键");
			String key = sc.next();
			switch (key) {
			case "add":
				System.out.println("请输入姓名，ID，薪水，入职时间，部门");
				emploee.addstemp(arrayList, sc);
				break;
			case "remove":
				
				break;
			case "all":
				emploee.allEmploee(arrayList);
				break;
			case "set":

				break;
			case "find":
				emploee.findstemp(arrayList, sc);
				break;
			case "exit":
				issmall=false;
				break;
			default:
				System.out.println("请输入正确指令");
				break;
			}
		}
		System.out.println("see you late");

	}

}
