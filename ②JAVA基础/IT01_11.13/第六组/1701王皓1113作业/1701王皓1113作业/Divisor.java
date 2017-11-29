package WangHao;

public class Divisor{
	public static void main(String[] args) {
		for (int a = 2; a < 1000; a++) {

			int tem = 0;

			for (int b = 1; b < a; b++) {

				if (a % b== 0) {

					tem += b;
				}
			}

			if (tem == a) {

				System.out.println(a);

			}
		}
	}

}
