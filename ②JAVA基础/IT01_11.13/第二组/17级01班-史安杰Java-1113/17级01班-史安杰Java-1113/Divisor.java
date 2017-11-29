package commodity;

public class Divisor{
	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {

			int tem = 0;

			for (int a = 1; a < i; a++) {

				if (i % a== 0) {

					tem += a;
				}
			}

			if (tem == i) {

				System.out.println(i);

			}
		}
	}

}
