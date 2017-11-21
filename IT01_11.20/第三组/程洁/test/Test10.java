package test;

public class Test10 {
	public static void main(String[] args) {
		System.out.println("³Ë·¨¿Ú¾÷±í");
		int k = 1;

		do {
			int l = 1;
			do {
				System.out.print(k + "*" + l + "=" + k * l + "\t");
				l++;
			} while (l <= k);
			k++;
			System.out.println();
		} while (k <= 9);
	}
}