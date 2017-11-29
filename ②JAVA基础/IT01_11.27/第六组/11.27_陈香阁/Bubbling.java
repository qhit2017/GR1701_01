import java.util.Arrays;


public class Bubbling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a = { 11, 22, 33, 44, 55, 66 };

			int b = 0;

			for (int j = 0; j < a.length - 1; j++) {

				for (int i = 0; i < a.length - 1; i++) {

					if (a[i] > a[i + 1]) {

						b = a[i];

						a[i] = a[i + 1];

						a[i + 1] = b;

					}

				}
				System.out.println(Arrays.toString(a));
			}
		}

	}