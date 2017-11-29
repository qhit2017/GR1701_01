package whh;

public class SEVN {
	public static void main(String[] args) {
		int i = 0;
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {
				i++;
				System.out.print(a);
				System.out.print(b);
				System.out.print("\t");
				if (i % 6 == 0) {
					System.out.println();
				}
			}
		}
	}

}
