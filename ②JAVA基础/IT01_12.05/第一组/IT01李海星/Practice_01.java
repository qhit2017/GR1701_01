package Practice130;

import java.util.ArrayList;
import java.util.Scanner;


public class Practice_01 {

	public static void main(String[] args) {

		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		IEmployeeTest emp = new IEmployeeTest();
		Scanner sc = new Scanner(System.in);
		boolean isExit = true;
		String a = null;
		while (isExit) {
			switch (a) {
			case "Quit":
				isExit = false;
				System.out.println("See you next time");
				break;

			case "Add":
				emp.addEmployee(arrayList, sc);
				break;
				
			case "Remove":
				emp.removeEmployee(arrayList, a);
				break;
				
			case "Set":
				emp.setEmployee(arrayList, sc);
				break;
				
			case "Find":
				emp.findEmployee(arrayList, a);
				break;
			default:
				System.out.println("请输入正确信息");
				break;
			}
		}
	}
}
