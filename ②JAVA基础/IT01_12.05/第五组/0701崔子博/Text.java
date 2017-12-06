package whh;

import java.util.ArrayList;
import java.util.Scanner;

public class Text {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		ArrayService  array = new ArrayService();
		array.info();
		String s;
		boolean isquit = true;
		while (isquit) {
			s = sc.next();
			switch (s) {
			case "Add":
				
				array.addArray(arrayList, sc);
				break;
			case "Remove":
				
				break;
			case "Set":
		
				break;
			case "Find":
		
				break;
			case "Exit":
				isquit = false;
				break;
			

			default:
				break;
			}
		}
		
	}

}
