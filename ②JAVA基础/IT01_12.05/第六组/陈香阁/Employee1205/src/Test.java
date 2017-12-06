import java.util.ArrayList;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {

		ScoreEmployee scoreEmployee = new ScoreEmployee();

		ArrayList<Employee> arrayList = new ArrayList<Employee>();

		Scanner sc = new Scanner(System.in);

		boolean bo = true;

		scoreEmployee.info();

		while (bo) {

			int i = sc.nextInt();

			switch (i) {
			case 1:
				scoreEmployee.zhenEmployee(arrayList, sc);
				break;
			case 2:
				System.out.println("请输入被删除人的姓名");
				scoreEmployee.shanEmployee(arrayList, sc);
				break;
			case 3:
				System.out.println("请输入被修改人的姓名");
				scoreEmployee.gaiEmployee(arrayList, sc);
				break;
			case 4:
				System.out.println("请输入被查找人的姓名");
				scoreEmployee.chaEmployee(arrayList, sc);
				break;
			case 5:
				scoreEmployee.xiansiEmployee(arrayList);
				break;
			case 6:
				bo = false;
				break;

			default:
				System.out.println("输入有误");
				break;
			}
		}
		System.out.println("再见");

		sc.close();
	}
}
