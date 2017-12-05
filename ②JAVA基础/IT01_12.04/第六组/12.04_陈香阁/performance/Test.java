package performance;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> arrayList = new ArrayList<Student>();
		ScoreService service = new ScoreService();
		boolean isQuit = true;
		int key = 0;
		
		while (isQuit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				service.addStudent(arrayList, sc);
				break;
				
			case 2:
				service.Student(arrayList);
				break;
				
			case 3:
				service.equals(arrayList);
				break;
				
			case 4:
				isQuit = false;
				break;

			default:
				break;
			}
		}
		System.out.println("ÍË³öÏµÍ³");
	}

}
