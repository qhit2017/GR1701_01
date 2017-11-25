package zhudiping;


public class Haskell1 {
	public static void main(String[] args) {
		int a = 1;
		while (a <= 9) {
			int b = 1;
			while (b <= a) {
				System.out.print(a + "*" + b+ "=" + a * b + "\t");
				b++;
			}
			System.out.println();
			a++;
		}

	}

}
