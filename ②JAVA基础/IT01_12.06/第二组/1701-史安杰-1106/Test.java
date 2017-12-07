import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Address> arrayList = new ArrayList<Address>();
		Scanner sc = new Scanner(System.in);
		Service a = new Service();
		Boolean isc = true;
		a.help();
		while (isc) {
			System.out.println("请输入一条语句，并按回车键");
			String key = sc.next();

			switch (key) {
			case "1":
				System.out.println("请输入您要录入的信息，并用逗号隔开");
				a.addAddr(arrayList, sc);

				break;

			case "2":
				a.infoAddr(arrayList);

				break;

			case "3":
				System.out.println("请输入您要搜索的名字");
				String name = sc.next();
				a.findByname(arrayList, name);

				break;

			case "4":
				System.out.println("请输入您要搜索的性别");
				String sex = sc.next();

				a.findBysex(arrayList, sex);

				break;

			case "5":
				System.out.println("请输入您要搜索的号码");
				String call = sc.next();
				a.findBycall(arrayList, call);

				break;

			case "6":
				isc = false;

				break;

			default:
				break;
			}

		}
		System.out.println("您已退出系统,拜拜啦！");

	}

}
