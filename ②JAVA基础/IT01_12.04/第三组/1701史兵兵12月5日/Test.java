package xcs;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.ws.Service;

public class Test {
	private static Scanner sc;
	private static boolean isSubouit=false;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> arrayList = new ArrayList<Student>();
		ScoreIservice service = new ScoreIservice();
		boolean isQuit = true;

		boolean isSubouit = false;
		int key;
		int ke;
		service.helpInfo();

		while (isQuit) {

			 key =sc.nextInt();
			switch (key) {

			case 1:
				service.addStudent(arrayList, sc);

				break;
			case 2:
				service.infoStudent(arrayList);
//subinfo
				break;
			case 3:
				service.helpSubInfo();
				boolean isSubQuit = true;
				ke= sc.nextInt();
				boolean isSubQuot = false;
				while (isSubQuot) {
					switch (ke) {
					case 1:
						service.getMax(arrayList, "总成绩");
						break;
					case 2:
						service.getMax(arrayList, "语文");
						break;
					case 3:
						service.getMax(arrayList, "数学");
						break;
					case 4:
						service.getMax(arrayList, "英语");
						break;
					case 5:
						isSubQuit = false;
						break;
					default:
						break;
					}

				}

				break;
			case 4:
				isQuit = false;

				break;

			default:
				break;
			}

		}

	}

}
