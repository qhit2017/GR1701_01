package whh;

public class Ten {
	public static void main(String[] args) {
		System.out.println("³Ë·¨¿Ú¾÷±í");
		int a = 1;

		do {
			int b = 1;
			do {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
			} while (b <= a);
			a++;
			System.out.println();
		} while (a <= 9);
	}

}
