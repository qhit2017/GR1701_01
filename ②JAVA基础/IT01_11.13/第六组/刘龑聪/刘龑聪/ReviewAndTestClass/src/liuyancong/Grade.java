package liuyancong;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		
			System.out.print("ÇëÊäÈë·ÖÊý£º");
			Scanner sc = new Scanner(System.in);
			int grade = sc.nextInt();

			System.out.println(grade >= 90 ? "A" : grade >= 60 ? "B" : "C");
			sc.close();
	}
}
