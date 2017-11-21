public class O119 {
	public static void main(String[] args) {
		int i = 0;
		for (int a = 100; a < 1000; a++) {
			if (a % 10 == 6 && a % 3 == 0) {
				System.out.println(a);
				i++;
			}
		}
		System.out.println("¹²ÓÐ"+i+"¸ö");

	}

}
