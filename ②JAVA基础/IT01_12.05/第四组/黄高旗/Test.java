import java.util.ArrayList;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		//创建一个ArrayList用于存储雇员信息
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		//创建一个实现类对象用以操作或调用增删改查的方法
		EmployeeArrsyList emp = new EmployeeArrsyList(); 
		Scanner sc = new Scanner(System.in);
		boolean isQuit = true;
		emp.helpInfo();
		String key;
		String name;
		while (isQuit) {
			key = sc.next();
			switch (key) {
			case "Quit":
				isQuit = false;
				break;
			
			case "Add":
				emp.addEmployee(arrayList, sc);
				emp.infoArrayListEmployee(arrayList);
				break;
				
			case "Remove":
				name = sc.next();
				emp.removeEmployee(arrayList, name);
				break;
			
			case "Set":
				emp.setEmployee(arrayList, sc);
				break;
				
			case "Find":
				Employee e;
				name = sc.next();
				e = emp.findEmployee(arrayList, name);
				System.out.println("----找到此人，信息如下：");
				System.out.println(e.toString());
				break;
			
			default:
				
				break;
			}
		}
	}

}
